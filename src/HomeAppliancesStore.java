import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;

public class HomeAppliancesStore extends JFrame{
    static String companyName;
    static String companyLocation;
    static int employeeCount;
    public static String getCompanyName(){
        return companyName;
    }
    public static void setCompanyName(String name){
        companyName = name;
    }
    public static String getCompanyLocation(){
        return companyLocation;
    }
    public static void setCompanyLocation(String location){
        companyLocation = location;
    }
    public static int getEmployeeCount(){
        return employeeCount;
    }
    public static void setEmployeeCount(int count){
        employeeCount = count;
    }

    public static String textareaText = "Available Devices:";
    public static Fridge[] fridgeArray = {};
    public static Oven[] ovensArray = {};
    public static WashingMachine[] washingMachinesArray = {};
    public static AirCondition[] airConditionsArray = {};

    public static void main(String[] args){
        JFrame f;
        f=new JFrame();
        JFrame ff;
        ff = new JFrame();
        JLabel text1 = new JLabel("Fridges: ");
        f.add(text1);
        JTextField field1 = new JTextField(20);
        f.add(field1);
        f.add(new JLabel("Washing Machines: "));
        JTextField field2 = new JTextField(20);
        f.add(field2);
        f.add(new JLabel("Ovens: "));
        JTextField field3 = new JTextField(20);
        f.add(field3);
        f.add(new JLabel("Air Conditions: "));
        JTextField field4 = new JTextField(20);
        f.add(field4);
        JButton b = new JButton("Submit");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int fridgesCount = 0;
                int washingMachinesCount = 0;
                int ovensCount = 0;
                int airConditionsCount = 0;
                if (field1.getText().isEmpty() != true) {
                    fridgesCount = Integer.parseInt(field1.getText());
                    if (fridgesCount >= 1) {
                        fridgeArray = createFridges(fridgesCount);
                        textareaText = textareaText + "\nFridges: " + fridgeArray[0].getObjectCount();
                    }
                }
                if (field2.getText().isEmpty() != true) {
                    washingMachinesCount = Integer.parseInt(field2.getText());
                    if (washingMachinesCount >= 1) {
                        washingMachinesArray = createWashingMachines(washingMachinesCount);
                        textareaText = textareaText + "\nWashing Machines: " + washingMachinesArray[0].getObjectCount();
                    }
                }
                if (field3.getText().isEmpty() != true) {
                    ovensCount = Integer.parseInt(field3.getText());
                    if (ovensCount >= 1) {
                        ovensArray = createOvens(ovensCount);
                        textareaText = textareaText + "\nOvens: " + ovensArray[0].getObjectCount();
                    }
                }
                if (field4.getText().isEmpty() != true) {
                    airConditionsCount = Integer.parseInt(field4.getText());
                    if (airConditionsCount >= 1) {
                        airConditionsArray = createAirConditions(airConditionsCount);
                        textareaText = textareaText + "\nAir Conditions: " + airConditionsArray[0].getObjectCount();
                    }
                }
                JTextArea textarea=new JTextArea(textareaText);
                textarea.setBounds(10,30, 200,200);
                ff.add(textarea);
                f.setVisible(false);
                ff.setVisible(true);
            }
        });
        f.add(b);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);


        ff.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ff.setSize(200,200);
        ff.setLocationRelativeTo(null);
        ff.setVisible(false);
    }

    public static Fridge[] createFridges (int fridgesCount){

        Fridge fridgeArray[] = new Fridge[fridgesCount];
        if (fridgesCount > 0) {
            for (int i = 0; i <= fridgesCount - 1; i++) {
                fridgeArray[i] = new Fridge();
            }
            System.out.println("Fridges Created: " + fridgeArray[0].getObjectCount());
        }
        return fridgeArray;
    }

    public static Oven[] createOvens (int ovensCount){
        Oven ovensArray[] = new Oven[ovensCount];
        if (ovensCount > 0) {
            for (int i = 0; i <= ovensCount - 1; i++) {
                ovensArray[i] = new Oven();
            }
            System.out.println("Ovens Created: " + ovensArray[0].getObjectCount());
        }
        return ovensArray;
    }

    public static AirCondition[] createAirConditions (int airConditionsCount){
        AirCondition airConditionsArray[] = new AirCondition[airConditionsCount];
        if (airConditionsCount > 0) {
            for (int i = 0; i <= airConditionsCount - 1; i++) {
                airConditionsArray[i] = new AirCondition();
            }
            System.out.println("Air Conditions Created: " + airConditionsArray[0].getObjectCount());
        }
        return airConditionsArray;
    }

    public static WashingMachine[] createWashingMachines (int washingMachinesCount){
        WashingMachine washingMachinesArray[] = new WashingMachine[washingMachinesCount];
        if (washingMachinesCount > 0) {
            for (int i = 0; i <= washingMachinesCount - 1; i++) {
                washingMachinesArray[i] = new WashingMachine();
            }
            System.out.println("Washing Machines Created: " + washingMachinesArray[0].getObjectCount());
        }
        return washingMachinesArray;
    }


    public static int readFile(String file, String devicetype) throws FileNotFoundException{
        File myObj = new File(file);
        Scanner s = new Scanner(myObj);
        while(s.hasNextLine()) // Checks if there is another line
        {
            Scanner check = new Scanner(s.nextLine());
            while(check.hasNext()){
                if(check.next().equals(devicetype)){
                    int returnNum =  check.nextInt();
                    return returnNum;
                }
            }
        }
        return 0;
    }


    public static void deviceStatus(Device device){
        System.out.println("Device is active?: " + device.status());
        if (device instanceof Fridge) {
            System.out.println("This device is a fridge");
        } else if (device instanceof Oven){
            System.out.println("This device is an oven");
        } else if (device instanceof WashingMachine){
            System.out.println("This device is a washing machine");
        } else if (device instanceof AirCondition){
            System.out.println("This device is an air condition");
        }
    }

    public static void Serialize(Fridge[] fridges, Oven[] ovens, AirCondition[] airConditions, WashingMachine[] washingMachines){
        try
        {
            FileOutputStream fos = new FileOutputStream("serializedObjects.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fridges);
            oos.writeObject(ovens);
            oos.writeObject(airConditions);
            oos.writeObject(washingMachines);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

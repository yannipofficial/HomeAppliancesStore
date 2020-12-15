import java.io.*;
import java.util.Scanner;

public class HomeAppliancesStore {
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
    public static void main(String[] args) throws FileNotFoundException{

        int fridgesCount = readFile("devicelist.txt", "Fridge");
        Fridge fridgeArray[] = new Fridge[fridgesCount];
        if (fridgesCount > 0) {
            for (int i = 0; i <= fridgesCount - 1; i++) {
                fridgeArray[i] = new Fridge();
            }
            System.out.println("Fridges Created: " + fridgeArray[0].getObjectCount());
        }

        int ovensCount = readFile("devicelist.txt", "Oven");
        Oven ovensArray[] = new Oven[ovensCount];
        if (ovensCount > 0) {
            for (int i = 0; i <= ovensCount - 1; i++) {
                ovensArray[i] = new Oven();
            }
            System.out.println("Ovens Created: " + ovensArray[0].getObjectCount());
        }

        int airConditionsCount = readFile("devicelist.txt", "AirCondition");
        AirCondition airConditionsArray[] = new AirCondition[airConditionsCount];
        if (airConditionsCount > 0) {
            for (int i = 0; i <= airConditionsCount - 1; i++) {
                airConditionsArray[i] = new AirCondition();
            }
            System.out.println("Air Conditions Created: " + airConditionsArray[0].getObjectCount());
        }

        int washingMachinesCount = readFile("devicelist.txt", "WashingMachine");
        WashingMachine washingMachinesArray[] = new WashingMachine[washingMachinesCount];
        if (washingMachinesCount > 0) {
            for (int i = 0; i <= washingMachinesCount - 1; i++) {
                washingMachinesArray[i] = new WashingMachine();
            }
            System.out.println("Washing Machines Created: " + washingMachinesArray[0].getObjectCount());
        }

        Serialize(fridgeArray, ovensArray, airConditionsArray, washingMachinesArray);
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

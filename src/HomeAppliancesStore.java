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
    public static void main(String[] args){
        Fridge product1 = new Fridge(60,70,30,"LG","FreezePro","Fridge",180,80,5,true,true,true);
        WashingMachine product2 = new WashingMachine(60,80,60,"Samsung","WashPro","Washing Machine",250,40,5,200,46,true);
        AirCondition product3 = new AirCondition(80,40,30,"Philips","CoolPro","Air Conditioner",400,15000,45,10,false,true);
        Oven product4 = new Oven(100,120,100,"LG","CookPro","Oven",350,45,10,true,true,false);
        Fridge product5 = new Fridge(60,70,30,"Samsung","FreezeProPlus","Fridge",180,80,5,true,true,true);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
        product4.printProduct();
        product5.printProduct();

        //Adding up the total products of each category
        int TotalProducts = product1.getObjectCount() + product2.getObjectCount() + product3.getObjectCount() + product4.getObjectCount();
        System.out.println("Total Products: " + TotalProducts);

        deviceStatus(product1);

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

}

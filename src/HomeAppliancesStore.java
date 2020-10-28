public class HomeAppliancesStore {
    static String companyName;
    static String companyLocation;
    static Integer employeeCount;

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
    public static Integer getEmployeeCount(){
        return employeeCount;
    }
    public static void setEmployeeCount(Integer count){
        employeeCount = count;
    }
    public static void main(String args[]){
        setCompanyName(args[0]);
        setCompanyLocation(args[1]);
        setEmployeeCount(Integer.parseInt(args[2]));
        System.out.print("Company name: "+getCompanyName());
        System.out.print(" Company location: "+getCompanyLocation());
        System.out.print(" Employees: "+getEmployeeCount());
    }

}

import java.io.Serializable;
public class AirCondition extends Device  implements Serializable{
    private int Width;
    private int Height;
    private int Depth;
    private String Manufacturer;
    private String ProductName;
    private String ProductType;
    private int EnergyConsumption;

    private int BTUPower;
    private int NoiseLevel;
    private int Programs;
    private boolean isPortable;
    private boolean hasDisplayScreen;

    static int ObjectCount = 0;
    public AirCondition(){
        ObjectCount = ObjectCount + 1;
    }
    public AirCondition(int w,int h,int d,String manu,String name,String type,int energy,int power,int noise,int progs,boolean portable,boolean screen){
        this.Width = w;
        this.Height = h;
        this.Depth = d;
        this.Manufacturer = manu;
        this.ProductName = name;
        this.ProductType = type;
        this.EnergyConsumption = energy;
        this.BTUPower = power;
        this.NoiseLevel = noise;
        this.Programs = progs;
        this.isPortable = portable;
        this.hasDisplayScreen = screen;
        ObjectCount = ObjectCount + 1;
    }
    //Getters
    public int getBTUPower(){ return BTUPower; }
    public int getNoiseLevel(){ return NoiseLevel; }
    public int getPrograms(){ return Programs; }
    public boolean getIsPortable(){ return isPortable; }
    public boolean getHasDisplayScreen(){ return hasDisplayScreen; }

    //Setters
    public void setBTUPower(int v){ this.BTUPower = v; }
    public void setNoiseLevel(int v){ this.NoiseLevel = v; }
    public void setPrograms(int v){ this.Programs = v; }
    public void setIsPortable(boolean v){ this.isPortable = v; }
    public void setHasDisplayScreen(boolean v){ this.hasDisplayScreen = v; }

    public int getObjectCount() { return ObjectCount;}

    public void printProduct(){
        System.out.println("-------");
        System.out.println("Product Type: "+this.ProductType);
        System.out.println("Product Name: "+this.Manufacturer+" "+this.ProductName);
        System.out.println("Dimensions: "+this.Width+"cm x "+this.Height+"cm x "+this.Depth + "cm");
        System.out.println("Energy Consumption: "+this.EnergyConsumption+"kWh per year.");
        System.out.println("Power: "+this.BTUPower+"BTU. Programs:"+this.Programs+". Is Portable: "+this.isPortable);
        System.out.println("Noise: "+this.NoiseLevel + "db. Has Display: "+this.hasDisplayScreen);
        System.out.println("-------");
    }

}

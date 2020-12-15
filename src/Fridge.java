import java.io.Serializable;
public class Fridge extends Device implements Serializable{
    private int Width;
    private int Height;
    private int Depth;
    private String Manufacturer;
    private String ProductName;
    private String ProductType;
    private int EnergyConsumption;

    private int Capacity;
    private int TemperatureSettings;
    private boolean hasFreezer;
    private boolean hasAntiFrost;
    private boolean hasAutoTemperatureControl;

    static int ObjectCount = 0;
    public Fridge(){
        ObjectCount = ObjectCount + 1;
    }
    public Fridge(int w,int h,int d,String manu,String name,String type,int energy,int cap,int tempset,boolean freezer,boolean antifrost,boolean tempcontrol){
        this.Width = w;
        this.Height = h;
        this.Depth = d;
        this.Manufacturer = manu;
        this.ProductName = name;
        this.ProductType = type;
        this.EnergyConsumption = energy;
        this.Capacity = cap;
        this.TemperatureSettings = tempset;
        this.hasFreezer = freezer;
        this.hasAntiFrost = antifrost;
        this.hasAutoTemperatureControl = tempcontrol;
        ObjectCount = ObjectCount + 1;
    }
    //Getters

    public int getCapacity(){ return Capacity; }
    public int getTemperatureSettings(){ return TemperatureSettings; }
    public boolean getHasFreezer(){ return hasFreezer; }
    public boolean getHasAntiFrost(){ return hasAntiFrost; }
    public boolean getHasAutoTemperatureControl(){ return hasAutoTemperatureControl; }

    //Setters
    public void setCapacity(int v){ this.Capacity = v; }
    public void setTemperatureSettings(int v){ this.TemperatureSettings = v; }
    public void setHasFreezer(boolean v){ this.hasFreezer = v; }
    public void setHasAntiFrost(boolean v){ this.hasAntiFrost = v; }
    public void setHasAutoTemperatureControl(boolean v){ this.hasAutoTemperatureControl = v; }

    public static int getObjectCount() { return ObjectCount;}

    public void printProduct(){
        System.out.println("-------");
        System.out.println("Product Type: "+this.ProductType);
        System.out.println("Product Name: "+this.Manufacturer+" "+this.ProductName);
        System.out.println("Dimensions: "+this.Width+"cm x "+this.Height+"cm x "+this.Depth + "cm");
        System.out.println("Energy Consumption: "+this.EnergyConsumption+"kWh per year.");
        System.out.println("Capacity: "+this.Capacity+"lt. Temperature Settings:"+this.TemperatureSettings+" settings. Has Freezer: "+this.hasFreezer);
        System.out.println("Has AntiFrost: "+this.hasAntiFrost + ". Has Auto Temperature Control: "+this.hasAutoTemperatureControl);
        System.out.println("-------");
    }
}

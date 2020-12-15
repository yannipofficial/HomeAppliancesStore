import java.io.Serializable;
public class WashingMachine extends Device implements Serializable {
    private int Width = 100;
    private int Height = 120;
    private int Depth = 60;
    private String Manufacturer = "0lit";
    private String ProductName = "WashPro";
    private String ProductType = "WashingMachine";
    private int EnergyConsumption = 200;

    private int Capacity = 40;
    private int Settings = 8;
    private int CyclesPerMinute = 250;
    private int NoiseLevel = 46;
    private boolean hasInverter = true;

    static int ObjectCount = 0;
    public WashingMachine(){
        ObjectCount = ObjectCount + 1;
    }
    public WashingMachine(int w,int h,int d,String manu,String name,String type,int energy,int cap,int set,int cycles,int noise,boolean inverter){
        this.Width = w;
        this.Height = h;
        this.Depth = d;
        this.Manufacturer = manu;
        this.ProductName = name;
        this.ProductType = type;
        this.EnergyConsumption = energy;
        this.Capacity = cap;
        this.Settings = set;
        this.CyclesPerMinute = cycles;
        this.NoiseLevel = noise;
        this.hasInverter = inverter;
        ObjectCount = ObjectCount + 1;
    }
    //Getters
    public int getCapacity(){ return Capacity; }
    public int getSettings(){ return Settings; }
    public int getCyclesPerMinute(){ return CyclesPerMinute; }
    public int getNoiseLevel(){ return NoiseLevel; }
    public boolean getHasInverter(){ return hasInverter; }

    //Setters
    public void setCapacity(int v){ this.Capacity = v; }
    public void setSettings(int v){ this.Settings = v; }
    public void setCyclesPerMinute(int v){ this.CyclesPerMinute = v; }
    public void setNoiseLevel(int v){ this.NoiseLevel = v; }
    public void setHasInverter(boolean v){ this.hasInverter = v; }

    public int getObjectCount() { return ObjectCount;}

    public void printProduct(){
        System.out.println("-------");
        System.out.println("Product Type: "+this.ProductType);
        System.out.println("Product Name: "+this.Manufacturer+" "+this.ProductName);
        System.out.println("Dimensions: "+this.Width+"cm x "+this.Height+"cm x "+this.Depth + "cm");
        System.out.println("Energy Consumption: "+this.EnergyConsumption+"kWh per year.");
        System.out.println("Capacity: "+this.Capacity+"lt. Settings:"+this.Settings+" settings. Cycles/Minute: "+this.CyclesPerMinute);
        System.out.println("Noise: "+this.NoiseLevel + "db. Has Inverter: "+this.hasInverter);
        System.out.println("-------");
    }
}

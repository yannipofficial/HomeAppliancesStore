public class Oven extends Device{
    private int Width;
    private int Height;
    private int Depth;
    private String Manufacturer;
    private String ProductName;
    private String ProductType;
    private int EnergyConsumption;

    private int Capacity;
    private int TemperatureSettings;
    private boolean hasAirFryer;
    private boolean hasCoilBurners;
    private boolean hasTimer;

    static int ObjectCount = 0;
    public Oven(){}
    public Oven(int w,int h,int d,String manu,String name,String type,int energy,int cap,int tempset,boolean airfryers,boolean coils,boolean timer){
        this.Width = w;
        this.Height = h;
        this.Depth = d;
        this.Manufacturer = manu;
        this.ProductName = name;
        this.ProductType = type;
        this.EnergyConsumption = energy;
        this.Capacity = cap;
        this.TemperatureSettings = tempset;
        this.hasAirFryer = airfryers;
        this.hasCoilBurners = coils;
        this.hasTimer = timer;
        ObjectCount = ObjectCount + 1;
    }
    //Getters
    public int getCapacity(){ return Capacity; }
    public int getTemperatureSettings(){ return TemperatureSettings; }
    public boolean getHasAirFryer(){ return hasAirFryer; }
    public boolean getHasCoilBurners(){ return hasCoilBurners; }
    public boolean getHasTimer(){ return hasTimer; }

    //Setters
    public void setCapacity(int v){ this.Capacity = v; }
    public void setTemperatureSettings(int v){ this.TemperatureSettings = v; }
    public void setHasAirFryer(boolean v){ this.hasAirFryer = v; }
    public void setHasCoilBurners(boolean v){ this.hasCoilBurners = v; }
    public void setHasTimer(boolean v){ this.hasTimer = v; }

    public int getObjectCount() { return ObjectCount;}

    public void printProduct(){
        System.out.println("-------");
        System.out.println("Product Type: "+this.ProductType);
        System.out.println("Product Name: "+this.Manufacturer+" "+this.ProductName);
        System.out.println("Dimensions: "+this.Width+"cm x "+this.Height+"cm x "+this.Depth + "cm");
        System.out.println("Energy Consumption: "+this.EnergyConsumption+"kWh per year.");
        System.out.println("Capacity: "+this.Capacity+"lt. Temperature Settings:"+this.TemperatureSettings+" settings. Has Air Fryer: "+this.hasAirFryer);
        System.out.println("Has Coil Burners: "+this.hasCoilBurners + ". Has Timer: "+this.hasTimer);
        System.out.println("-------");
    }
}


public class AirCondition {
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
    public AirCondition(){}
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
    public int getWidth(){ return Width; }
    public int getHeight(){ return Height; }
    public int getDepth(){ return Depth; }
    public String getManufacturer(){ return Manufacturer; }
    public String getProductName(){ return ProductName; }
    public String getProductType(){ return ProductType; }
    public int getEnergyConsumption(){ return EnergyConsumption; }
    public int getBTUPower(){ return BTUPower; }
    public int getNoiseLevel(){ return NoiseLevel; }
    public int getPrograms(){ return Programs; }
    public boolean getIsPortable(){ return isPortable; }
    public boolean getHasDisplayScreen(){ return hasDisplayScreen; }

    //Setters
    public void setWidth(int v){ this.Width = v; }
    public void setHeight(int v){ this.Height = v; }
    public void setDepth(int v){ this.Depth = v; }
    public void setManufacturer(String v){ this.Manufacturer = v; }
    public void setProductName(String v){ this.ProductName = v; }
    public void setProductType(String v){ this.ProductType = v; }
    public void setEnergyConsumption(int v){ this.EnergyConsumption = v; }
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
    private void periodicMaintenance(){
    }
}

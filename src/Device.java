public abstract class Device implements DeviceBasic {
    private int Width;
    private int Height;
    private int Depth;
    private boolean status;
    private String Manufacturer;
    private String ProductName;
    private String ProductType;
    private int EnergyConsumption;

    //getter
    public int getWidth(){ return Width; }
    public int getHeight(){ return Height; }
    public int getDepth(){ return Depth; }
    public String getManufacturer(){ return Manufacturer; }
    public String getProductName(){ return ProductName; }
    public String getProductType(){ return ProductType; }
    public int getEnergyConsumption(){ return EnergyConsumption; }

    //setter
    public void setWidth(int v){ this.Width = v; }
    public void setHeight(int v){ this.Height = v; }
    public void setDepth(int v){ this.Depth = v; }
    public void setManufacturer(String v){ this.Manufacturer = v; }
    public void setProductName(String v){ this.ProductName = v; }
    public void setProductType(String v){ this.ProductType = v; }
    public void setEnergyConsumption(int v){ this.EnergyConsumption = v; }

    //status
    public boolean status(){
        return status;
    }
    public void powerOn() {
        status = true;
    }
    public void powerOff() {
        status = false;
    }
    public int periodicMaintenance(){
        return 0;
    }
}

package PC.BuildMyPc;

public class Monitor {
    private String Manufacturer;
    private String Model;
    private Resolution resolution;
    private int Rate;
    private double ScreenSize;


    public Monitor(String manufacturer, String model, Resolution resolution, int rate, double screenSize) {
        Manufacturer = manufacturer;
        Model = model;
        this.resolution = resolution;
        Rate = rate;
        ScreenSize = screenSize;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Manufacturer:" + Manufacturer + '\n' + " Model:" + Model + '\n' + "resolution:" + resolution + '\n' + "RefreshRate:" + Rate + '\n' + " ScreenSize:" + ScreenSize + '\n';
    }
}

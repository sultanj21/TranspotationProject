package PC.BuildMyPc;


public class Case {
    private String model;
    private String brand;
    private String matirial;
    private Dimension dimension;

    public Case(String model, String brand, String matirial, Dimension dimension){
        this.brand = brand;
        this.dimension = dimension;
        this.matirial =matirial;
        this.model= model;
    }
    public void pressPowerButton(){
        System.out.println("press the power button");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMatirial() {
        return matirial;
    }

    public void setMatirial(String matirial) {
        this.matirial = matirial;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "model :" + model + '\n'+  "brand:" + brand + '\n' + "matirial:" + matirial + '\n' + " dimension:" + dimension + '\n';
    }
}

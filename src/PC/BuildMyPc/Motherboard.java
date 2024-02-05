package PC.BuildMyPc;

public class Motherboard {
    private String Brand;
    private int NumberOfMemory;
    private int NumberOfPciSlots;


    public Motherboard(String brand, int numberOfMemory, int numberOfPciSlots) {
        Brand = brand;
        NumberOfMemory = numberOfMemory;
        NumberOfPciSlots = numberOfPciSlots;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getNumberOfMemory() {
        return NumberOfMemory;
    }

    public void setNumberOfMemory(int numberOfMemory) {
        NumberOfMemory = numberOfMemory;
    }

    public int getNumberOfPciSlots() {
        return NumberOfPciSlots;
    }

    public void setNumberOfPciSlots(int numberOfPciSlots) {
        NumberOfPciSlots = numberOfPciSlots;
    }

    @Override
    public String toString() {


        return " Motherboard : " + '\n' +"Brand : " + Brand + '\n' + "NumberOfMemory : " + NumberOfMemory + '\n' + " NumberOfPciSlots :" + NumberOfPciSlots + '\n';
    }
}

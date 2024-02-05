package PC.BuildMyPc;

public class Dimension {
    private double height;
    private double width;
    private double depth;


    public Dimension(double hieght, double width, double depth){
        this.depth=depth;
        this.height=hieght;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return  "Dimension : " + "(height : " + height + " width : " + width  + "depth : " + depth +')';
    }
}

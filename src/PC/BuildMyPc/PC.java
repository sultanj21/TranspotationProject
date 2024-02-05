package PC.BuildMyPc;

public class PC {
    private Monitor monitor;
    private Motherboard motherboard;
    private Case TheCase;

    public PC(Case TheCase, Monitor monitor,Motherboard motherboard){
        this.TheCase = TheCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getTheCase(){
        return TheCase;

    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setTheCase(Case theCase) {
        TheCase = theCase;
    }

    @Override
    public String toString() {

        return  '\n' + "monitor : "+'\n' + monitor  + '\n' + motherboard + '\n' + "TheCase:" + '\n' + TheCase;

    }
}

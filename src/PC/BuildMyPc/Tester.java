package PC.BuildMyPc;
public class Tester {
    public static void main(String[] args) {

        Dimension MyCaseD = new Dimension(19.0,17.0,8.25);
        Resolution MymMonitorR = new Resolution(1920,1080);


        Case MyCase = new Case("G345","PowerSpec","Steel,Glass",MyCaseD);
        MyCase.pressPowerButton();
        Monitor MyMonitor = new Monitor("Samsung","Ucurved Screen",MymMonitorR,75,32.0);
        Motherboard MyMotherBoard = new Motherboard("ASRock Z490 Phantom",5,3);

        PC MyPC = new PC(MyCase,MyMonitor,MyMotherBoard);
        System.out.println(MyPC);
    }

}

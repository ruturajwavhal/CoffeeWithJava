package interfaces.appliance;
//class implementing appliance interface
public class Microwave implements Appliance{
    //Microwave turn on
    @Override
    public void turnOn() {
        System.out.println("Microwave is on");
    }
    //Microwave turn off
    @Override
    public void turnOff() {
        System.out.println("Microwave is off");

    }
    //Microwave in running stage
    @Override
    public void runCycle() {
        System.out.println("Microwave is runing ...");
    }
}

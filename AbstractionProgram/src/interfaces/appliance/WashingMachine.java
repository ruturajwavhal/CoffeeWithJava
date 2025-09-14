package interfaces.appliance;

public class WashingMachine implements Appliance{
    @Override
    public void turnOn() {
        System.out.println("Washing machine is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is off");

    }

    @Override
    public void runCycle() {
        System.out.println("Washing machine is runing ...");
    }

}

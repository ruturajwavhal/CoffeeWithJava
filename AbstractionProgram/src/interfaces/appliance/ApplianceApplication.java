package interfaces.appliance;

public class ApplianceApplication {
    public static void main(String[] args) {
        //instance of Dishwasher class
        Appliance dish = new DishWasher();
        dish.turnOn();
        dish.turnOff();
        dish.runCycle();

        System.out.println("-------------------------");
        //instance of microwave class
        Appliance microwave = new Microwave();
        microwave.turnOn();
        microwave.turnOff();
        microwave.runCycle();

        System.out.println("--------------------------");
        //instance of WashingMachine class
        Appliance washingMachine = new WashingMachine();
        washingMachine.turnOn();
        washingMachine.turnOff();
        washingMachine.runCycle();
    }


}

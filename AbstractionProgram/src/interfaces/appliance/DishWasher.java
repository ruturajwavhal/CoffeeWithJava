package interfaces.appliance;
//class implementing Appliance interface
public class DishWasher implements Appliance{
    //Dishwasher is on
    @Override
    public void turnOn() {
        System.out.println("Dish washer is on");
    }
    //Dishwasher is off
    @Override
    public void turnOff() {
        System.out.println("Dish washer is off");

    }
    //Dishwasher in running stage
    @Override
    public void runCycle() {
        System.out.println("Dish washer is runing ...");
    }


}

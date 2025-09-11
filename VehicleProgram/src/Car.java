public class Car extends Vehicle{
    /**
     * Here we're initializing a data member and parameterised constructor and in constructor
     * we used super keyword to call a Vehicle class constructor
     */
    public int numOfSeats;

    public Car(int numOfSeats, String brand, int speed){
        super(brand, speed);
        this.numOfSeats = numOfSeats;
    }

    /**
     * Below method displays the Car Information
     */
    public void displayCarInfo(){
        System.out.println("Car brand : " + brand + "\nCar Speed : " + speed + "\nSeat Capacity : " + numOfSeats);
    }
}

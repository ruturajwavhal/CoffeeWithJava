public class Bike extends Vehicle{
    /**
     * Here we're initializing a data member and parameterised constructor and in constructor
     * we used super keyword to call a Vehicle class constructor
     */
    public int numOfSeats;
    public Bike(int numOfSeats, String brand, int speed){
        super(brand, speed);
        this.numOfSeats = numOfSeats;
    }

    public void displayBikeInfo(){
        System.out.println("Bike brand : " + brand + "\nBike Speed : " + speed + "\nSeat Capacity : " + numOfSeats);
    }
}

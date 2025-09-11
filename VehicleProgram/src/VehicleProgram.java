public class VehicleProgram {
    public static void main(String[] args) {
        /**
         * Here we're Creating object of bike and car class which both extending vehicle class
         * and then we are calling method to display bike and car info
         */

        Bike b = new Bike(2, "Hero", 110);
        b.displayBikeInfo();

        System.out.println("-----------------------");

        Car c = new Car(4, "Suzuki", 180);
        c.displayCarInfo();

    }
}

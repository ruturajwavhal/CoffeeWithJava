package abstraction.iooperation;

public class CsvFile extends File{

    /**
     * this class extends abstract class name file which contains two abstract method
     * and one non-abstract method
     */

    @Override
    public void write() {
        System.out.println("CSV File is writing on this device.....");
    }

    @Override
    public void move() {
        System.out.println("CSV File is moving on another device.....");
    }
}

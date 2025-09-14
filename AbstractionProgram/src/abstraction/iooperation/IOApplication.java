package abstraction.iooperation;

public class IOApplication {
    public static void main(String[] args) {

        File file1 = new CsvFile();
        file1.read();
        file1.write();
        file1.move();

        System.out.println("\n--------------------------\n");

        File file2 = new TextFile();
        file2.read();
        file2.write();
        file2.move();

    }
}

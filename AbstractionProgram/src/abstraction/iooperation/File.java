package abstraction.iooperation;

public abstract class File {

    /**
     * declare two abstract method and one non-abstract method and this class
     * is extended by two classes
     */
    public abstract void write();
    public abstract void move();
    public void read(){
        System.out.println("File is reading....");
    }
}

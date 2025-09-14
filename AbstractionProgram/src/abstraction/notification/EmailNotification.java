package abstraction.notification;

public class EmailNotification extends Notification{
    /**
     * In this class we extend one abstract class and in thatclass one abstract method is there
     * and that abstract method we implements here
     * @param to
     * @param msg
     */

    @Override
    public void sendMSG(String to, String msg) {
        System.out.println("'" + msg + "' is sending to " + to );
    }



}

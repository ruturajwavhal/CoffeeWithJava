package abstraction.notification;

public class WhatsAppNotification extends Notification{

    /**
     * In this class we extend one abstract class and in that class one abstract method is there
     * and that abstract method we implements here
     */

    public void sendMSG(String to, String msg) {
        System.out.println("'" + msg + "' is sending to " + to );
    }
}

package abstraction.notification;

public abstract class Notification {

    /**
     * We create a abstract method with two string arguments
     * @param to
     * @param msg
     */
    public abstract void sendMSG(String to, String msg);

    /**
     * Non-abstract method is initialized with two string argument
     * @param from
     * @param application
     */

    public void receivedNotification(String from ,String application){
        System.out.println(application + " Notification is received from " + from);
    }
}

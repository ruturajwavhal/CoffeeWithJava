package abstraction.notification;

public class NotoficationApplication {
    public static void main(String[] args) {

        Notification email = new EmailNotification();
        email.sendMSG("Sam@gmail.com", "Hello, Sam");
        email.receivedNotification("Ajit@gmail.com", "Email");
        System.out.println("-------------------------------------");
        Notification whatsApp = new WhatsAppNotification();
        email.sendMSG("981798434", "Hey.. whats app ?");
        email.receivedNotification("983749183", "Whats App");


    }
}

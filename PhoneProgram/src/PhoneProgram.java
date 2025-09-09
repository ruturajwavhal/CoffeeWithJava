public class PhoneProgram {
    public static void main(String args[])
    {
/**
In this program we're creating object of class and call methods in that
 */
        Phone p = new Phone("Samsung", "Jio", 987659898);
        p.getPhoneAndSimDetail();
        System.out.println("-----------------");
        p.sendSMS();
        System.out.println("-----------------");
        p.makeACall();
    }
}

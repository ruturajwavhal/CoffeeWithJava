public class main {
    public static void main(String args[])
    {

        Phone p = new Phone("Samsung", "Jio", 987659898);
        p.getPhoneAndSimDetail();
        System.out.println("-----------------");
        p.sendSMS();
        System.out.println("-----------------");
        p.makeACall();
    }
}

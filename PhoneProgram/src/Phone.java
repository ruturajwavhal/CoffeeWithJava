public class Phone {
    String phoneModel;
    String simBrand;
    long phoneNum;


    //Assigning values to the datamembers of a class using parameterizes constructor
    public Phone(String phoneModel,  String simBrand, long phoneNum)
    {
        this.phoneModel = phoneModel;
        this.simBrand = simBrand;
        this.phoneNum = phoneNum;
    }

    //In this Method we printing phone and sim details
    public void getPhoneAndSimDetail()
    {
        System.out.println("Phone Model is : " + phoneModel + "\nSim Brand : " + simBrand + "\nPhone Number : " + phoneNum);
    }

    //Sending SMS
    public void sendSMS()
    {
        System.out.println("Sending SMS......");
    }

    //making call
    public void makeACall()
    {
        System.out.println("Call is connecting......");
    }
}

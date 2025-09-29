package HashMapProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Creating a HashMap which storing student roll numbers and names.
        HashMap<Integer, String> hm = new HashMap();
        hm.put(101, "Sahil");
        hm.put(102, "Saurabh");
        hm.put(103, "Sanket");
        hm.put(104, "Sushant");

        System.out.println("Strored HashMap Values is : " + hm);

        //Retrieving a value from HashMap using a key.
        System.out.println(hm.get(101));
        System.out.println(hm.get(102));
        System.out.println(hm.get(103));
        System.out.println(hm.get(104));

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }



    }
}

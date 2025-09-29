package HashSetProgram;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //Creating arraylist of integers and Adding numbers in it.
        ArrayList <Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(20);
        numList.add(10);
        numList.add(30);
        numList.add(40);
        numList.add(30);

        System.out.println("ArrayList : "+numList);

        //creating new object of hashset of numList arraylist to remove duplicates
        HashSet<Integer> hs = new HashSet<>(numList);
        System.out.println("HashSet of ArrayList is : "+hs);


    }
}

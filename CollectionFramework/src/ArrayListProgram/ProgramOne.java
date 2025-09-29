package ArrayListProgram;

import java.util.ArrayList;
import java.util.Collections;
public class ProgramOne {
    public static void main(String[] args) {
        //Create an ArrayList of Strings called fruits
        ArrayList<String>fruits = new ArrayList<>();

        //Five Fruits name added
        fruits.add("Coconut");
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Peach");
        fruits.add("Lychee");
        System.out.println(fruits);

        //grapes added at index 2
        fruits.add(2, "Grapes");
        System.out.println(fruits);//[Coconut, Guava, Grapes, Lemon, Peach, Lychee]

        //Accesing index 3
        System.out.println(fruits.get(3));//Lemon

        //replacing index 1 with blueberry
        fruits.set(1,"Blueberry");
        System.out.println(fruits);

        //removing element at index 4
        fruits.remove(4);
        System.out.println(fruits);

        //removing apple form list
        fruits.remove("Apple");
        System.out.println(fruits);

        //checking in list mango is present or not
        System.out.println(fruits.contains("Mango"));//true

        //checking index of blueberry
        System.out.println(fruits.indexOf("Blueberry"));

        //printing size of list
        System.out.println("Size of list : "+fruits.size());

        //checking list is empty or not
        System.out.println(fruits.isEmpty());

        //sorting element in ascending order
        Collections.sort(fruits);
        System.out.println("In Ascending order : "+fruits);

        //sorting in descending order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("In Descending order : "+fruits);

        //we use for-each loop to print each element in the fruits list
        for (String str : fruits){
            System.out.println(str);
        }


        //creating new aaraylist
        ArrayList<String> vegitable = new ArrayList<>();
        vegitable.add("Tomato");
        vegitable.add("Potato");
        vegitable.add("Chilly");
        vegitable.add("Methi");

        //Adding vegitable list in fruits list at the end
        fruits.addAll(vegitable);
        System.out.println("Combined "+fruits);

        //removing all elements in list
        fruits.removeAll(fruits);
        System.out.println(fruits.isEmpty());//true

    }
}

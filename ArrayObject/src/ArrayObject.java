/**
 * created a one class which having one method that takes one argument and printing something in it
 */
class Animal {
    void eat(int num) {
        System.out.println("Animal " + num + " eats food.");
    }
}

public class ArrayObject {
        public static void main(String[] args) {
            /**
             * create array of animal class and then store instance of class in it
             * and using for loop we calling function in that class
             */
            Animal a1 = new Animal();
            Animal a2 = new Animal();
            Animal a3 = new Animal();
            Animal a4 = new Animal();
            Animal a5 = new Animal();

            Animal arr[] = new Animal[5];
            arr[0] = a1;
            arr[1] = a2;
            arr[2] = a3;
            arr[3] = a4;
            arr[4] = a5;

            for(int i = 0; i < arr.length; i++){
                arr[i].eat(i+1);
            }


        }

}

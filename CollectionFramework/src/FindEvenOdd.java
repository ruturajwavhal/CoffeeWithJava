public class FindEvenOdd {
    public static void main(String[] args) {
        int a = 10;
        //checking given number is even or odd
        String num = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(" a : " + a + " is " + num);
    }
}

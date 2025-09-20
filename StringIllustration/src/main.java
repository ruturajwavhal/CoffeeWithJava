import java.util.Locale;

public class main {
    public static void main(String[] args) {
        //Declare a String
        String str1 = "This is a String Variable";

        //1. Printing character at o position 0
        System.out.println(str1.charAt(0));

        //2. converting to lowercase
        System.out.println(str1.toLowerCase());

        //3. coverting to Uppercase
        System.out.println(str1.toUpperCase());

        //4. if String contains provided string then it gives true else false
        System.out.println(str1.contains("is"));

        //5. concatinating string values with existing value
        System.out.println(str1.concat(" str1"));

        //6. if string is empty it gives true else false
        System.out.println(str1.isEmpty());

        //7. if string is ending with 1 then it gives true else false
        System.out.println(str1.endsWith("e"));

        //8. if string is Starting with t then it gives true else false
        System.out.println(str1.endsWith("t"));

        //9. giving length of string
        System.out.println(str1.length());

        //10. Replacing old character with new character in a string
        String str2 =  str1.replaceAll("is", "@");
        System.out.println(str2);

        //11. spliting given string at space and stores in String array
        String[] newStr = str1.split(" ");
        for(int i = 0; i < newStr.length; i++)
            System.out.println("at position "+ i + " : " + newStr[i]);
        //12. removing empty space at the ending
        System.out.println(str1.trim());

    }
}

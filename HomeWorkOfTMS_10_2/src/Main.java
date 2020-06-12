import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task_1
        String str = "MyAdventureInBoBruisk";
        int a = str.indexOf("A");
        int b = str.lastIndexOf("B");
        String str1 = str.substring(a,b);

        System.out.println(str1);

        //Task_2
        str = "Military_industrial";
        char oldChar = str.charAt(3);
        char newChar = str.charAt(0);
        String str2 = str.replace(oldChar,newChar);
        System.out.println(str2);

        //Task_3
        String [] array = {"deed", "hallo", "noon", "dead", "level","Nun"};
        palindromeWriter(array);
    }

    public static void palindromeWriter(String [] ar) {
        for (String word : ar) {
            StringBuffer str = new StringBuffer(word);
            str.reverse();
            if (word.equals(str.toString())) System.out.println(word);
        }
    }

}

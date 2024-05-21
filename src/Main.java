import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("I am a programmer");
        System.out.println("I love java");
        System.out.println("Hello world!");

        // Variables
        int num = 1;
        int num1 = 3;
        int num2 = 4;

        // Data types
        // Non numeric
        char c = '=';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        // Numeric
        byte b = 5;
        System.out.println(b);

        short s = 3;
        System.out.println(s);

        int i = 25;
        System.out.println(i);

        long l = 300_0000000_000L;
        System.out.println(l);

        double d = 3.5;
        System.out.println(d);

        float f = 3.2f;
        System.out.println(f);


        // Strings
        String str = "I love Java";
        System.out.println(str);
        System.out.println(str.charAt(7)); // Indexing the string

        //Multiline strings
        String str1 = """
                I am a programmer
                I love Java
                Hello World
                """;
        System.out.println(str1);

        // Type casting
        long l1 = 5000L;
        int i1 = (int) l1; // converting l1 to int and storing it into i1

        // Constants
        final double PI = 3.14; // final is used to lock the value of a variable. we can't change the value again

        // Reading input
        /*
         Scanner class is mainly used to get values from the system console
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // Reads int value from the user and assign into x
        String str2 = sc.next();
        System.out.println(str1);


    }
}
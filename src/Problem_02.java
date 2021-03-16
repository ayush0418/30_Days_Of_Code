import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Problem_02 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int a = scan.nextByte();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();

        System.out.println(a+i);
        System.out.println(d+b);
        System.out.println(s+c);

        scan.close();
    }
}
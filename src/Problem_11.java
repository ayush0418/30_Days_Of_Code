import java.util.*;

public class Problem_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//Prints the binary number...

//        String bin = Integer.toBinaryString(n);
//        System.out.println(bin);
        int count =0;
        int tempCount = 0;

        while (n>0)
        {
            int remainder = n%2;
            n= n/2;
            if(remainder ==1) {
                tempCount++;
                if(tempCount>count) { count = tempCount; }
            }
            else {
                    tempCount = 0;
            }
        }
        System.out.println(count);
    }
}
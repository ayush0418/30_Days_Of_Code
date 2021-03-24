import java.util.*;

public class Problem_10 {

    static int factorial(int n) {
        int fact =1;
        for(int i=1;i<=n;i++){
            fact= fact*i;
        }
        return fact;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
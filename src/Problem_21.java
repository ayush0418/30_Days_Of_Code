import java.util.*;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int totalSwaps= 0;

        for(int i=0; i < n; i++) {
            a[i] = in.nextInt();
            for(int j=0;j < i;j++) {
                if (a[j] > a[i]) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                totalSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
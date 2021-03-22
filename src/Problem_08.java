import java.util.*;

public class Problem_08 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        for (int j = n-1; j >= 0; j--) {
            System.out.print(arr[j]+" ");
        }
    }
}

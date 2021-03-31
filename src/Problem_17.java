import java.util.*;

public class Problem_17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            System.out.println(Integer.parseInt(S));
        }
        catch (Exception e){
            System.out.println("Bad string");
        }
    }
}
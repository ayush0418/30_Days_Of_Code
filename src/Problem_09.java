import java.util.*;

public class Problem_09 {
    public static void main(String []argh){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>(); //

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }

        while(in.hasNext()){
            String s = in.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println( (phoneNumber != null) ? s + "=" + phoneNumber : "Not found" );
        }
        in.close();
    }
}

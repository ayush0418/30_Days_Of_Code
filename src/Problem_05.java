import java.util.*;

public class Problem_05 {
    private int age;

    public Problem_05(int initialAge) {
       if(initialAge < 0 ) {
           age = 0;
           System.out.println("Age is not valid, setting age to 0.");
       }
       else {
            age = initialAge;
       }
    }

    public void amIOld() {
        if(age<13)
            System.out.println("You are young.");
        if(age>=13 && age<18)
            System.out.println("You are a teenager.");
        if(age>=18)
            System.out.println("You are old.");
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Problem_05 p = new Problem_05(age);

            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
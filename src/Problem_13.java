import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson(){
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate(){
        int avg=0;
        for(int i=0;i<testScores.length;i++) {
            avg = avg + testScores[i];
        }
        avg = avg/(testScores.length);
        return(avg> 89 ?'O': avg>79 ? 'E' : avg > 69 ? 'A' : avg > 54 ? 'P' :avg > 39 ? 'D' : 'T' );

    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int idNumber = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];

        for(int i=0;i<numScores;i++){
            testScores[i] = sc.nextInt();
        }

        Student s = new Student(firstName,lastName,idNumber,testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
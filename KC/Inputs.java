package KC;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no.");
        int rollno=sc.nextInt();
        System.out.println("Your Roll no. is "+rollno);
        System.out.println("Please enter Name");
        String Name=sc.next();
        System.out.println("Your name is "+Name);
        System.out.println("Enter Your Marks");
        float marks=sc.nextFloat();
        System.out.println("Yours marks are "+marks);
        // boolean x=1;
        // System.out.println("boolean "+x);
    }
}

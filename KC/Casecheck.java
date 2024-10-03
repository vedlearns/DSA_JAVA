package KC;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
         char c=sc.next().trim().charAt(0);
//        System.out.println(sc.next());            This will directly take an input from user and print it agr upr wali line nhi hoti to
//       using Character Wrapper Class
        boolean ch=Character.isUpperCase(c);
        if(!ch){
            System.out.println("It's Lower Case ");
        }
        else {
            System.out.println("It is Upper Case ");
        }
        // Using Alphabet checking way
        System.out.println("Using Alphabet checking way");
        if(c>='a'&&c<='z'){
            System.out.println("It is Lower Case");
        }
        else {
            System.out.println("It is Upper Case");
        }
    }
}

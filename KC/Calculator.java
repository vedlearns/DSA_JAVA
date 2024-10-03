package KC;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println(" + - * % /   choose operator");
            char ch=sc.next().trim().charAt(0);
            System.out.println(" Enter Operands");
            int a=sc.nextInt();
            int b= sc.nextInt();
            switch(ch)
            {
                case '+':
                    System.out.println("Answer is "+(a+b));
                    break;
                case '-':
                    System.out.println("Answer is "+(a-b));
                    break;
                case '*':
                    System.out.println("Answer is "+(a*b));
                    break;
                case '%':
                    System.out.println("Answer is "+(a%b));
                    break;
                case '/':
                    System.out.println("Answer is "+(a/b));
                    break;
                default:
                    System.out.println("Invalid Operator ");
            }
            System.out.println("Do you want to Continue ? Type y/n");
            char ans=sc.next().trim().charAt(0);
            if(ans=='n'||ans=='N')
            {
                break;
            }

        }
        System.out.println("Thank You!");
    }
}


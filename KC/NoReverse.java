package KC;

import java.util.Scanner;

public class NoReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp>0)
        {
            int d=temp%10;
             rev=rev*10+d;
            temp=temp/10;
        }
        System.out.println("reverse of the number is "+ rev);
    }
}

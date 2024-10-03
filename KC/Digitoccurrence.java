package KC;

import java.util.Scanner;

public class Digitoccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. ");
        int n=sc.nextInt();
        System.out.println("enter the no you want occurrence of");
        int a=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp>0)
        {
            int t=temp%10;
            if(t==a)
                c++;
            temp=temp/10;
        }
        System.out.println("Occurrence of the is "+c);
    }
}

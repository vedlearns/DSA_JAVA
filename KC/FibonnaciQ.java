package KC;

import java.util.Scanner;

public class FibonnaciQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nth Element");
        int n=sc.nextInt();
        int a=0,i=1,count=2;
        while(count<=n)
        {
            int temp=i;
            i=i+a;
            a=temp;
            count++;
        }

        System.out.println(i);
    }
}

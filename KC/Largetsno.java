package KC;

import java.util.Scanner;

public class Largetsno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("\n");
        System.out.println("print 3 different no.");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int l=a;
        if(b>a)
            l=b;
        if (c>l)
            l=c;
        System.out.println("Largest no is "+l+"\n");
        System.out.println("using MAX functions");
        int max=Math.max(a,(Math.max(b,c)));
        System.out.println("max no is "+max);


    }
}

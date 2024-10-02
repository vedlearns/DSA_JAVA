package KC;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // float n1=sc.nextInt();               // IMPLICIT CONVERSION
        // System.out.println("n1 is "+n1);
        
        //Type Casting
        int num=(int)(68.25);           // EXPLICIT CONVERSION
        System.out.println(num); 

        //Automatic Type Promotion 
        
        //eg-1
        int a=257;
        byte b=(byte)a;                 // what this will store is 257%256 
        System.out.println(b);          // 1    // This will give wrong answer kyunki byte me max 256 store hoskta 257 exceedes , so 257%256 jo result ayega vo store hoga automatically by the java
        
        //eg-2
        byte c=50;
        byte d=40;
        byte e=100;
        int f=c*d/e;                    // yaha pe error isliye nhi ayega kyunki jo store hora vo ek int hai ,sari byte wali values apne app type promote hoke int me save hojaengi
        System.out.println(f);          // Correct answer
        
        //eg-3
        // byte b1=50;
        // b1=b1*2;    // this will give error  kyunki "2" is integer here aur multiply byte se hoke store ek byte me hoga , so error 

        //eg-4
        int num1='A';           // sirf CHAR ke store krega vo bhi single characters , String ke ek bhi nhi 
        System.out.println(num1);

        //eg-5
        // if we have multiple types , all of them will be converted to bigger one
        System.out.println(3*6.8594f);
        {
            byte b2=42;
            char c2='A';
            short s=1024;
            int i=20000;
            float f2=5.26f;
            double d2=0.21456;
            double result=(f2*b2)+(i/c2)-(d2-s);
            System.out.println((f2*b2)+" "+(i/c2)+" "+-(d2-s));     // original kaise hota
            System.out.println(result);                             // final result kaisa arha h
        }
    }
}
 
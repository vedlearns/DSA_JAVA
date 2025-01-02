import java.util.Scanner;

public class LoopP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
//        System.out.println("enter the other number");
//        int m=sc.nextInt();
//        digitNo(n);
//        digitSum(n);
//        digitRev(n);
//        patternSum(n);
//        factorial(n);
//        powerOfNum(n,m);
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
    }
    static void digitNo(int n){
        int t=n,c=0;
        while(t>0)
        {
            t=t/10;
            c++;
        }
        System.out.println("no of digits "+c);
    }
    static void digitSum(int n){
        int t=n,s=0;
        while(t>0)
        {
            int d=t%10;
            s=s+d;
            t=t/10;
        }
        System.out.println("Sum of the digits is "+ s);
    }
    static void digitRev(int n){
        int t=n;
        int rev=0;
        while(t>0)
        {
            rev=t%10+rev*10;
            t=t/10;
        }
        System.out.println("Digits reverse is "+rev);
    }
    static void patternSum(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2==0)
                sum-=i;
            else sum+=i;
        }
        System.out.println("sum of pattern is "+sum);
    }
    static void factorial(int n){
        int fact=1;
        while(n>0)
        {
            fact*=n;
            n--;
        }
        System.out.println("factorial is "+fact);
    }
    static void powerOfNum(int n,int m) {
        int s=1;
        for(int i=0;i<m;i++)
        {
            s*=n;
        }
        System.out.println("Raise to the power is "+s);
    }
    static void pattern1(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (i==0||j==0||i==n-1||j==n-1)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <n-1-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int i = 1; i <=n; i++) {
            int t=i;
            for (int j = 0; j <n; j++) {
                if(t==8)
                    t=1;
                System.out.print(t++);

            }

            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int i = 0; i <n; i++){
            for (int j = 0; j <n; j++) {
                if((i+j)%2==0)
                System.out.print("1");
                else System.out.print("2");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for (int i = 1; i <=n; i++){
            if(i==n) {
                for (int j = 0; j < n * 2 - 1; j++) {
                    System.out.print(n);
                }
            }
            else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    if (j == 1)
                        System.out.print(i);
                    else System.out.print(" ");
                }
                for (int j = i - 1; j >= 1; j--) {
                    if (j == 1)
                        System.out.print(i);
                    else System.out.print(" ");
                }

            }
            System.out.println();
        }

    }


}

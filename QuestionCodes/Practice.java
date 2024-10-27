package QuestionCodes;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Practice obj =new Practice();
        obj.p2();
    }
    void p1()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Month");
        int m=sc.nextInt();
        if (m>=3&&m<=5)
            System.out.println("Season:Spring");
        else if (m>=6&&m<=8) {
            System.out.println("Season:Summer");
        }
        else if (m>=9&&m<=11) {
            System.out.println("Season:Autumn");
        } else if (m==12||(m>=1&&m<=2)) {
            System.out.println("Season:Winter");
        }
        else
        {
            System.out.println("Invalid Month");
        }
    }
    void p2() //Minimum Sum
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array A");
        int N=sc.nextInt();
        int[] A=new int[N];
        int [] B=new int[N];
        System.out.println("Enter Element of A");
        for (int i = 0; i <N; i++) {
            A[i]= sc.nextInt();
        }
        System.out.println("Enter Element of B");
        for (int i = 0; i <N; i++){
            B[i]= sc.nextInt();
        }
        for(int i=0;i<N-1;i++){
            int min=i;
            for (int j = i+1; j <N; j++) {
                if (A[j]<A[min])
                    min=j;
            }
            int t=A[i];
            A[i]=A[min];
            A[min]=t;
        }
        for(int i=0;i<N-1;i++){
            int max=i;
            for (int j = i+1; j <N; j++) {
                if (B[j]>B[max])
                    max=j;
            }
            int t=B[i];
            B[i]=B[max];
            B[max]=t;
        }
        int sum=0;
        for (int i = 0; i <N; i++) {
            sum+=A[i]*B[i];
        }
        System.out.println(sum);
    }
    void p3() //Magic library
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int m= sc.nextInt();
        System.out.println("Enter No of Columns");
        int n= sc.nextInt();
        int [][]A=new int[m][n];
        int c=0,sum=0;

        System.out.println("Enter Elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                A[i][j]= sc.nextInt();
                if (A[i][j]%2==1)
                {
                    sum=sum+A[i][j];
                }
            }
            if (sum!=0&&sum%2==0)
            {
                c++;
            }
            sum=0;
        }
        System.out.println(c);
    }
    int p4()        //Knowledge Enhancement
    {
        Scanner sc=new Scanner(System.in);
        int []A=new int[100];
        System.out.println("Enter Size");
        int size=sc.nextInt();
        System.out.println("Enter Array");
        for (int i = 0; i < size; i++) {
            A[i]=sc.nextInt();
        }
        System.out.println("enter the number hours");
        int N=sc.nextInt();
        int mb=0;
        for (int i = 0; i < size-1; i++) {
            int min=i;
            for (int j = i+1; j < size; j++) {
                if (A[j]<A[min])
                    min=j;
            }
            int t=A[i];
            A[i]=A[min];
            A[min]=t;
        }
        int t=N;int i=0;
        if (A[0]<=t) {
            while (t > 0 && i < size) {

               if ((t = t - A[i])>=0)
                   mb++;
                i++;
            }
        }
        else return 0;
        return mb;
    }
    void p5()   //the distance
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input String");
        String S=sc.nextLine();
        char []A= S.toCharArray();
            int d=0;
        if(S.length()<=2)
            System.out.println("0");
        else {
            for (int i = 0; i <=S.length()/2; i++) {
                for (int j = S.length()-1; j >S.length()/2 ; j--) {
                    if (A[j]!=A[i])
                    {int t=j-i;
                        if (t>d)
                            d=t;
                    }
                }
            }
            System.out.println(d);
        }

    }
    void p6()  // Charity Event (Chocolate)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        int s=0;
        if(N%5==0)
        {
            s=3;
        }
        else s=1;
        for (int i = 2; i <=N; i++) {
            if ((i+1)%5==0||(i-1)%5==0)
            {
                s+=i+2;
            }
            else s+=i;

        }
        System.out.println(s);
    }
    void p7()       //Red Pen Green Pen
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer Value");
        int N=sc.nextInt();
        int []A=new int[N];
        char a,a1;
        System.out.println("Enter elements of the array");
        for (int i = 0; i < N; i++) {
            A[i]=sc.nextInt();
        }
        if (A[0]%2==0)
        {
            a1='r';
        }
        else
        {
            a1='g';
        }
        a=a1;
        int c=0;
        for (int i = 1; i < N; i++) {
            if (A[i] % 2 == 0) {
                a1 = 'r';
            } else {
                a1 = 'g';
            }
            if (a1 == 'r' && a == 'g') {
                c++;
            }
                a = a1;
        }
        System.out.println(c);
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    void p8()  //Library Exploration
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Shelves");
        int N=sc.nextInt();
        System.out.println("Enter the Max no of Books");
        int K=sc.nextInt();
        System.out.println("Enter Array Elements");
        int []A=new int[N];
        for (int i = 0; i <N; i++) {
            A[i]=sc.nextInt();
        }
        int nb=0;
        for (int i = 1; i <N; i++) {
            if (isPrime(i+1)){
                nb+=Math.min(A[i],K);
            }
        }
        System.out.println(nb);
    }
}

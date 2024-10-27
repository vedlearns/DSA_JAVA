package QuestionCodes;

import java.awt.*;
import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
        Problems obj=new Problems();
        obj.p3();
    }
    void p1() // Prime numbers which are lees than N & dont have 0
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        boolean []isprime=new boolean[N+1];
        isprime[0]=false;
        isprime[1]=false;
        for (int i = 2; i <=N; i++)
        {
           isprime[i]=true;
        }
        for (int p = 2; p*p <=N ; p++) {
            if(isprime[p])
            {
                for (int j = p*p; j <=N; j+=p) {
                    isprime[j]=false;
                }
            }
        }
        int count=0;
        for (int i = 2; i <=N; i++) {
            if(isprime[i])
            {
                int a=0;
                int t=i;
                while(t>0)
                {
                    if(t%10==0) {
                        a++;
                        break;
                    }
                    t=t/10;
                }
                if (a==0)
                    count++;
            }
        }
        System.out.println(count);
    }
   void p2()  // wap an array answer such that answer[i]= product of all elements except current index array
   {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
       int []a=new int[n];
       for (int i = 0; i <n; i++)
       {
        a[i]=sc.nextInt();
       }
      int []leftP=new int[n];
      int []rightP=new int[n];
      int []result=new int[n];
      leftP[0]=1;
       for (int i = 0; i <n; i++) {
           leftP[i]=leftP[i-1]*a[i-1];
       }
       rightP[n-1]=1;
       for (int i = n-2; i >=0 ; i--) {
           rightP[i]=rightP[i+1]*a[i+1];
       }
       for (int i = 0; i <n; i++) {
           result[i]=leftP[i]*rightP[i];
           System.out.print(result[i]);
       }
   }
   void p3()    // Hamming distance
   {
       Scanner sc= new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=n1^n2;
       int t=n3;
       int count=0;
       while(t>0)
       {
           if (t%2==1) {
               count++;
           }
               t=t/2;
       }
       System.out.println("Hamming distance is "+count+" "+n3);
   }
   void p4()
   {

   }
}

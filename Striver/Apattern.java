package Striver;

import java.util.Scanner;

public class Apattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apattern obj=new Apattern();
        obj.p22();
    }
    void p7()
    {
        for (int i = 0; i <5; i++)
        {
            for (int j = 0; j <5-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*i+1;j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
    }
    void p8()
    {
        for (int i = 5; i >0; i--)
        {
            for (int j = 0; j <5-i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*i-1;j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <5-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
    void p9()
    {
        for (int i = 0; i <5; i++)
        {
            for (int j = 0; j <5-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*i+1;j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        for (int i = 5; i >0; i--)
        {
            for (int j = 0; j <5-i ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*i-1;j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <5-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
    void p10()
    {
        for (int i = 1; i <5; i++)
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++)
        {
            for(int j = 0; j <5-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void p11()
    {
        int d=0;
        for (int i = 0; i < 5; i++)
        {
            if (i%2==0)
                d=1;
            else d=0;
            for (int j = 0; j <=i; j++)
            {
                System.out.print(d);
                if (d==1)
                    d=0;
                else d=1;
            }
            System.out.println();

        }
    }
    void p12()
    {
        for (int i = 1; i <5 ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(j);
            }
            for (int j = 0; j <5-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <5-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void p13()
    {
        int a=1;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j <=i; j++)
            {
                System.out.print((a++)+" ");
            }
            System.out.println();
        }
    }
    void p14()
    {
        for (int i = 0; i < 5; i++)
        {
            char a='A';
            for (int j = 0; j <=i; j++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
    void p15()
    {
        for (int i = 0; i < 5; i++)
        {
            char c='A';
            for (int j = 0; j <5-i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
    void p16()
    {
        char c='A';
        for (int i = 0; i <5; i++)
        {
            for(int j = 0; j <=i; j++)
            {
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
    }
    void p17()
    {
        for(int i = 0; i <4; i++)
        {
            char c='A';
            for (int j = 0; j <4-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <2*i+1 ; j++)
            {
                if(j<(2*i+1)/2)
                {
                    System.out.print(c++);
                }
                else
                    System.out.print(c--);
            }
            for (int j = 0; j <4-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    void p18()
    {
        for (int i = 0; i <5; i++)
        {
            int c=69-i;
            for (int j = 0; j <=i; j++)
            {
                System.out.print((char) c++);
            }
            System.out.println();
        }
    }
    void p19()
    {
        for (int i = 0; i <5; i++)
        {
            for (int j = 0; j <5-i; j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <5-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <5; i++)
        {
            for(int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            for(int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void p20()
    {
        for (int i = 0; i <5; i++) 
        {
            for (int j = 0; j <=i; j++) 
            {
                System.out.print("*");
            }
            for (int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <5-i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j <4-i; j++)
            {
                System.out.print("*");
            }
            for (int j = 0; j <=i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <4-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void p21()
    {
        for (int i = 0; i <4; i++)
        {
         if(i==0||i==3)
         {
             for (int j = 0; j <4; j++)
             {
                 System.out.print("*");
             }
             System.out.println();

         }
         else
         {
             for (int j = 0; j <4; j++)
             {
                 if (j==0||j==3)
                 {
                     System.out.print("*");
                 }
                 else
                     System.out.print(" ");
             }
             System.out.println();
         }

        }
    }
    void p22()
    {
        for (int i = 0; i <7; i++) {
            for (int j = 0; j <7; j++) {
                int top=i;
                int left =j;
                int right=7-1-j;
                int bottom=7-1-i;
                System.out.print(4-(Math.min(Math.min(top,bottom),Math.min(left,right))));
            }
            System.out.println();
        }
    }
}

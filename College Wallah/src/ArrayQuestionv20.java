import java.util.Scanner;

public class ArrayQuestionv20 {
    public static void main(String[] args) {
        ArrayQuestionv20 obj = new ArrayQuestionv20();
//        int []a= obj.inputArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        obj.RotatebyKapproach2(a, k);
//        obj.print(a);
    }

    void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    void targetSum(int x, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (x == (a[i] + a[j]))
                    count++;
            }
        }
        System.out.println("Total no of Pairs are " + count);
    }

    void targetTripletSum(int x, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == x) {
                        count++;
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
        System.out.println("no of Triplets are " + count);
    }

    void uniqueNo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] >= 0) {
                    if (a[i] == a[j]) {
                        a[i] = -1;
                        a[j] = -1;
                    }
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0)
                System.out.println("Answer is " + a[i]);
        }
    }

    void secondLargest(int[] a) {
        int max = a[0];
        int secondMax = max;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            }
        }
        System.out.println("Second Max value is " + secondMax + " and Max value is " + max);
    }

    int checkRepetition(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    return a[i];
            }
        }
        return -1;
    }

    int[] swap(int x, int y) {
//        System.out.println("Enter a & b ");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        int[] k = {x, y};
        return k;
    }

    void swapArrayElements(int[] a, int x, int y) {
        int t=a[x];
        a[x]=a[y];
        a[y]=t;
    }

    int[] arrayReverse(int[] a, int x, int n) {
        int[] rev = new int[n - x];
        int k = 0;
//        for (int i = a.length-1; i >=0 ; i--) {
//            rev[k++]=a[i];
//        }
        int i = n - 1;
        while (i >= x) {
            rev[k++] = a[i--];
        }
        return rev;
    }

    int[] arrayReverseWithoutNewArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
//            int x=a[i];
//            int y=a[a.length-i-1];
//            x=x+y;
//            y=x-y;
//            x=x-y;
//            a[i]=x;
//            a[a.length-i-1]=y;
            swapArrayElements(a, i, a.length - i - 1);
        }
        return a;
    }

    void ArrayReverseIndexes(int[] a, int x, int y) {
        int k = y;
        int n = (y - x) / 2;
        for (int i = 0; i <= n; i++) {
            swapArrayElements(a, x + i, k--);
        }

    }

    int[] RotatebyKapproach1(int[] a, int k) {
        k = k % a.length;
        int[] x = new int[a.length];
        int j = 0;
        for (int i = a.length - k; i < a.length; i++) {
            x[j++] = a[i];
        }
        for (int i = 0; i < a.length - k; i++) {
            x[j++] = a[i];
        }
        return x;
    }

    void RotatebyKapproach2(int[] a, int k) {
        k = k % a.length;
        if(k!=0) {
            ArrayReverseIndexes(a, 0, a.length - k - 1);
            ArrayReverseIndexes(a, a.length - k, a.length - 1);
            ArrayReverseIndexes(a, 0, a.length - 1);
        }
        print(a);
    }
}

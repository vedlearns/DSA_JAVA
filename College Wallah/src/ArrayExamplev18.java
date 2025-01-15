import java.util.Scanner;

public class ArrayExamplev18 {
    int []a={1,8,5};
    public static void main(String[] args) {
        ArrayExamplev18 obj=new ArrayExamplev18();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Value to be Searched is");
        int x=sc.nextInt();
        System.out.println("Array sum is "+obj.arraysum());
        System.out.println("Max value of Array is "+obj.maxvalue());
        System.out.println("value resultant is  "+obj.searchvalue(x));
    }
    int arraysum(){
        int Arraysum=0;
       for(int sum:a)
           Arraysum+=sum;
       return Arraysum;
    }
    int maxvalue(){
        int max=Integer.MIN_VALUE;
        for (int value:a) {
            if (value > max){
                max=value;
            }
        }
        return max;
    }
    int searchvalue( int x){
        int s=-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==x) {
                s =i;
                break;
            }
        }
        return s;
    }
}


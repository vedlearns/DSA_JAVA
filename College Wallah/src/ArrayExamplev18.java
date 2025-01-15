import java.util.Scanner;

public class ArrayExamplev18 {
    int []a={1,5,5,6,7,7,8};
    public static void main(String[] args) {
        ArrayExamplev18 obj=new ArrayExamplev18();
        Scanner sc=new Scanner(System.in);
        System.out.println(" Value to be Searched is");
        int x=sc.nextInt();
        System.out.println("Array sum is "+obj.arraysum());
        System.out.println("Max value of Array is "+obj.maxvalue());
        System.out.println("value resultant is  "+obj.searchvalue(x));
        System.out.println("Occurrence of the value is  "+obj.occurrences(x));
        System.out.println("Last Occurrence of the value is  "+obj.lastOccurrence(x));
        System.out.println("Number of elements strictly greater are "+obj.greaterNum(x));
        System.out.println("Sorting of the Array is "+obj.checkSort());
        System.out.println("smallest and largest values are ");
        int[] x1=obj.largestNSmallest();
        for (int each:x1)
            System.out.print(each+" ");
        System.out.println();
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
    int occurrences(int x){
        int count=0;
        for (int occur:a){
            if(occur==x)
                count++;
        }
        return count;
    }
    int lastOccurrence(int x){
        int o=-1;
        for (int i=0;i<a.length;i++){
         if(a[i]==x)
             o=i;
        }
        return o;
    }
    int greaterNum(int x){
    int count=0;
    for (int each:a){
        if (each>x)
            count++;
    }
    return count;
    }
    boolean checkSort(){

        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[i-1])
                return false;
        }
        return true;
    }
    int[] largestNSmallest(){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <a.length; i++) {
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        int[] x={min,max};
        return x;
    }
}


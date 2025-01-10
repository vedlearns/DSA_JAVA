import java.util.Scanner;
class Algebrav16{
    int add(int a ,int b){
        return a+b;
    }
}
public class Mainv16{
    public static void main(String[] args){
    Algebrav16 obj=new Algebrav16();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println( obj.add(a,b));
    }
}

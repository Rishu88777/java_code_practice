import java.util.*;
public class swap{
    public static void swap(int a,int b){
        int c= a;
        a=b;
        b=c;
        System.out.println("value of a =" + a );
        System.out.println("value of b =" + b);
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();
        swap(a,b);
    }
}
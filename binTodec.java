import java.util.*;
public class binTodec {
    public static void binTodec(int a){
        int pow=0;
        int dec=0;
        while( a>0){
            int last_dig= a%10;
             dec= dec+ last_dig*(int)Math.pow(2,pow);
             pow++;
             a=a/10;
        }
        System.out.println(dec);
       
        }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary Num:-");
        int a=sc.nextInt();
        binTodec(a);
    }
}

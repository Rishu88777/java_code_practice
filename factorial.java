

public class factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bin_cof(int n, int r){
        int a= factorial(n);
        int nmr= factorial(n-r);
        int bin_cof=a/(nmr);
        return bin_cof;
    }
    public static void main(String args[]){
        int n=5;
        int r=2;
        System.out.println(bin_cof(n,r));
    }
}

public class decToBin {
    public static void decToBin(int n){
    int pow=0;
    int bin=0;
    while(n>0){
        int lastdig=n%2;
        bin = bin + lastdig * (int)Math.pow(10,pow);
        pow++;
        n=n/2;
    }
    System.out.print(bin);
}
    public static void main(String args[]){
        decToBin(5);

    }
}

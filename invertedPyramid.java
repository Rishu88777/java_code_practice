public class invertedPyramid {
    public static void invertedpyramid(int r){
        for(int i=1;i<=r;i++){
            for(int j=i;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

    public static void main(String args[]){
        invertedpyramid(8);
       // hollowRec(4,4);

    }
}

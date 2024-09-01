public class hollowrec {
   /* public static void hollowRec(int row, int col){
        for(int i =0;i<=row;i++){
            for (int j=0;j<=col;j++){
                if(i==0 || i==row ||j==0|| j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();       
        }
    }
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
    public static void invertedNumber(int n){
        for(int i= n;i>=1;i--){
            int num=1;
            for(int j=1; j<=i;j++){
            System.out.print(num);
            num++;
            }
            System.out.println();
        }
    }
    public static void flloydTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
            System.out.print(num +" ");
            num++;
            }
            System.out.println();
        }
    }*/
    public static void trianglrof01(int n){
        for (int i=1;i<=n;i++){
            for(int j= 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else
                System.out.print("0");
            }
            System.out.println();

        }
       
    }
    public static void main(String args[]){
        //invertedNumber(5);
       // invertedpyramid(4);
       // hollowRec(4,4);
       //flloydTriangle(6);
       trianglrof01(4);
    }
}

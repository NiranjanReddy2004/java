import java.util.Scanner;
public class patternv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       vPatern(n);
       lPattern(n);
       ipattern(n);

       sc.close();
    }
     static void ipattern(int n){
         for( int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(i==1 || i==n || j==n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }System.out.println();
        }
    
     }


     static void lPattern(int n){
         for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==n || j==1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void  vPatern(int n){
         for(int i=1; i<=n/2+1; i++){
            for(int j = 1; j <= n; j++){
                if(j == i ||  j+i == n+1){
                    System.out.print("* ");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

import java.util.Scanner;

public class parctice {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++ ){
            System.out.println(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
    }
}
class Innerparctice {
    static int fibbonacci(int n){
        if(n<=1){
            return n;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(n);
        for(int i=0; i<=n; i++){
            System.out.println(fibbonacci(i)+"");
        }
    }
    
}

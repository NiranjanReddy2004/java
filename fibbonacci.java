import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(a+" ");
            c =a+b;
            a =b;
            b =c;
        }

    }
}

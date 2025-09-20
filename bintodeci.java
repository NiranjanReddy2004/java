import java.util.Scanner;

public class bintodeci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int bin = sc.nextInt();
        int dec = 0;
        int p = 1;
        while (bin>0) {
            int bit = bin %10;
            dec+=bit*p;
            bin /= 10;
            p*=2;
            
        }
        System.out.println("decimal="+dec);
        sc.close();
    }


}

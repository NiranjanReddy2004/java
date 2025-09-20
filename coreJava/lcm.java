import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int number1 = sc.nextInt();
        System.out.println("enter num 2");
        int number2 = sc.nextInt();
        int gcd = 1;
        for(int i=1; i<=number1 && i<=number2;i++){
            if (number1%i==0 && number2%i==0) {
                gcd = i;
            }
            System.out.println("gcd of"+number1+","+number2+"="+gcd);
            int lcm =(number1*number2)/gcd;
            System.out.println("lcm of"+number1+","+number2+"="+lcm);
        }
    }

}

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int number1 = sc.nextInt();
        System.out.println("enter num 2");
        int number2 = sc.nextInt();
        int gcd = 1;
        for(int i=1; i<=number1 && i<=number2; i++){
            if(number1 % i==0 && number2 % i==0){
                gcd = 1;

            }
            System.out.println("gcd of"+ number1+","+number2+"="+gcd);
        }
    }

}

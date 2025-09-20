import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int n =sc.nextInt();
        int rev = 0;
        while (n>0) {
            int reminder = n%10;
            rev =(rev*10)+reminder;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }

}

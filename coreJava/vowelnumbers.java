import java.util.Scanner;

public class vowelnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        char ch =sc.nextLine().charAt(0);
        if (ch =='a'||ch =='e'||ch =='i'||ch =='0'||ch =='u') {
            System.out.println("vowel");
            
        }else{
            System.out.println("consenent");
        }
    }

}

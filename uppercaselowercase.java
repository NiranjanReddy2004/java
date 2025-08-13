import java.util.Scanner;

public class uppercaselowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter here");
        char ch = sc.nextLine().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("upercase");
            
        }else if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        }else{
            System.out.println("not a charcter");
        }
    }

}

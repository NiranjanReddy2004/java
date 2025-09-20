import java.util.Scanner;

public class elligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int a =sc.nextInt();
        if (a<=30) {
            if (a<=40) { 
            System.out.println("elligible");
            }
            
        }
        else
        {
            System.out.println("not elligilble");
        }
    }

}

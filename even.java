import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();
        if(num % 2 == 0){
            System.out.println(num+"");
        }
    }

}

import java.util.Scanner;

public class positvenegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int number = 0;
        if (number>0) {
            System.out.println("positive");
            
        }else if (number<0) {
            System.out.println("negative");
            
        }else{
            System.err.println("zero");
        }
    }

}

import java.util.Scanner;

public class greadcalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mark");
        int mark = sc.nextInt();
        if (mark>=90) {
            System.out.println("gread A");
            
        }else if (mark>=75) {
            System.out.println("gread B");
            
        }else if (mark>=60) {
            System.out.println("gread C");
        }else {
            System.out.println("gread FAIL");
        }
    }

}

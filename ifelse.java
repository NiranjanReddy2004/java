import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 num");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("a is bigger");
            
        }else if (a<b) {
            System.out.println("b is bigger");
            
        }else{
            System.out.println("both are equal");
        }
        
    }


}

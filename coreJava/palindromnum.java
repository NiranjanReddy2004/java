public class palindromnum {
    public static boolean ispalin(int n, int m,int rev){
        if(n==0) return m==rev;
        rev=(rev*10)+n%10;
        return ispalin(n/10,m,rev);
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(ispalin(n,n,0));
        
    }

}

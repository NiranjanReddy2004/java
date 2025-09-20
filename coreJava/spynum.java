public class spynum {
    public static boolean isspy(int n,int sum, int prod){
        if(n==0) return sum==prod;
        sum+=n%10;
        prod*=n%10;
        return isspy(n/10,sum,prod);
    }
    public static void main(String[] args) {
        int n=123;
        System.out.println(isspy(n,0,1));
    }

}

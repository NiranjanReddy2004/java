public class neonnum {
    public static boolean isneon(int n,int sq,int sum){
        if(sq==0) return n==sum;
        sum=sum+sq%10;
        return isneon(n, sq / 10, sum);
    }
    public static void main(String[] args) {
        int n=99;
        int sq=n*n;
        System.out.println(isneon(n,sq,0));
        
    }

}

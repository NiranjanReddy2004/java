public class practice {
    public static boolean isperfect(int n, int i, int sum){
        if(i>n/2) return n==sum;
        if(n%i==0) sum+=i;
        return isperfect(n, i, sum);

    }
    public static void main(String[]args){
        int n =56;
        System.out.println(isperfect(n,1,0));

    }
    

}

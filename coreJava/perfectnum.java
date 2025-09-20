public class perfectnum {
    public static boolean isperfect(int n, int i, int sum)
 {
        if (i>n/2)return n==sum; 
        if(n%i==0) sum+=i;
        return isperfect(n, i+1, sum);
        }
        public static void main(String[] args) {
            int n=28;
            System.out.println(isperfect(n,1,0));
        }
    }



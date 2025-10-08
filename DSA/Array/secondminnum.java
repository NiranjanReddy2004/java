package Array;

public class secondminnum {
    public static void main(String[] args) {
        int [] a = {1,19,20,4,8,7};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i]<min1){
                min2 = min1;
                min1 = a[i];
            }
            else if(a[i]<min2 && a[i]!=min1){
                min2 = a[i];
            }
        }
        System.out.println(min2);
    }
    
}

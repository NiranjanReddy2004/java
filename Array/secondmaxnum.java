package Array;

public class secondmaxnum {
    public static void main(String[] args) {
        int [] a ={ 19,5,3,19,15,18,2};
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]!=max1){
                max2=a[i];
            }
        }
        System.out.println(max2);
    }
    
}

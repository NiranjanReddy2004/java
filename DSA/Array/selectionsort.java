
package Array;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int [] a = {10,4,5,7,3};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a){
        for(int i=0; i<a.length; i++){
            int smallEleIndex = i;
            for(int j=i+1; j<a.length; j++){
                if (a[j] < a[smallEleIndex]) {
                    smallEleIndex = j;

}            }
            int temp = a[i];
            a[i] = a[smallEleIndex];
            a[smallEleIndex] = temp;
        }

    }
    
}

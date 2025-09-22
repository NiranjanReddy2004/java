package Array;

public class binarysearch {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        System.out.println(search(a,30));
    }

    private static int search(int[] a, int key) {
        int st = 0;
        int end = a.length-1;
        while(st<=end){
            int mid = (st+end)/2;
            if(a[mid]==key)
            return mid;
            else if(key<a[mid])
            end = mid - 1;
            else{
                st=mid+1;
            }
        }
        return -1;
    }
    
}

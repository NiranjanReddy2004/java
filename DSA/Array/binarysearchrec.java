package Array;

public class binarysearchrec {
    public static void main(String[] args) {
        int[] a ={10,20,30,40,};
        System.out.println(search(a,20,0,a.length-1));
    }

    private static int search(int[] a, int key, int st, int end) {
        if(st>end)
        return -1;
        int mid =(st+end)/2;
        if(a[mid]==key)
        return mid;
        else if (key<a[mid])
        return search(a, key, st, mid-1);
        else
        return search(a,key,mid+1,end);
    }
    
}

package Array;

public class linearsearch {
    public static void main(String[] args) {
        int[]a = {1,4,6,7,8};
        System.out.println(search(a,7));
    }

    public static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
}

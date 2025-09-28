package Array.twoDArray;

public class pascaltriangle {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;
        int [][] a= new int[n][];
        ispascal(a);
        for(int i=0; i<a.length; i++){
            for(int k=0; k<=sp; i++)
            System.out.println("");
            for(int j=0; j<a[i].length; j++)
            System.out.println(a[i][j]+"");
            System.out.println();
            sp--;
        }
    }
    public static void ispascal(int[][] a) {
        for(int i=0; i<a.length; i++){

            
        }
    }
    
}

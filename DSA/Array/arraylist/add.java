package Array.arraylist;

import java.util.ArrayList;

public class add {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
         l.add(20);
          l.add(30);
           l.add(0,40);
            l.add(2,40);
            for(int i=0; i<l.size();i++){
                System.out.println((Integer)l.get(1));
            }
    }
    
}

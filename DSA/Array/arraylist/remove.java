package Array.arraylist;

import java.util.ArrayList;

public class remove {public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
         l.add(20);
          l.add(30);
           l.add(0,40);
            l.add(2,40);
            System.out.println(l);
            l.remove(2);
            System.out.println("after removing");
            System.out.println(l);
}
    
}

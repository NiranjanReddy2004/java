package String;

public class initcap {
    public static void main(String[] args) {
        String s = "niranjan";
        char [] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i]>='a' && ch[i-1]<='z'){
                if(i==0 || ch[i-1]==' ')
                ch[i]=32;
            }
        }
        System.out.println(ch);
    }
    
}

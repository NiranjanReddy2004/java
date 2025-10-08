package String;

public class uctolc {
    public static void main(String[] args) {
        String s = "aBcDeF";
    char[]ch = s.toCharArray();
    for(int i = 0; i < ch.length; i++) {
        if(ch[i]>='A' && ch[i]<='Z')
            ch[i] = (char)(ch[i] + 32);
    }
    System.out.println(ch);
    }
}

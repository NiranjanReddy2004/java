package String;

public class arangestring {
    public static void main(String[] args) {
        String s ="jspider@123";
        String res= "";
        String uc = "", lc = "", nc = "", sp = "";
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A'&& ch<='Z')uc+=ch;
            else if(ch>='a'&& ch<='z')lc+=ch;
            else if(ch>='0' && ch<='9')nc+=nc;
            else
            sp+=ch;
            res += (nc+sp+lc+uc);
            System.out.println(res);
        }
    }
    
}

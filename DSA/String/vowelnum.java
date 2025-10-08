package String;

public class vowelnum {
    public static void main(String[] args) {
        String s = "aerospace";
        int vowelcount =0;
        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelcount++;
        }
        System.out.println(vowelcount);
    }
    
}

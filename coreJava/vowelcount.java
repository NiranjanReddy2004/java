public class vowelcount {
    public static void main(String[] args) {
        String s="excellent";
        int vowelcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'a' ||ch == 'e'|| ch == 'i'||ch == 'o'|| ch == 'u')
            vowelcount++;
            
        }
        System.out.println(vowelcount);
    }

}

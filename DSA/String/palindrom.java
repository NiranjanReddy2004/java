package String;

public class palindrom {
    public static void main(String[] args) {
        System.out.println(ispalindrom("malayalam"));
    }
    public static boolean ispalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;

    }
    
}

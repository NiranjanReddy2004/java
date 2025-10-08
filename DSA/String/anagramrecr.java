package String;

public class anagramrecr {
	public static void main(String[] args) {
		String s = "ssilent";
		String s1 = "listen";
if (isanagram(s,s1)) {
	System.out.println("is anagram");
}else{
	System.out.println("is not anagram");
}
	}
	public static boolean isanagram(String s1,String s2) {
		if(s1.length()!=s2.length())return false;
		if(s1.length()!=0 && s2.length()!=0)
			return true;
		char ch= s1.charAt(0);
				s1=s1.replace(ch+"","");
				s2=s2.replace(ch+"","");
				return isanagram(s1,s2);
	}

}

    


package String;

public class anagram {
	public static void main(String[] args) {
		String s= "silent";
		String s1= "listen";
		System.out.println(isanagram(s,s1));
	}
	public static boolean  isanagram(String s1,String s2) {
		while(true) {
			if(s1.length()==0&&s2.length()==0)
				return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			s2=s2.replace(ch+"","");
		}
		
	}
	



    
}

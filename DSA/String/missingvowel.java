package String;

public class missingvowel {
	public static void main(String[]args) {
		String s1="india";
		String s2="AEIOUaeiou";
		for(int i=0; i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(s2.contains(ch+""))
				s2=s2.replace(ch+"","");
		}
		System.out.println(s2);
		
	}

}

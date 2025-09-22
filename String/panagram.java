package String;

public class panagram {
    public static void main(String[]args) {
		String s = "A quick Brown fox jumps over the lazy dog";
		System.out.println(ispanagram(s));
	}
	public static boolean ispanagram(String s) {
		s= s.toLowerCase();
		if(s.length()<26)
			return false;
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+""))
				return false;
		}
		return true;
	}

}

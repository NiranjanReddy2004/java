package String;

public class removeduplicateword {
    public static void main(String[] args) {
		String s = "java is very very easy java";
		String[]str = s.split(" ");
		String res ="";
		for(int i=0;i<str.length;i++) {
			String s1=str[0];
			if(!res.contains(s1))res+=s1+"";
		}
		System.out.println(res.trim());
	}

}

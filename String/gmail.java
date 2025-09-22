package String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gmail {

	public static void main(String[] args) {
		String exp = "[A-Z][a-z0-9]+@zgmail[.]com";
		String s = "jsp123@gmail.com";
		Pattern p= Pattern.compile(exp);
		Matcher m = p.matcher(s);
		if(m.matches())
			System.out.println("valid");
		else
			System.out.println("invalid");

	}

}


package string;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class demo1 
{
    public static void main(String[]args){
        String exp = "2786996954865jzhbhb7008600781zkbxhb";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(exp);
        while(m.find())
            System.out.println(m.group());
    }
    
}

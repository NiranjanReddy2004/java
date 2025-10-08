package String;

public class encodedecode {
    public static void main(String[] args) {
        System.out.println(encode("abc",2));   // cde
        System.out.println(decode("cde",2));   // abc
    }

    public static String encode(String s, int n) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                ch[i] = (char)((((ch[i] - 'A' + n) % 26 + 26) % 26) + 'A');
            } else if (Character.isLowerCase(ch[i])) {
                ch[i] = (char)((((ch[i] - 'a' + n) % 26 + 26) % 26) + 'a');
            }
        }
        return new String(ch);
    }

    public static String decode(String s, int n) {
        return encode(s, -n);
    }
}

    


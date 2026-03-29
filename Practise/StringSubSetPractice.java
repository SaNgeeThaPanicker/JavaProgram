package Practise;
public class StringSubSetPractice {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.reverse();
        System.out.println(sb);
        sb.replace(2, 3, "xyz");
        System.out.println(sb);

        String str = "abc";
        int n = str.length();
        System.out.println(n);
        String subString = str.substring(0, 2);
        System.out.println(subString);

    }
}

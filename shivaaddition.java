package shiva;

public class shivaaddition {
    public static void main(String[] args) {
        String str=" shiv";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toUpperCase().trim());
        System.out.println(str.substring(3));
        System.out.println(str.replace('s','a'));
        System.out.println(str.startsWith(" "));
        System.out.println(str.charAt(2));
        String str1=" Shiv";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        String str2="thiruvananthapuram";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.length());
        System.out.println(str2.replace('a','z'));
        System.out.println(str2.substring(13));
    }
}

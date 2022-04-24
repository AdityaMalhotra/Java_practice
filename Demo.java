public class Demo
{
    public static void main(String[] args) {
        String str4 = new String("bcd");
        String str = new String("abc");
        String str2 = "abc";
        String str3 = "abc";

        System.out.println(str==str2);
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
    }
}

public class StringStr1 {
    public static void main(String args[]){
        // int a = 10;
        // int b = 10;
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.substring(1,3));
        System.out.println(s1.contains("ae"));
        StringBuffer ab = new StringBuffer(s1);
        System.out.println(ab.reverse());
        s1.chars().forEach(ch->System.out.println((char)ch));

    }
    
}

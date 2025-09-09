import java.util.Set;
import java.util.HashSet;
public class SetExample {
    public static void main(String [] args){
        Set<Integer> hs = new HashSet<Integer>();
        System.out.println("adding 1 "+hs.add(1));
        System.out.println("adding 2 "+hs.add(2));
        System.out.println("adding -1 "+hs.add(-1));
        System.out.println("ading 1 again "+hs.add(1));
        //hs.add("hello");
        //hs.add(1.1);
        //hs.add('a');
        hs.forEach(e-> System.out.println(e));
    }
    
}

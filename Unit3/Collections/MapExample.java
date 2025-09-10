/*
 * count the frequencey of Character in a sentence
 * Ip : Welcome to Java
 * Op: W : 1
 * e:2
 * l:1
 * c:1
 * o:2
 * m:1
 *  :2
 * t:1
 * J:1
 * a:2
 * v:1
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MapExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        String str = sc.nextLine();
        for(char c:str.toCharArray()){
            if(hm.containsKey(c)){
                int v = hm.get(c);
                hm.put(c,++v);
            } else {
                hm.put(c,1);
            }
        }
        System.out.println(hm);
    }
    
}

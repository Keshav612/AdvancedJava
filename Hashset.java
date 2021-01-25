//Hashset removes second instance of duplicate 
//Keshav Mishra
import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        String a[]={"ab","cd","ab","ef"};
        List<String> l1= Arrays.asList(a);
        System.out.printf("%s",l1);
        System.out.println();
        
        Set<String> set = new HashSet<String>(l1);
        System.out.printf("%s",set);
        System.out.println();
    }
    
}

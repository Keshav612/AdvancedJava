//ArrayList 
//Keshav Mishra
import java.util.*;
public class Arraylist
{
    public static void main(String[] args) {
        //Hard code method
        /*String s1[]={"ram","mohan","raju","rajesh"};
        List<String> l1 = new ArrayList<String>();
        for(String i:s1)
        {
            l1.add(i);
        }
        for(int i=0;i<l1.size();i++)
        {
        System.out.printf("%s",l1.get(i)+ " ");
        }*/
        //String s1[]={"ram","mohan","raju","rajesh"};
        //User input method
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        List<String> l1 = new ArrayList<String>();
        while((n+1)>0)
        {
            
            l1.add(in.nextLine());
            n--;
        }
        for(int i=0;i<l1.size();i++)
        {
        System.out.printf("%s",l1.get(i)+ " ");

    }
}
}
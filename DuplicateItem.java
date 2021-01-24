/* Removing duplicate item from first ArrayList
Keshav Mishra*/
import java.util.*;
public class DuplicateItem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<Integer>();
        System.out.println("Enetr no. of inputs for List 1");
        int n= in.nextInt();
        while((n)>0)
        {
            l1.add(in.nextInt());
            n--;
        }
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println("Enetr no. of inputs for List 2");
        int n2= in.nextInt();
        while((n2)>0)
        {
            l2.add(in.nextInt());
            n2--;
        }
        editList(l1,l2);
        System.out.println();
        System.out.println();
        for(int i=0;i<l1.size();i++)
        {
            System.out.printf("%s",l1.get(i)+" ");
        }
        
    }
    public static void editList(Collection<Integer> l1,Collection<Integer> l2)
    {
        Iterator<Integer> it=l1.iterator();
        while(it.hasNext())
        {
        if(l2.contains(it.next()))
        {
            it.remove();
        }
        }
    }
    
}

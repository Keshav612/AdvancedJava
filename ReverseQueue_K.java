//reversing queue by k elements.
import java.util.*;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class ReverseQueue_K
{
    static Queue<Integer> q;
    public static void main(String[] args) {
        
        q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
 
        int k = 5;
        reverse(k);
        Print();
    }
    static void Print()
    {
        while (!q.isEmpty()) 
        {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
    static void reverse(int k)
    {
       
        if(q.isEmpty()==true || k>q.size())
        {
            return;
        }
        if(k<0)
        {
            return;
        }
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<k;i++)
        {
            s.push(q.peek());
            q.remove();
        }
        while(!s.empty())
        {
            q.add(s.peek());
            s.pop();
        }
        for(int i=0;i<q.size()-k;i++)
        {
            q.add(q.peek());
            q.remove();
        }
    }
    
}
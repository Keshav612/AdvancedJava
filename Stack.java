//Implementation of Stacks using Linked List
//Keshav Mishra
public class Stack 
{
    class Node
    {
        Node link;
        int data;
    }
    Node top;
    Stack()
    {
        this.top=null;
    }
    void push(int x)
    {
        Node temp=new Node();//new node temp and allocate memory 
        if(temp==null)
        {
            System.out.println("Overflow");
        }
        temp.data=x;
        temp.link=top;
        top=temp;
    }
    boolean isEmpty()
    {
        return top==null;
    }
    int peek()
    {
        if(!isEmpty())
        {
            return top.data;
        }
        else
        {
            return -1;
        }
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Underflow");
        }
        else
        {
            top=top.link;
        }
    }
    void display()
    {
        if(top==null)
        {
            System.out.println("Underflow");
        }
        else
        {
            Node temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.link;
            }
        }
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(11); 
        obj.push(22); 
        obj.push(33); 
        obj.push(44); 
  
        // print Stack elements 
        obj.display(); 
  
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek()); 
  
        // Delete top element of Stack 
        obj.pop(); 
        obj.pop(); 
  
        // print Stack elements 
        obj.display(); 
    }
    
}

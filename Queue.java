//Queue implmentation using arrays
//Keshav Mishra
import java.util.*;
public class Queue
{
    int front,rear,cap,count;
    int arr[];
    Queue(int size)
    {
        front=0;
        rear=-1;
        cap=size;
        count=0;
        arr=new int[size];
    }
    void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("Overflow");
        }
        System.out.println("Inserting : "+x);
        rear++;
        arr[rear]=x;
        count++;
    }
    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        front++;
        count--;
        System.out.println("Removed");
    }
    boolean isFull()
    {
        return (size()==cap);
    }
    boolean isEmpty()
    {
        return (size()==0);
    }
    int size()
    {
        return count;
    }
    int peek()
    {
        return arr[front];
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        System.out.println("Front element is: " + q.peek());
        q.dequeue();
        System.out.println("Front element is: " + q.peek());
 
        System.out.println("Queue size is " + q.size());
 
        q.dequeue();
        q.dequeue();
        
        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");
    }
    
}
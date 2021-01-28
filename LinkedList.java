public class LinkedList 
{
    Node head;
 
    public static void main(String[] args) 
    {
        LinkedList ob = new LinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

    // connect each node of linked list to next node
    ob.traverse(head);
    }
    void traverse(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data+" ");
            curr=curr.next;
        }
    }
    
}

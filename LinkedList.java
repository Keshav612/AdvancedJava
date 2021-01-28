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
    //System.out.print(ob.insertBegin(head, 20));
    Node newNode=ob.insertBegin(head, 20);
    System.out.println();
    ob.traverse(newNode);
    System.out.println();
    ob.insertEnd(head, 30);
    ob.traverse(head);
    }
    void traverse(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    Node insertBegin(Node head,int x)
    {
        Node temp = new Node(x);     
        temp.next=head;
        head=temp;
        return head;
    }
    Node insertEnd(Node head,int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            return temp;
        }
            Node curr=head;
            if(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
        return head;
    }
    
}

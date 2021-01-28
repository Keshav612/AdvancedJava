public class SearchLinkedList 
{
    Node head;
     public static void main(String[] args) 
    {
        SearchLinkedList ob = new SearchLinkedList();
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);

    // connect each node of linked list to next node
        System.out.println(ob.search1(head,2));
        System.out.println(ob.search2(head,3));
    }
    int search1(Node head,int x) //iterative
    {
        int pos=0;
        Node curr = head;
        if(curr==null)
        {
            return -1;
        }
        while(curr!=null)
        {
            if(curr.data==x)
            {
                pos++;
                return pos;
            }
            else
            {
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }
    int search2(Node head,int x) //recursion
    {
        Node curr=head;
        if(curr==null)
        {
            return -1;

        }
        if(curr.data==x)
        {
            return 1;
        }
        else{
            int res=search2(head.next,x);
            if(res==-1)
            {
                return -1;
            }
            else
            {
                return (res+=1);
            }
        }
    }

    
    
}

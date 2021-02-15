public class InsertAtN_LL 
{
    class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
        }
    }
 public static void main(String[] args) 
 {   
     
 }   

 Node insert(Node head,int pos,int data)
 {
     Node temp=new Node(data);
     Node curr=head;
     if(pos==1)
     {
         temp.next=head;
         return temp;
     }
     for(int i=0;i<=pos-2 && curr!=null;i++)
     {
        curr=curr.next;
     }
     if(curr==null)
     {
         return head;
     }
     temp.next=curr.next;
     curr.next=temp;
    return head;
 }
}

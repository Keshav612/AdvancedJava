public class QueueLL {
    Qnode front,rear;
    QueueLL()
    {
        this.front=this.rear=null;
    }
    void enqueue(int key)
    {
        Qnode tmp = new Qnode(key);
        if(this.rear==null)
        {
            this.rear=this.front=null;
            
        }
        this.rear=tmp;
        this.rear.next=tmp;
        System.out.println("Inserted");
    }
    void dequeue()
    {
        if(this.front==null)
        {
            System.out.println("Empty");

        }
        Qnode tmp=this.front;
        this.front=this.front.next;
        if(this.front==null)
        {
            this.rear=null;
        }
    }
    public static void main(String[] args) {
        QueueLL ob = new QueueLL();
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(5);
    }
}

package stacksqueues;

public class MyQueue
{
    private Node front; //for deletion
    private Node rear; //for insertion
    private Integer size; //size

    public MyQueue()
    {
        this.front = null;
        this.rear = null;
        size = 0;
    }
    private class Node
    {
        private Integer data;
        private Node next;

        public Node(Integer data)
        {
            this.data = data;
            this.next = null;
        }
    }

    //add
    public void insert(Integer data)
    {
        Node node = new Node(data);
        if(this.rear == null)
        {
            this.rear = node;
            this.front = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }
    //remove
    public Integer remove()
    {
        if(isEmpty())
            return -1;

        if(this.rear == this.front)
        {
            this.rear = null;
        }
        Integer data = this.front.data;
        this.front = front.next;
        return data;
    }
    //isEmpty
    public boolean isEmpty()
    {
        if(this.front == null)
            return true;
        return false;
    }

    public void print()
    {
        Node curr = front;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

package stacksqueues;

public class MyStack
{
    private Node head;
    private Integer size;

    public MyStack()
    {
        this.head = null;
        this.size = 0;
    }

    public void push(Integer data)
    {
        Node node = new Node(data);
        if(isEmpty()) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }
    public Integer pop()
    {
        if(isEmpty())
            return -1;

        Integer data = head.data;
        head = head.next;
        return data;
    }
    public void print()
    {
        Node current = head;

            while (current!= null) {
                System.out.print(current.data + " ");
                current = current.next;
        }
    }
    public boolean isEmpty()
    {
        if(this.head == null)
            return true;
        return false;
    }
    private class Node
    {
        private Integer data;
        private Node next;

        private Node(Integer data)
        {
            this.data = data;
            this.next = null;
        }
    }

}

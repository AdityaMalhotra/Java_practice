package stacksqueues;

public class Main
{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.print();
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(5);
        System.out.println(stack.pop());
        stack.push(10);
        stack.print();

        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
        queue.print();
        System.out.println(queue.remove());
        queue.insert(10);
        queue.insert(20);
        System.out.println(queue.remove());
        queue.insert(90);
        queue.print();
    }
}

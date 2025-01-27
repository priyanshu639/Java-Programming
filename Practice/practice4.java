import java.util.LinkedList;
import java.util.Queue;
public class practice4 {


class StackUsingOneQueue {
    private Queue<Integer> queue;

    public StackUsingOneQueue() {
        queue = new LinkedList<>();
    }

    // Push operation
    public void push(int data) {
        queue.add(data);
        int size = queue.size();
        // Rotate the queue to bring the newly added element to the front
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
    }

    // Pop operation
    public int pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.poll();
    }

    // Peek operation
    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        StackUsingOneQueue stack = new StackUsingOneQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek()); // 2
        System.out.println(stack.pop()); // 2
        System.out.println(stack.isEmpty()); // false
    }
}

    
}

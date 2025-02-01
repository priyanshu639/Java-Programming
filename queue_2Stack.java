import java.util.Stack;
    
    public class queue_2Stack{
        static class Queue {
            static Stack<Integer> s1 = new Stack<>();
            static Stack<Integer> s2 = new Stack<>();
    
            // Check if queue is empty
            public static boolean isEmpty() {
                return s1.isEmpty();
            }
    
            // Add element to the queue
            public static void add(int data) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(data);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
    
            // Remove element from the queue
            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                return s1.pop();
            }
    
            // Get the front element of the queue
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                return s1.peek();
            }
        }
    
        public static void main(String args[]) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();

            }
            
        }
    }
  

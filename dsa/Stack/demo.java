import java.util.Stack;

public class demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("All numbers : " + stack);
        System.out.println("peek number : " + stack.peek());
        System.out.println("search number : " + stack.search(40));
        System.out.println("size number : " + stack.size());
        System.out.println("pop number : " + stack.pop()+" "+stack.pop()+" "+stack.pop()+" "+stack.pop()+" "+stack.pop());
        System.out.println("empty number : " + stack.empty());
        
  
    }
}
public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);

        stack.pop();
        stack.peek();
        stack.push(40);
        
    }
}

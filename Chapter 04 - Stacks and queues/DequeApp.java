public class DequeApp {
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);
        deque.displayDeque();

        deque.removeLeft();
        deque.displayDeque();

        deque.insertLeft(5);
        deque.insertLeft(6);

        deque.displayDeque();
    }
}

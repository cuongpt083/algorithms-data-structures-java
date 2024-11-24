public class Deque {
    private int maxSize;
    private long[] dequeArray;
    private int front;
    private int rear;
    private int nIteams;

    public Deque(int size) {
        maxSize = size;
        dequeArray = new long[maxSize];
        front = 0;
        rear = -1;
        nIteams = 0;
    }

    public boolean isEmpty() {
        return (nIteams == 0);
    }

    public boolean isFull() {
        return (nIteams == maxSize-1);
    }

    public void insertLeft(long value) {
        if(isFull()) {
            System.out.println("Mang da day phan tu !");
        }
        if(front == 0) {
            front = maxSize;
        }

        dequeArray[--front] = value;
        nIteams ++ ;
    }

    public void insertRight(long value) {
        if(isFull()) {
            System.out.println("Mang da day phan tu !");
        }
        if(rear == maxSize - 1) {
            rear = -1;
        }

        dequeArray[++rear] = value;
        nIteams ++ ;
    }

    public long removeLeft() {
        if(isEmpty()){
            System.out.println("Khong the chen vao ben phai vi mang trong!");
            return -1;
        }

        long temp = dequeArray[front++];
        if(front == maxSize) {
            front = 0;
        }
        nIteams--;
        return temp;
    }

    public long removeRight() {
        if(isEmpty()){
            System.out.println("Khong the chen vao ben phai vi mang trong!");
            return -1;
        }
        if(rear < 0 ) {
            rear = maxSize - 1;
        }

        long temp = dequeArray[rear--];
        nIteams--;
        return temp;
    }

    public void displayDeque() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }
        System.out.print("Deque contents: ");
        int current = front;
        for (int i = 0; i < nIteams; i++) {
            System.out.print(dequeArray[current] + " ");
            current = (current + 1) % maxSize;
        }
        System.out.println();
    }

    public int getFront() {
        return front;
    }
    
    public int getRear() {
        return rear;
    }
    
    public int getNItems() {
        return nIteams;
    }
    
    public int getMaxSize() {
        return maxSize;
    }
    
}

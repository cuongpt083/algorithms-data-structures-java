public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nIteams;

    //---------------------------------------

    public Queue (int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nIteams = 0;
    }

    //----------------------------------------

    public void insert(long j) {
        if (rear == maxSize -1) {
            rear = -1;
        }

        queArray[++rear]  = j;
        nIteams++;
    }

    //---------------------------
    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0 ;
        }

        nIteams -- ;
        return temp;
    }

    //--------------------------------------
    public long peekFront() {
        return queArray[front];
    }

    //------------------------------------------
    public boolean isEmpty() {
        return (nIteams == 0);
    }
    //========================================
    public boolean isFull() {
        return (nIteams == maxSize);
    }
    //======================================
    public int size() {
        return nIteams;
    }
}



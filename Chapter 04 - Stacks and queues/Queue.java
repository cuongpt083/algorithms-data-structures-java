//Bai 1 : viết 1 method cho lớp queue để hiện thị nội dung của hàng đợi
// cần hiển thị nội dung của hàng đợi từ phần tử đầu tiên đợc chèn vào đến phần tử cuối cung

//Bai 2 : tạo class Deque 
// Nó nên bao gồm InsertLeft(), InsertRight(), RemoveLeft(),
// các phương thức RemoveRight(), isEmpty() và isFull()

//Bai 3 : Write a program that implements a stack class that is based on the Deque class



public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nIteams;

    //---------------------------------------
    //hàm constructor
    public Queue (int s) {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nIteams = 0;
    }

    //----------------------------------------
    //Chen phan tử vào hàng đợi
    public void insert(long j) {
        if (rear == maxSize -1) {
            rear = -1;
        }

        queArray[++rear]  = j;
        nIteams++;
    }

    //---------------------------
    //Loại phần tử đầu tiên ở hang đợi
    public long remove() {
        long temp = queArray[front++];
        if(front == maxSize) {
            front = 0 ;
        }

        nIteams -- ;
        return temp;
    }

    //--------------------------------------
    // lấy phần tử đầu tiên mà k bị remove
    public long peekFront() {
        return queArray[front];
    }

    //------------------------------------------
    //ktra hàng đợi có rỗng k
    public boolean isEmpty() {
        return (nIteams == 0);
    }
    //========================================
     //ktra hàng đợi có đầy k
    public boolean isFull() {
        return (nIteams == maxSize);
    }
    //======================================
     //ktra kích thước
    public int size() {
        return nIteams;
    }


    //--------------------------
    //Bai 1: hien thi hang doi
    public void displayQueue() {
        if(nIteams == 0 ) {
            System.out.println("Hang doi trong");
        }

        System.out.println("Hien thi mang :");
        
        int temp = front;
        for(int i = 0 ; i < nIteams ; i++) {
            System.out.println(queArray[temp]);
            temp = (temp + 1 ) % maxSize;

        }
        System.out.println("\n");
    }
}



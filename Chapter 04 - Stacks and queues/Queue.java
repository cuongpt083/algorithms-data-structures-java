//Bai 1 : viết 1 method cho lớp queue để hiện thị nội dung của hàng đợi
// cần hiển thị nội dung của hàng đợi từ phần tử đầu tiên đợc chèn vào đến phần tử cuối cung

//Bai 2 : tạo class Deque 
// Nó nên bao gồm InsertLeft(), InsertRight(), RemoveLeft(),
// các phương thức RemoveRight(), isEmpty() và isFull()

//Bai 3 : Write a program that implements a stack class that is based on the Deque class

//Bai 4 : Hàng đợi ưu tiên được hiển thị ở trong bài 4.6 . Hãy viết 1 chương trình
// với class PriorityQ sao cho thời gian chèn nhanh nhưng thời gian có mục xóa có độ ưu tiên cao
// sẽ chậm hơn . Bao gồm 1 phương thức để hiệ thị nội dung của hàng đợi ưu tiên

//=> nếu chèn nhanh thì chèn vào cuối phần tử , xóa phần tử ưu tiên cao thì tìm phần tử cao nhất trong đó rồi xóa


//Bai 5:
//Mo phỏng các quầy thanh toán ở siêu thị
//mỗi quầy thanh toán sẽ có 1 hàng đợi để chứa khách hàng / KH có thể tham gia bất kì 1 quầy nào để bằng cách ấn chọn 1 phím
//Môi khách hàng sẽ được thanh toán và xử lý theo 1 thời gian ngẫu nhiên tùy vào số lượng hàng hóa (để giảm thời gian chờ đơi)
//Sau khi thanh toán xong sẽ xóa khỏi hàng đợi và hiển thị tất cả hàng đợi để người dùng có thể thấy hàng đợi




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



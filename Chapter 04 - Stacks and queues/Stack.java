public class Stack {
    private Deque deque;
    
    //Khoi tao
    public Stack(int size) {
        deque = new Deque(size);
    }
    //push() thêm phần tử vào đỉnh ngăn xếp
    //pop() xóa phần tử ở đầu ngăn xếp
    //peek() lấy giá trị ở đầu ngăn xếp mà k loại bỏ
    public void push(long value) {
        deque.insertRight(value);
    }
    
    public long pop() {
        return deque.removeRight(); 
    }

    public long peek() {
        if(deque.isEmpty()) {
            System.out.println("Mảng trống !");
        }

        long temp = deque.removeRight() ;
        deque.insertRight(temp);
        return temp;
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public boolean isFull() {
        return deque.isFull();
    }

    public void displayStack() {
       if(deque.isEmpty()) {
        System.out.println("Mang rong");
       }


       for(int i = 0 ; i < deque.getNItems() ; i ++) {
        int index = (deque.getRear() - i + deque.getMaxSize()) % deque.getMaxSize();
        System.out.println(deque );
       }
    }
}

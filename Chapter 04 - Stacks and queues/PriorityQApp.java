import java.io.IOException;

public class PriorityQApp {
    public static void main(String[] args) throws IOException {
        PriorityQ thePQ = new PriorityQ(5);
        // thePQ.insert(30);
        // thePQ.insert(50);
        // thePQ.insert(10);
        // thePQ.insert(40);
        // thePQ.insert(20);
        // //Vong while này có 2 mục đích là lấy phần tử và xóa phần tử
        // while (!thePQ.isEmpty()) {
        //     long item = thePQ.remove();
        //     System.out.println(item + " "); //10 20 30 40 50
        // }
        // System.out.println(" ");
        thePQ.priorityInsert(33);
        thePQ.priorityInsert(44);
        thePQ.priorityInsert(11);
        thePQ.priorityInsert(22);
        thePQ.priorityInsert(01);
        thePQ.print();
        thePQ.priorityRemove();
        thePQ.print();
        
        

    }
}

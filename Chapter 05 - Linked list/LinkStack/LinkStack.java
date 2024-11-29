public class LinkStack {
    private LinkList theList ;
    public LinkStack() // hàm khởi tạo
    {
        theList = new LinkList();
    }
    
    public void push(long j) // chèn phần tử lên đầu ngăn xếp
    {
        theList.insertFirst(j);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() // kiểm tra ngăn xếp có rỗng không
    {
        return (theList.isEmpty());
    }

    public void displayStack()
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
    

}

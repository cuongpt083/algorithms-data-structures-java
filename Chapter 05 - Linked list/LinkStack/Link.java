public class Link {
    public long dData;
    public Link next;

    public Link(long dd) // hàm khởi tạo
    { 
        dData = dd; 
    }


    public void displayLink() // hiển thị liên kết này
    { 
        System.out.print(dData + " "); 
    }


}

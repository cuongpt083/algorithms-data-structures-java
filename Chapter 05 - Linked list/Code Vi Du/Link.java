public class Link {
    public int iData;
    public double dData;
    public Link next; //tham chiếu đến liên kết tiepé theo trong danh sách
    
    //------------------
    public Link(int id , double dd) {
        iData = id; // khởi tạo dữ liệu
        dData = dd; // (next  sẽ được tự động đặt thành null)
    }

    //----------------------------
    public void displayLink() {
        System.out.print("{" + iData + "," + dData +"}");
    }
}

public class LinkList {
    private Link first; // tham chiếu đến phần tử đầu tiên trong danh sách
    // -------------------------------------------------------------
    public LinkList() // hàm khởi tạo
    { first = null; } // chưa có phần tử nào trong danh sách
    // -------------------------------------------------------------
    public boolean isEmpty() // kiểm tra danh sách có rỗng không
    { return (first == null); }
    // -------------------------------------------------------------
    public void insertFirst(long dd) // chèn vào đầu danh sách
    { // tạo liên kết mới
        Link newLink = new Link(dd);
        newLink.next = first; // newLink --> phần tử đầu tiên cũ
        first = newLink; // đầu --> newLink
    }
    // -------------------------------------------------------------
    public long deleteFirst() // xóa phần tử đầu tiên
    { // (giả sử danh sách không rỗng)
        Link temp = first; // lưu tham chiếu đến liên kết
        first = first.next; // xóa nó: đầu --> phần tử tiếp theo cũ
        return temp.dData; // trả về dữ liệu đã xóa
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        Link current = first; // bắt đầu từ phần tử đầu tiên
        while (current != null) // cho đến khi hết danh sách,
        {
            current.displayLink(); // in dữ liệu
            current = current.next; // chuyển đến phần tử tiếp theo
        }
        System.out.println("");
    }
}

public class LinkList {
    private Link frist;

    public LinkList() {
        frist = null;
    }

    public boolean isEmpty() {
        return ( frist == null);
    }

    //them lien et moi vao dau danh sach
    public void insertFirst(int id , double dd) {
        Link newLink = new Link(id , dd) ; // tạo lk mới
        newLink.next = frist; // liên kết mới trỏ đến liên kết đầu cũ
        frist = newLink; // cập nhật first để trỏ đến liên kết mới
    }

    // Xoa liên kết dầ tiên khỏi liên kết
    // public Link deleteFirst() {
    //     Link temp = frist;
    //     frist = frist.next;
    //     return temp;
    // }

    public Link find(int key) {
        // giả sự danh sách không rỗng
        Link current = frist;
        while (current.iData != key) {
            if(current.next == null) // nếu đến cuối danh sánh
            {
                return null;
            }
            else // chưa đến cuối danh sách
            {
                current = current.next;
            }
        }

        return current;
    }

    public Link delete (int key) {
        Link current = frist;
        Link previous = frist;
        while (current.iData != key) {
            if(current.next == null) {
                return null;
            } else{
                previous = current;
                current = current.next;
            }
        }// tìm thấy
        if(current == frist) {
            frist = frist.next; // thay đổi first
        } else // nếu k phải 
        {
            previous.next = current.next;
        }
        return current;
    }


    // Hiểm thị tất ca caccs liên kết trong danh sách
    public void displayList() {
        System.out.println(" \n List (first-->last): ");    
        Link current = frist; // ắt đầu từ liên kết đầu tiên
        while (current != null) { // duyệt cho khi nào = null thì dừng lại
            current.displayLink(); // iển thị liên kết hiện tại
            current = current.next; // chuyển sang liên kết tiếp theo
        }
        System.out.println("");
    }
}


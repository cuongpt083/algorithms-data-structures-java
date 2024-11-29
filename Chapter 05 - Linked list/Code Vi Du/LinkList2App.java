public class LinkList2App {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99); // thêm 4 phần tử
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);
        theList.displayList();

        Link f = theList.find(44) ;
        if(f != null) {
            System.out.println("Tìm thấy liên kết với khóa :" + f.iData);
        } else {
            System.out.println("Không tìm thấy liên kết");
        }

        Link d = theList.delete(66);
        if( d != null) {
            System.out.println("Da xoa kien ket voi khoa " + d.iData);
        }else {{
            System.out.println("Khoogn theer xoas lien ket");
        }}

        theList.displayList();
    }
}

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();

        theQueue.insert(20);  // Thêm phần tử
        theQueue.insert(40);
        theQueue.displayQueue(); // Hiển thị hàng đợi

        theQueue.insert(60);  // Thêm phần tử
        theQueue.insert(80);
        theQueue.displayQueue(); // Hiển thị hàng đợi

        theQueue.remove(); // Xóa phần tử
        theQueue.remove();
        theQueue.displayQueue(); // Hiển thị hàng đợi
    }
}

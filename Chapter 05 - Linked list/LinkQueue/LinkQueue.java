public class LinkQueue {
    private FirstLastList theList;
    public LinkQueue() {
        theList = new FirstLastList() ;
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    //Them phan tu vao cuoi hang doi
    public void insert(long j) {
        theList.insertLast(j);
    } 

    //Xoa phan tu o dau hang doi
    public void remove() {
        theList.deleteFirst();
    }

    //Hien thi hang doi
    public void displayQueue() {
        theList.displayList();
    }
}

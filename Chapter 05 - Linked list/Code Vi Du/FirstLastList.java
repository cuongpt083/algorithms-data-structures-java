public class FirstLastList {
    private Link2 first;
    private Link2 last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(long dd) {
        Link2 newLink = new Link2(dd);
        if(isEmpty()) {
            last = newLink; 
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        Link2 newLink = new Link2(dd);
        if(isEmpty()) {
            first = newLink;
        }else{
            last.next = newLink;
        }
        last = newLink;
    }

    public void displayList() {
        System.out.print("Danh sách (first-->last): ");
        Link2 current = first;
        while (current != null) {
            current.displayLisk();
            current = current.next;
        }
        System.out.println("");

    }   

    public long deleteFirst() {
        long temp = first.dData;
        if(first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
}

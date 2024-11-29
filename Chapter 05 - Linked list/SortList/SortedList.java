public class SortedList {
    private Link frist;

    public SortedList() {
        frist= null;
    }

    public boolean isEmpty() {
        return(frist == null);
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = frist;

        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }

        if(previous == null) {
            frist = newLink;
        }else {
            previous.next = newLink;
        }

        newLink.next = current;
    }

    public Link remove() {
        Link temp = frist;
        frist = frist.next;
        return temp;
    }

    public void displayList() {
        Link current = frist;
        System.out.print("List (first-->last): ");
        while (current != null) {
            current.displayLink();
            current= current.next;
        }

        System.out.println("");
    }
}


class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.bubbleSort();
        arr.display();

        long median = arr.median();

        System.out.println("Gia tri cua trung vi la : " + median);

        System.out.println(" sau khi xoa cac phan tu trung lap la :");
        arr.noDups();
        arr.display();
        
    }
}
public class HightArrayApp {
    public static void main(String[] args) { 
        int maxSize = 100;

        OrderedArray orderdArray;
        orderdArray = new OrderedArray(maxSize);

        HightArray arr;
        arr = new HightArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(22);

        arr.display();

        int searchKey = 35;
        if(arr.find(35)) {
            System.out.println("Tim thay" + searchKey);
        }else{
            System.out.println("Khong tim thay " + searchKey);
        }

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.display();


        //Bai 2.1
        System.out.println("Bai 2.1 \n");
        long max = arr.getMax();
        if(max == 1) {
            System.out.println("mang trong rong ");
        } else {
            System.out.println("gia tri lon nhat la : " + max);
        }

        //Bai 2.2
        System.out.println("=====================");
        System.out.println("Bai 2.2 \n");
        long maxRemove = arr.removeMax() ;
        if(maxRemove == -1 ) {
            System.out.println(" Mang trong rong");
        }else {
            System.out.println("Da xoa ra tri " + maxRemove);
        }
        arr.display();

        //Bai 2.3
        System.out.println("=====================");

        System.out.println("Bai 2.3 \n");
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        arr.ascendingArraySort();
        arr.display();

        System.out.println("Mảng sau khi sắp xếp giam dần:");
        arr.descendingArraySort();
        arr.display();

        //Bai 2.4
        System.out.println("=====================");
        System.out.println("Bai 2.4 \n");

    }
}

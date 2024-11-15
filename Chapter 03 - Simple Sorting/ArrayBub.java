//Bai 1 Đẩy số lớn nhất về cuối mảng, sau đó đẩy số nhỏ nhất về đầu mảng.
// Cần dùng 2 chỉ số để chạy: một từ trái sang phải, một từ phải sang trái.

//Bai 2 Thêm median():
// Viết hàm trả về số trung vị (số nằm giữa nếu mảng đã sắp xếp).

// Bai 3
// Thêm noDups():
// Xóa các số trùng lặp trong mảng đã sắp xếp.
// Làm nhanh (O(N)) và không di chuyển số nhiều lần.

//Bai 4 

// Bai 5

// Bai 6

class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    // public void bubbleSort() {
    //     int out, in;
    //     for (out = nElems - 1; out > 1; out--) {
    //         for (in = 0; in < out; in++) {
    //             if (a[in] > a[in + 1]) {
    //                 swap(in, in + 1);
    //             }
    //         }
    //     }
    // }

    public void bubbleSort() {
        int left = 0;             // Chỉ số bên trái
        int right = nElems - 1;   // Chỉ số bên phải
    
        while (left < right) {
            // Đẩy giá trị lớn nhất về cuối
            for (int in = left; in < right; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in + 1);
                }
            }
            right--;
    
            // Đẩy giá trị nhỏ nhất về đầu
            for (int in = right; in > left; in--) {
                if (a[in] < a[in - 1]) {
                    swap(in, in - 1);
                }
            }
            left++; 
        }
    }
    

    //Bai 2
    public long median() {
        if (nElems == 0) {
            System.out.println("Mang rong !");
        }
    
        bubbleSort();
    
        // Tìm trung vị
        int middle = nElems / 2;
        if (nElems % 2 == 0) {
            return (a[middle - 1] + a[middle]) / 2;
        } else {
            return a[middle];
        }
    }

    //Bai 3
    public void noDups() {
        if(nElems == 0) {
            System.out.println("Mang rong !");
        }
        int newIndex = 1; // Vị trí của phần tử tiếp theo không trùng lặp
        for (int i = 1; i < nElems; i++) {
            // Nếu phần tử hiện tại không trùng với phần tử trước đó
            if (a[i] != a[i - 1]) {
                a[newIndex] = a[i];  
                newIndex++;           
            }
        }
        nElems = newIndex; 
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}



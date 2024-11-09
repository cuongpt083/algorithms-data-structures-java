//2.1 thêm method getMax() trả về số lớn nhất , nếu mảng trống chả về trừ 1

//2.2 dùng removeMax() để xóa số lớn nhất   

// 2.3 gọi phương thức removeMax()  trong hàm main() . thực hiện sắp xếp 2 mảng ngược nhau 

// 2.4 Sửa đổi chương trình orderArray.java sao cho hàm insert() và
// các thủ tục delete(), cũng như find(), hãy sử dụng tìm kiếm nhị phân

//2.5 thêm phuong thức merge() để gộp 2 mảng thành 1 mảng được sắp xệp 
// viết trong hàm main() để chèn phần tử vào 2 mảng

//2.6 them phuong thuc noDups() cho lop HightArrayApp() để xóa các phần tử trùng lặp


//Doan code co san
public class HightArray {
    private long[] a;
    private int nElems ;

    public HightArray(int max) {
        a = new long[max];
        nElems = 0;
    }


    // tìm kiem phan tu
    public boolean find(long searchKey) {
        int j;
        for(j = 0 ; j < nElems ; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }

        if(j == nElems) {
            return false;
        }else {
            return true;
        }
    }
    // chen phan tu
    public void insert(long value) {
        a[nElems] = value;
        nElems ++;
    }
    
    // xoa phan tu
    public boolean delete(long value) {
        int j;
        for(j = 0 ; j < nElems ; j++ ) {
            if( value == a[j]){
                break;
            }
        }

        if(j == nElems) {
            return false;
        } else {
            for(int k = j ; k < nElems ; k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    // hien thi mang
    public void display() {
        for(int j = 0 ; j < nElems ; j++) {
            System.out.println(a[j] + " ");
        }
        System.out.println(" ");
    }

    //Bai 2.1
    public long getMax() {
        if (nElems == 0 ) {
            return -1;
        }
        
        long max = a[0];
        for(int i = 1 ; i < nElems ; i ++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //bai 2.2
    public long removeMax() {
        if (nElems == 0 ) {
            return -1;
        }
        //Lấy chỉ số và giá trị phần tử có giá trị lớn nhất
        long maxRemove = a[0];
        int maxIndex = 0;
        for(int i = 1 ; i < nElems ; i ++) {
            if(a[i] > maxRemove) {
                maxRemove = a[i];
                maxIndex = i;
            }
        }

        // Xóa phần tử lớn nhất khỏi mảng
        for ( int j = maxIndex ; j < nElems -1  ; j ++) {
            a[j] = a[j+1];
        }
        nElems--;
        return maxRemove;
    }

    //Bai 2.3 sắp xếp tăng dần
    public void ascendingArraySort() {
        long temp ;
        for(int i = 0 ; i < nElems - 1 ; i++) {
            for(int j = i+ 1 ; j < nElems ; j++) {
                if(a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public void descendingArraySort() {
        long temp;
        for(int i = 0 ; i < nElems - 1 ; i++) {
            for( int j = i + 1 ; j < nElems ; j ++) {
                if(a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

}

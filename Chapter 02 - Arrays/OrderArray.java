class OrderedArray {
    private long[] a;
    private int nElems;

    public OrderedArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    // Tìm kiếm nhị phân 
    public boolean find(long searchKey) {
        int low = 0;
        int high = nElems - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == searchKey) {
                return true; 
            } else if (a[mid] < searchKey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false; 
    }

    // Chèn phần tử với tìm kiếm nhị phân
    public void insert(long value) {
        int low = 0;
        int high = nElems - 1;
        int insertIndex = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        insertIndex = low; 

        for (int j = nElems; j > insertIndex; j--) {
            a[j] = a[j - 1];
        }

        a[insertIndex] = value;
        nElems++;
    }

    // Xóa phần tử với tìm kiếm nhị phân
    public boolean delete(long value) {
        int low = 0;
        int high = nElems - 1;
        int deleteIndex = -1;

        // Tìm phần tử bằng tìm kiếm nhị phân
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                deleteIndex = mid; 
                break;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (deleteIndex == -1) {
            return false;
        }

        for (int j = deleteIndex; j < nElems - 1; j++) {
            a[j] = a[j + 1];
        }

        nElems--; 
        return true;
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }
}


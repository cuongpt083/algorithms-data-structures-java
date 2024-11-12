/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2_Array.bai24_25;

/**
 *
 * @author ADMIIN
 */
public class OrdArray {

    private long[] a; // ref to array a
    private int nElems; // number of data items
//-----------------------------------------------------------

    public OrdArray(int max) // constructor
    {
        a = new long[max]; // create array
        nElems = 0;
    }
//-----------------------------------------------------------

    public int size() {
        return nElems;
    }
//-----------------------------------------------------------
//Bài 2.4
    //Hàm timg kiếm sử dụng nhị phân
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (lowerBound <= upperBound) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn; // Tìm thấy phần tử
            } else if (a[curIn] < searchKey) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }
        return -1; 
    }//end find

    public void insert(long value) // put element into array
    {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (lowerBound <= upperBound) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] < value) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }

        for (int j = nElems; j > lowerBound; j--) {
            a[j] = a[j - 1];
        }
        a[lowerBound] = value;
        nElems++;
    } // end insert()

    public boolean delete(long value) {
        int j = find(value);
        if (j == -1) {
            return false; 
        } else {
            for (int k = j; k < nElems - 1; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    } // end delete()
//-----------------------------------------------------------

    public void display() // displays array contents
    {
        for (int j = 0; j < nElems; j++) // for each element,
        {
            System.out.print(a[j] + " "); // display it
        }

        System.out.println("");
    }
//-----------------------------------------------------------
//Bài 2.5
    //Hàm kết hợp 2 mảng
    public static OrdArray merge(OrdArray arr1, OrdArray arr2) {
        int size1 = arr1.size();
        int size2 = arr2.size();
        OrdArray result = new OrdArray(size1 + size2);

        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (arr1.a[i] < arr2.a[j]) {
                result.a[k++] = arr1.a[i++];
            } else {
                result.a[k++] = arr2.a[j++];
            }
        }

        while (i < size1) {
            result.a[k++] = arr1.a[i++];
        }

        while (j < size2) {
            result.a[k++] = arr2.a[j++];
        }

        result.nElems = k;
        return result;
    }
//-----------------------------------------------------------
}

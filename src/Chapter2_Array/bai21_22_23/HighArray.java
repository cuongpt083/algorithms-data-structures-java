/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.iava to edit this template
 */
package Chapter2_Array.bai21_22_23;

/**
 *
 * @author ADMIN
 */
public class HighArray {

    private long[] arr;
    private int nElems;

    //-----------------------------------------------------------
    public HighArray(int max) {
        arr = new long[max];
        nElems = 0;
    }

    //-----------------------------------------------------------
    //Bài 2.1
    //Hàm lấy giá trị lớn nhất của mảng
    public long getMax() {
        long numberMax = arr[0];
        int i;
        if (nElems == 0) {
            return -1;
        }

        for (i = 0; i < nElems; i++) {
            if (arr[i] > numberMax) {
                numberMax = arr[i];
            }
        }
        return numberMax;
    }

    //-----------------------------------------------------------
    public void insert(long value) {
        arr[nElems] = value;
        nElems++;
    }

    //-----------------------------------------------------------
    //Bài 2.2
    //Hàm xoá giá trị lớn nhất
    public boolean removeMax(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (value == arr[i]) {
                break;
            }
        }

        for (int k = i; k < nElems; k++) {
            arr[k] = arr[k + 1];
        }
        nElems--;
        return true;

    } // end delete()

    //-----------------------------------------------------------
    public void display() {              
        for (int i = 0; i < nElems; i++) {  
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }
}

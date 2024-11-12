/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2_Array.bai26;

/**
 *
 * @author ADMIIN
 */
public class HighArray {
    private long[] a; 
    private int nElems; 

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    
    //Hàm thêm phần tử
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    //Hàm in ra mảng
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    //Hàm giảm số lượng phần tử bị trùng lặp
    public void noDups() {
        for (int i = 0; i < nElems; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) { 
                    a[j] = a[nElems - 1]; 
                    nElems--; 
                    j--; 
                }
            }
        }
    }
}

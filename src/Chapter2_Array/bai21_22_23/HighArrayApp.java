/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2_Array.bai21_22_23;

/**
 *
 * @author ADMIIN
 */
public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;              // array size
        HighArray arr = new HighArray(maxSize); // create the array
        long [] a = new long[10];

        // Insert 10 items
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        //-----------------------------------------------------------
        long numberMax = arr.getMax();
        System.out.println("NumberMax: " + numberMax);
        //-----------------------------------------------------------
        arr.removeMax(numberMax);
        //-----------------------------------------------------------
        //Bài 2.3
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.getMax();
            arr.removeMax(arr.getMax());
        }
        
        for (int i = 0; i < a.length -1; i++) {
            System.out.print(a[i] + " ");
        }
        //-----------------------------------------------------------
    }
}

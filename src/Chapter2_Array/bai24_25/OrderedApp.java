/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2_Array.bai24_25;

/**
 *
 * @author ADMIIN
 */
public class OrderedApp {

    public static void main(String[] args) {
        int maxSize = 100; // array size
        OrdArray arr1 = new OrdArray(maxSize); // create the array
        OrdArray arr2 = new OrdArray(maxSize);
        arr1.insert(77); // insert 10 items
        arr1.insert(99);
        arr1.insert(44);
        arr1.insert(55);
        arr1.insert(22);
        arr1.insert(88);
        arr1.insert(11);
        arr1.insert(00);
        arr1.insert(66);
        arr1.insert(33);
        
        
        arr2.insert(11);
        arr2.insert(00);
        arr2.insert(66);
        arr2.insert(33);

        arr1.display();
        arr2.display();
        
        int searchKey = 55; // search for item
        if (arr1.find(searchKey) != arr1.size()) {
            System.out.println("Found" + searchKey);

        } else {
            System.out.println("Can’t find" + searchKey);
        }
        OrdArray mergeAray = OrdArray.merge(arr1, arr2);
        mergeAray.display();
        arr1.delete(00); // delete 3 items
        arr1.delete(55);
        arr1.delete(99);
        arr1.display();
    }
}

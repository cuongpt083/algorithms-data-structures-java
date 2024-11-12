/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2_Array.bai26;

/**
 *
 * @author ADMIIN
 */
public class HighArrayApp {
    public static void main(String[] args) {
        HighArray arr = new HighArray(20);

        arr.insert(10);
        arr.insert(20);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(30);
        arr.insert(10);
        arr.insert(50);

   
        arr.display();
        arr.noDups();
        arr.display();
    }
}

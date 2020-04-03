/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.TreeSet;
/**
 *
 * @author Sanjay
 */
public class Treeset {
    public static void m3(){
    System.out.println("Student list Department wise[Treeset]");
    TreeSet<String> list=new TreeSet<>();
        list.add("CSE-250");
        list.add("ECE-220");
        list.add("CIVIL-205");
        list.add("MECH-260");
        list.add("EEE-200");
        list.add("CHEMICAL-120");
        System.out.println(list);
        list.add("CSE-250");
        list.add("ECE-220");
        list.add("BIO-100");
        System.out.println(list);
        list.remove("CSE-250");
        list.remove("ECE-220");
        System.out.println(list);
    }
    
}

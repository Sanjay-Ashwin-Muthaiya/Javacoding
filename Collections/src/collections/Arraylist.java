/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Sanjay
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Student list Department wise[Arraylist]");
        ArrayList<String> list=new ArrayList<>();
        list.add("CSE-250");
        list.add("ECE-220");
        list.add("CIVIL-205");
        list.add("MECH-260");
        list.add("EEE-200");
        list.add("CHEMICAL-120");
        System.out.println(list);
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext())
        {
        String value=iterator.next();
        System.out.println(value);
        }
        list.add("CSE-250");
        list.add("ECE-220");
        System.out.println(list);
        list.remove("CSE-250");
        list.remove("ECE-220");
        System.out.println(list);
         System.out.println("");
        Linkedlist.m1();
        System.out.println("");
        Hashset.m2();
        System.out.println("");
        Treeset.m3();
        System.out.println("");
        Linkedhashset.m4();
        
    }
    
}

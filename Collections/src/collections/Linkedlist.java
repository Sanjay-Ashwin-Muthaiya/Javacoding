/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author Sanjay
 */
public class Linkedlist {
   public static void m1() {
        System.out.println("Student list Department wise[Linkedlist]");
        LinkedList<String> list=new LinkedList<>();
        list.add("CSE-250");
        list.add("ECE-220");
        list.add("CIVIL-205");
        list.add("MECH-260");
        list.add("EEE-200");
        list.add("CHEMICAL-120");
        System.out.println(list);
        if (list.contains("CSE-250"))
        {
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        list.add("CSE-250");
        list.add("ECE-220");
        System.out.println(list);
        list.remove("CSE-250");
        list.remove("ECE-220");
        System.out.println(list);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.HashSet;
/**
 *
 * @author Sanjay
 */
public class Hashset {
    public static void m2(){
        System.out.println("Student list Department wise[Hashset]");
    HashSet<String> list=new HashSet<>();
        list.add("CSE-250");
        list.add("ECE-220");
        list.add("CIVIL-205");
        list.add("MECH-260");
        list.add("EEE-200");
        list.add("CHEMICAL-120");
        System.out.println(list);
        list.add("CSE-250");
        list.add("ECE-220");
        System.out.println(list);
        list.remove("CSE-250");
        list.remove("ECE-220");
        System.out.println(list);
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

/**
 *
 * @author Sanjay
 */
import java.util.Scanner;
public class ExceptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=10;
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
      // int c=a/b;
       try{
       System.out.println(a/b);
       }
       catch(ArithmeticException ae){
           System.out.println("Check the input");
       }
       
       
    }
    
}

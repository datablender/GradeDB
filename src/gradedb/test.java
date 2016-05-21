/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedb;

/**
 *
 * @author Sujay
 */
public class test {
    
      public static void main(String[] args)
      {
        // TODO code application logic here
        String test;
        Address currAdd = new Address("77","Singleton Road","Toronto","Ontario","Canada");
        test = currAdd.getAddress();
        System.out.println(test);
      }
      
    
}

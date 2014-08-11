/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singeleton;

/**
 *
 * @author aerdy
 */
public class Singeleton {

   private static Singeleton;
   
   private Singeleton(){
       
   }
   public Singeleton getInstance(){
     if (singeleton==null){
         singeleton = new Singeleton();
     }  
     return singeleton;
   }
}

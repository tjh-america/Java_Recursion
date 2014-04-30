/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
public class LinkedLength {
  LinkList list;
  int num = 0;
  
  
  
  
  
  int LinkedLength(LinkList list, Node head){
      
     
      if (head.next== null ){
          return num +1;
      }
      else{
          
          return num +1 + LinkedLength(list, head.next);
         
      }
      }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
public class Euclid {
    int a;
    int b;
    int Euclid( int a , int b )
{
    if (a==b){
        return a;
        
    }
    else if(a>b){
        return Euclid((a-b), b);
    }
    else{
            return Euclid(a, (b-a));
        }
    }
}
    



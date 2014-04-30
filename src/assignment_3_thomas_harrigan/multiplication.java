/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
public class multiplication {
    int m;
    int n;
    double multiplication(int m, int n){
        if(n==1){
            return m;
            
        }
        else
            return m + multiplication(m, n-1 );
    }
    
}

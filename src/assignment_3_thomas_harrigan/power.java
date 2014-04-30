/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
public class power {
    double base;
    int exponent;
     double power(double base, int exponent){
        if(exponent>=1){
    return base* power(base, exponent-1);
    }
        else {
            return 1;
        }
    }
}


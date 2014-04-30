/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;

/**
 *
 * @author user
 */
public class Reverse {
    public static String Reverse(String str) {
    if ((null == str) || (str.length()  <= 1)) {
        return str;
    }
    return Reverse(str.substring(1)) + str.charAt(0);
}
    
}

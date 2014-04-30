/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3_thomas_harrigan;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Assignment_3_Thomas_Harrigan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int selection = 0;
    Scanner keyboard = new Scanner(System.in);
    boolean run = true;
    while(run == true){
    System.out.println("Press 1 to evaluate a power function.");
    System.out.println("Press 2 for multiplication.");
    System.out.println("Press 3 to reverse a string.");
    System.out.println("Press 4 to test the length of a linked list.");
    System.out.println("Press 5 to evaluate Euclid's algorithm.");
    System.out.println("Press 6 to exit.");
    selection = keyboard.nextInt();
    if (selection==1){
        System.out.println("You have selected power function.");
        System.out.println("Please enter the base first, followed by the power to raise to.");
        double base = keyboard.nextDouble();
        int exponent = keyboard.nextInt();
        power test = new power();
        test.base = base;
        test.exponent = exponent;
        double answer = test.power(base, exponent);
        System.out.println("The answer is: "+answer);
    }
    else if (selection ==2){
        System.out.println("You have selected multiplication.");
        System.out.println("Please enter the two numbers to multiply, in seperate lines.");
        int m = keyboard.nextInt();
        int n = keyboard.nextInt();
        multiplication test = new multiplication();
        System.out.println(test.multiplication(n, m));
        
    
    }
    else if (selection == 3){
        System.out.println("You have selected to reverse a string.");
        System.out.println("Please enter the string you wish to reverse.");
        String test = keyboard.next();
        Reverse string = new Reverse();
        System.out.println(string.Reverse(test));
        
    }
    else if(selection == 4){
        System.out.println("You have selected Linked List Length");
        LinkList list = new LinkList();
        list.append(35);
        list.append(33);
        list.append(30);
        list.append(28);
        list.append(25);
        
        
        
        LinkedLength length = new LinkedLength();
        length.list=list;
        int num = length.LinkedLength(list, list.head());
        System.out.println(num);
        
        
        
    }
    else if(selection == 5){
        System.out.println("You have selected Euclid's Algorithm.");
        System.out.println("Please enter two numbers to find their greatest common denominator.");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        Euclid gcd = new Euclid();
        System.out.println(gcd.Euclid(a, b));
    }
    else if(selection == 6){
        run = false;
    }
    else {
        System.out.println("The system could not parse your input, please try again.");
        continue;
    }
    }
   
}
}

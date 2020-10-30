/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationdowhile;

/**
 *
 * @author sabakhalid
 */
public class JavaApplicationdowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do
        {
            sum = sum + i;
            i++;
        }
        while(i<5);
        System.out.println("Total sum;" +sum);
        // TODO code application logic here
    }
    
}

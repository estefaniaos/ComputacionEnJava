/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

import java.util.Scanner;

/**
 *
 * @author Estefania
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       int x, y;
       Scanner txt = new Scanner(System.in); 
       
       System.out.println("Ingresa el valor del primer atributo:");
       x = txt.nextInt();
       System.out.println("Ingresa el valor del segundo atributo:");
       y = txt.nextInt();
       
       System.out.println();
       System.out.println("=======================================");
       System.out.println("Operaciones con atributos");
       System.out.println("=======================================");
       System.out.println(x + " + " + y + " = " + (x+y));
       System.out.println(x + " - " + y + " = " + (x-y));
       System.out.println(x + " * " + y + " = " + (x*y));
       System.out.println(x + " / " + y + " = " + (x/y));
       System.out.println(x + " % " + y + " = " + (x%y));
    }
    
}

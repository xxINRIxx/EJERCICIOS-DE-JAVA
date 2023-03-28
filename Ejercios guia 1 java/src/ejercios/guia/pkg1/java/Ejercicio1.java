/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercios.guia.pkg1.java;

import java.util.Scanner;

/**
 *
 * @author CTI6458
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println(" inegrese dos numeros enteros");
        num1 =leer.nextInt();
        num2= leer.nextInt();
        System.out.println("num2 = " + num2);
        System.out.println("La suma de los nuemros es: " +(num1 + num2) );
        
      
            

    }

}

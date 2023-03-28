
package ejercios.guia.pkg1.java;

import java.util.Scanner;


public class Refuerzos2 {

    
    public static void main(String[] args) {
  
  Scanner CONSOLA = new Scanner(System.in);       
  System.out.println("Ingresar dos numeros entreos ");
  
  int num1 = CONSOLA.nextInt();
  int num2 = CONSOLA.nextInt();
  int num3 = num1;
  num1 = num2;
  num2 = num3;
        System.out.println("los valores invertidos son: " + num1 + "  " + num2);
          
 
  
  
          
  
  
    }

}
/*Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y
mostrar el resultado final por pantalla.
Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa
deberá mostrar: num1 = 3 y num2 = 9
Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.*/

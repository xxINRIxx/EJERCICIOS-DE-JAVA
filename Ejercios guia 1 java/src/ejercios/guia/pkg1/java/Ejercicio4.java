
package ejercios.guia.pkg1.java;

import java.util.Scanner;


public class Ejercicio4 {

   // 
    public static void main(String[] args) {
  double  Grados;
  Scanner consola = new Scanner(System.in);
  System.out.println("Ingrese los grados entigrados a convertir");
  Grados = consola.nextDouble();
  double F = 32 + (9 * Grados /5);
  System.out.println(" Los grados ingresados son equivalentes a:" + F );
  
  
  
    }

}

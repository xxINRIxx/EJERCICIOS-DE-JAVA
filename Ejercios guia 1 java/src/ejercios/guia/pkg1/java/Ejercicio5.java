
package ejercios.guia.pkg1.java;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
  int numero;
  Scanner consola = new Scanner (System.in);
  System.out.println("ingrese un valor");
  numero = consola.nextInt();
  double doble = numero *2;
  int triple = numero *3;
  double raiz = Math.sqrt(numero);
  System.out.println(" El doble del numero es " + Math.round(doble));
  System.out.println(" El triple del numero es " + triple);
  System.out.println(" La raiz del numero es " + raiz);
          
    }

}

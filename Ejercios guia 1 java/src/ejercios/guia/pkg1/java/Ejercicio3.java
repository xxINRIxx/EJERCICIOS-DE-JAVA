
package ejercios.guia.pkg1.java;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
    String frase;
    Scanner  consola = new Scanner(System.in);
        System.out.println("Escriba una frase");
        frase = consola.nextLine();
        System.out.println("la frease en mayuscula es " + frase.toUpperCase() ); 
        System.out.println(" La frase en minusculas es " + frase.toLowerCase());
        
          }

}

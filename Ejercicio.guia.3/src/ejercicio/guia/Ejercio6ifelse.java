
package ejercicio.guia;

import java.util.Scanner;


public class Ejercio6ifelse {

    
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 >= 25 & num2 >= 25) {
            System.out.println("ambos numeros son mayores o iguales a 25");
            
            
            }else if (num1 < 25 & num2 < 25){
                System.out.println("Ambos numeros son menores a 25");
               }else if (num1 > 25 & num2 < 25){
                   System.out.println("El primer numero es mayor a 25 pero el segundo no ;( ");
                  }else{
                   System.out.println("El segundo es mayor pero el primero no" );
        }
           
    }
    }



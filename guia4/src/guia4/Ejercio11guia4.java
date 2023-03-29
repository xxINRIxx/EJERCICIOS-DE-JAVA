/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la 
siguiente manera: cada vocal se reemplaza por el carácter que se indica en la 
tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.

*/

package guia4;

import java.util.Scanner;



public class Ejercio11guia4 {

    
    public static void main(String[] args){
  
    Scanner consola = new Scanner(System.in);
    String frase; 
    String fraseFinal = ""; 
        do {
        System.out.println("iNGRESE palabra");
        frase = consola.nextLine();
            if (frase.equals(".") ) {
                break;                
            }
   
    fraseFinal = fraseFinal + frase + " ";  
     
                 
        } while (true);
     System.out.println(fraseFinal);     
        System.out.println(cambio(fraseFinal));   
 
      }
    public static String cambio(String frase) {
        String FraseN = "";
        int longitud = frase.length();
        for (int i = 0; i < longitud; i++) {
            switch (frase.substring(i, i + 1)) {
                case "a":
                    FraseN += ('@');
                    break;
                case "e":
                    FraseN += ("#");
                    break;

                case "i":
                    FraseN += ("$");

                case "o":
                    FraseN += ("%");
                    break;
                case "u":
                    FraseN += ("*");
                    break;
                default:
                    FraseN += frase.substring(i,i+1);          
        
   

            }
        }
        return FraseN;
        }
    }
  
   

package ejercios.guia.pkg1.java;

import java.util.Scanner;


public class refuerzos {

    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el radio de una circunsferencia");
        int radio = consola.nextInt();
        double area = Math.PI *(radio*radio);
        double peri = 2 * Math.PI * radio;
        
        System.out.println("El area del circulo es ¨" + area);
        System.out.println("El peri del circulo es ¨" + peri);
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoKilovatio;
        double numeroKilovatios = 0;
        double valorTotal;
        int edad = 0;
        int porcentaje = 10;
        double descuento;

        System.out.println("Ingrese el valor de costo por kilovatio");
        costoKilovatio = entrada.nextDouble();

        System.out.println("Ingrese el numero de kilovatios consumidos en el mes");
        costoKilovatio = entrada.nextDouble();

        valorTotal = (costoKilovatio * numeroKilovatios);
        if (edad >= 65) {
            descuento = (porcentaje * valorTotal) / 100;
            valorTotal = valorTotal - descuento;

            

        }
        
        System.out.printf("el valor a pagar es: %.2f", valorTotal);

    }

}

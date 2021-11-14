/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;

        double impuestoPagar;
        double precioVenta;
        double porcentajeAlemania = 20;
        double porcentajeJapon = 30;
        double porcentajeItalia = 15;
        double porcentajeUsa = 8;

        double impuestoAlemania;
        double impuestoJapon;
        double impuestoItalia;
        double impuestoUsa;

        System.out.println("Ingrese la marca del vehículo");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del vehículo");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del vehículo");
        costo = entrada.nextDouble();

        if (costo <= 0) {
            System.out.println("El valor ingresado no es válido");
        } else {
            if (origen.equals("Alemania")) {
                impuestoAlemania = (costo * porcentajeAlemania) / 100;
                precioVenta = impuestoAlemania + costo;
                System.out.printf("El impuesto por pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n", impuestoAlemania,
                        precioVenta);
            } else {
                if (origen.equals("Japon")) {
                    impuestoJapon = (costo * porcentajeJapon) / 100;
                    precioVenta = impuestoJapon + costo;
                    System.out.printf("El impuesto por pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n", impuestoJapon,
                            precioVenta);
                } else {
                    if (origen.equals("Italia")) {
                        impuestoItalia = (costo * porcentajeItalia) / 100;
                        precioVenta = impuestoItalia + costo;
                        System.out.printf("El impuesto por pagar es: %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuestoItalia, precioVenta);
                    } else {
                        if (origen.equals("Usa")) { 
                            impuestoUsa = (porcentajeUsa * costo) / 100;
                            precioVenta = impuestoUsa + costo ;
                            System.out.printf("El impuesto por pagar es: %.2f\n" +
                                    
                                    "El precio de venta total es: %.2f\n", impuestoUsa,
                                    precioVenta);
                        }
                            
                        }
                    
                }
                
            }

        }
    }
}

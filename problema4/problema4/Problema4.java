/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author SALAA
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int numeroDias;
        double precioHabitacion;
        double subtotal;
        double descuento1;
        double porcentaje1 = 10;
        double totalPagar = 0;
        double descuento2 = 0;
        double porcentaje2 = 15;
        double descuento3 = 0;
        double porcentaje3 = 20;
        System.out.println("Ingrese el numero de dias en la hosteria");
        numeroDias = entrada.nextInt();
        System.out.println("Ingrese el precio de la habitacion");
        precioHabitacion = entrada.nextDouble();

        subtotal =  numeroDias * precioHabitacion;
        
        if ( numeroDias <= 5 && numeroDias >=0 ) {
            totalPagar = subtotal;
            

        } else {

            if (numeroDias > 5 && numeroDias <= 10) {
                descuento1 = (porcentaje1 * subtotal) / 100;
                totalPagar = subtotal - descuento1;
            } else {
                if (numeroDias > 10 && numeroDias <= 15) {
                    descuento2 = (porcentaje2 * subtotal) / 100;
                    totalPagar = subtotal - descuento2;
                } else {
         
                        descuento3 = (porcentaje3 * subtotal) / 100;
                        totalPagar = subtotal - descuento3;
                         
                    }
                }
            }
                System.out.printf("El valor total a pagar es %.2f\n", totalPagar);
                System.out.printf("El subtotal a pagar es %.2f", subtotal);
                

            }

        }
    

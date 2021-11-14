/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import static java.time.Clock.system;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descripcion;
        double cantidadRequerida;
        double precioUnitario;
        double porcentaje = 15;
        double descuento;
        double valorTotal;

        System.out.println("Ingrese la descripción del producto");
        descripcion = entrada.nextLine();

        System.out.println("Ingrese la cantidad de los artículos requeridos");
        cantidadRequerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del artículo");
        precioUnitario = entrada.nextDouble();

        valorTotal = cantidadRequerida * precioUnitario;

        if (cantidadRequerida > 50) {
            descuento = (porcentaje * valorTotal) / 100;
            valorTotal = valorTotal - descuento;

        } else {
            if (cantidadRequerida < 0 || precioUnitario < 0) {
                System.out.println("Los datos ingresados están fuera de rango");
            }
        }

        System.out.printf("El valor total a pagar es: %.2f\nDescripcion:%s \n", 
                valorTotal,descripcion);
    

    
      
               
        
        
        
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class arrays_recursivos {
    
    public static void imprimirArrayRecursivo(double[] array, int index) {
        if (index < array.length) {
            System.out.println("Precio: $" + array[index]);
            imprimirArrayRecursivo(array, index + 1);
        }
    }
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        
        // Modificar el tercer precio (índice 2)
        precios[2] = 129.99;
        
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
   }

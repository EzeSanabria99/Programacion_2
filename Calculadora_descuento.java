/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
import java.util.Scanner;

public class Calculadora_descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = scanner.next();
        
        double descuento = 0;
        
        switch (categoria.toUpperCase()) {
            case "A" -> descuento = 0.10;
            case "B" -> descuento = 0.15;
            case "C" -> descuento = 0.20;
            default -> {
                System.out.println("Categoria no valida.");
                return;
            }
        }
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
        scanner.close();
    }
}
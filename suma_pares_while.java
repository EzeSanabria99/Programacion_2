/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */

import java.util.Scanner;

public class suma_pares_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        
        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt();
            
            if (numero != 0 && numero % 2 == 0) {
                suma += numero;
            }
        } while (numero != 0);
        
        System.out.println("La suma de los numeros pares es: " + suma);
        
        scanner.close();
    }
}

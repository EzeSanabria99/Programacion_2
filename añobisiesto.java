
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */public class añobisiesto {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un año: ");
            int año = scanner.nextInt();
            
            boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
            
            if (esBisiesto) {
                System.out.println("El año " + año + " es bisiesto.");
            } else {
                System.out.println("El año " + año + " no es bisiesto.");
            }
        }
    }
}
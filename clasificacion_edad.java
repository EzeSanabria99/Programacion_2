
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class clasificacion_edad {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            
            if (edad < 12) {
                System.out.println("Eres un Infante.");
            } else if (edad <= 17) {
                System.out.println("Eres un Adolescente.");
            } else if (edad <= 59) {
                System.out.println("Eres un Adulto.");
            } else {
                System.out.println("Eres un Adulto mayor.");
            }
        }
    }
}
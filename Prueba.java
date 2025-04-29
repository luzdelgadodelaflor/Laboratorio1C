/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
public class Prueba{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Calculadora");
            System.out.println("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("Seleccione una operación: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            int opcion = scanner.nextInt();
            
            double resultado;
        }
    }
}
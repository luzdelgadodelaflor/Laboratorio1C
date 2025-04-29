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
            System.out.println("5. potencia");
            System.out.println("6. Raiz Cuadrada");
            int opcion = scanner.nextInt();
            
            double resultado;
            switch (opcion) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero.");
                        return;
                    }
                    resultado = num1 / num2;
                    
                }
                case 5 -> {
                    System.out.println("Ingrese el exponente: ");
                    double exponente = scanner.nextDouble();
                    resultado = Math.pow(num1, exponente);
                }
                case 6 -> {
                    if (num1 < 0) {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                        return;
                    }
                    resultado = Math.sqrt(num1);
                }
                default -> {
                    System.out.println("Opción no válida.");
                    return;
                }
            }
            System.out.println("El resultado es: " + resultado);
        }
    }
}
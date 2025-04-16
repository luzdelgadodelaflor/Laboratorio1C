/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorioc1;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class LaboratorioC1 {
    
private static final Scanner scanner = new Scanner(System.in);
    private static final Validador validador = new Validador();
    

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> validarTexto();
                case 2 -> validarEntero();
                case 3 -> validarFecha();
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();

        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("|       Validador de Datos     |");
        System.out.println("--------------------------------");
        System.out.println("|[1] Validar texto             |");
        System.out.println("|[2] Validar número entero    |");
        System.out.println("|[3] Validar fecha (dd/MM/yyyy)|");
        System.out.println("|[4] Salir                     |");
        System.out.println("--------------------------------");
    }

    private static void validarTexto() {
        System.out.print("Ingrese texto: ");
        String entrada = scanner.nextLine();
        boolean resultado = validador.validarTexto(entrada);
       if(resultado ){
           System.out.println("-> Texto válido" );
       }else{
           System.out.println("Texto inválido. Debe ser un texto");
       }
    }

    private static void validarEntero() {
        int numero = leerEntero("Ingrese un número entero: ");
        boolean esValido = validador.validarEntero(numero);
          System.out.println("-> Número válido" );
    }

    private static void validarFecha() {
        System.out.print("Ingrese una fecha en formato dd/MM/yyyy: ");
        String en = scanner.nextLine();

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            Date fecha = formato.parse(en);

            boolean resultado = validador.validarFecha(fecha);
            if (resultado) {
                System.out.println("Fecha válida.");
            } else {
                System.out.println("Fecha inválida. Debe ser la de hoy fecha");
            }
        } catch (ParseException e) {
            System.out.println("Error de formato. Use dd/MM/yyyy");
        }
    }


    private static int leerEntero(String mensaje) {
        int numero = 0;
        while (true) {
            System.out.print(mensaje);
            String input = scanner.nextLine();
            try {
                numero = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("-> Numero inválida. Debe ser un número entero.");
            }
        }
        return numero;
    }

    
}
    


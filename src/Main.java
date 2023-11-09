import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosIntroducidos = false;
        boolean calculoRealizado = false;
        int eleccion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Introducir gastos de los viajeros");
            System.out.println("2. Calcular reparto de gastos");
            System.out.println("3. Mostrar el reparto entre los viajeros");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            eleccion = scanner.nextInt();

            if (eleccion == 1) {
                datosIntroducidos = true;
                // lógica para introducir los gastos
                System.out.println("Gastos de los viajeros introducidos.");
            } else if (eleccion == 2) {
                if (!datosIntroducidos) {
                    System.out.println("Primero debes ejecutar la opción 1.");
                } else {
                    calculoRealizado = true;
                    // lógica para calcular el reparto de gastos
                    System.out.println("Reparto de gastos calculado.");
                }
            } else if (eleccion == 3) {
                if (!calculoRealizado) {
                    System.out.println("Primero debes ejecutar la opción 2.");
                } else {
                    // lógica para mostrar el reparto de gastos
                    System.out.println("Reparto de gastos mostrado.");
                }
            } else if (eleccion == 4) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
        } while (eleccion != 4);
        System.out.println("Hola");
    }
}
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
            float viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
            int numeroViajeros=5;
            float total=0;

            if (eleccion == 1) {
                datosIntroducidos = true;
                // lógica para introducir los gastos
                System.out.println("¿Cuanto tiene que pagar el viajero 1?");
                viajero1 = scanner.nextFloat();
                System.out.println("¿Cuanto tiene que pagar el viajero 2?");
                viajero2 = scanner.nextFloat();
                System.out.println("¿Cuanto tiene que pagar el viajero 3?");
                viajero3 = scanner.nextFloat();
                if (viajero3<0) {
                    viajero3=0;
                    numeroViajeros-=3;
                }else {
                    System.out.println("¿Cuanto tiene que pagar el viajero 4?");
                    viajero4 = scanner.nextFloat();
                    if (viajero4<0) {
                        viajero4=0;
                        numeroViajeros-=2;
                    }else {
                        System.out.println("¿Cuanto tiene que pagar el viajero 5?");
                        viajero5 = scanner.nextFloat();
                        if (viajero5<0) {
                            viajero5=0;
                            numeroViajeros--;
                        }
                    }
                }

                total=viajero1+viajero2+viajero3+viajero4+viajero5;
                System.out.println(total +" "+numeroViajeros);

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
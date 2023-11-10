import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean datosIntroducidos = false;
        boolean calculoRealizado = false;
        int eleccion;
        float total = 0;
        float viajero1 = 0, viajero2 = 0, viajero3 = 0, viajero4 = 0, viajero5 = 0;
        int numeroViajeros = 5;
        float media=0;

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
                System.out.println("¿Cuanto tiene que pagar el viajero 1?");
                viajero1 = scanner.nextFloat();
                System.out.println("¿Cuanto tiene que pagar el viajero 2?");
                viajero2 = scanner.nextFloat();
                System.out.println("¿Cuanto tiene que pagar el viajero 3?");
                viajero3 = scanner.nextFloat();
                if (viajero3 < 0) {
                    viajero3 = 0;
                    numeroViajeros -=3;
                }else {
                    System.out.println("¿Cuanto tiene que pagar el viajero 4?");
                    viajero4 = scanner.nextFloat();
                    if (viajero4 < 0) {
                        viajero4 = 0;
                        numeroViajeros -=2;
                    }else {
                        System.out.println("¿Cuanto tiene que pagar el viajero 5?");
                        viajero5 = scanner.nextFloat();
                        if (viajero5 < 0) {
                            viajero5 = 0;
                            numeroViajeros--;
                        }
                    }
                }

                total=viajero1+viajero2+viajero3+viajero4+viajero5;
                media=total/numeroViajeros;
                System.out.println("El total es: "+ total);

                System.out.println("Gastos de los viajeros introducidos.");
            } else if (eleccion == 2) {
                if (!datosIntroducidos) {
                    System.out.println("Primero debes ejecutar la opción 1.");
                } else {
                    calculoRealizado = true;

                    System.out.println("Reparto de gastos calculado.");
                    System.out.println("Cada viajero debe de pagar "+media);
                }
            } else if (eleccion == 3) {
                if (!calculoRealizado) {
                    System.out.println("Primero debes ejecutar la opción 2.");
                } else {
                    if (viajero1>media) {
                        viajero1=viajero1-media;
                        System.out.println("Al viajero 1 le deben "+viajero1);
                    }else {
                        viajero1=media-viajero1;
                        System.out.println("El viajero 1 debe "+viajero1);
                    }
                    if (viajero2>media) {
                        viajero2=viajero2-media;
                        System.out.println("Al viajero 2 le deben "+viajero2);
                    }else {
                        viajero2=media-viajero2;
                        System.out.println("El viajero 2 debe "+viajero2);
                    }
                    if (viajero3>media&&viajero1>0) {
                        viajero3=viajero3-media;
                        System.out.println("Al viajero 3 le deben "+viajero3);
                    }else if (viajero3<media&&viajero3>0){
                        viajero3=media-viajero3;
                        System.out.println("El viajero 3 debe "+viajero3);
                    }
                    if (viajero4>media&&viajero4>0) {
                        viajero4=viajero4-media;
                        System.out.println("Al viajero 4 le deben "+viajero4);
                    }else if (viajero4<media&&viajero4>0) {
                        viajero4=media-viajero4;
                        System.out.println("El viajero 4 debe "+viajero4);
                    }
                    if (viajero5>media&&viajero5>0) {
                        viajero5=viajero5-media;
                        System.out.println("Al viajero 5 le deben "+viajero5);
                    }else if (viajero5<media&&viajero5>0) {
                        viajero5=media-viajero5;
                        System.out.println("El viajero 5 debe "+viajero5);
                    }


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





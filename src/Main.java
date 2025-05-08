import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GIMNASIO FITLIFE ===");
        System.out.println("Menú de opciones:");
        System.out.println("1. Inscripción mensual");
        System.out.println("2. Inscripción anual");
        System.out.println("3. Servicios adicionales");
        System.out.print("Seleccione una opción (1-2-3): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            // Inscripción mensual//
            case 1:
                System.out.print("Ingrese su edad: ");
                int edadMensual = scanner.nextInt();
                scanner.nextLine();
                System.out.print("¿Tiene alguna discapacidad? (sí/no): ");
                String discapacidad = scanner.nextLine();

                System.out.println("\n--- Resultado ---");
                System.out.println("Opción: Inscripción mensual");
                System.out.println("Edad: " + edadMensual);
                System.out.println("Discapacidad: " + discapacidad);

                boolean esMenor25 = edadMensual < 25;
                boolean tieneDiscapacidad = discapacidad.equals("sí");

                if (esMenor25 && tieneDiscapacidad) {
                    System.out.println("Resultado: Tarifa reducida + 30% de descuento aplicado.");
                } else if (esMenor25) {
                    System.out.println("Resultado: Tarifa reducida.");
                } else if (tieneDiscapacidad) {
                    System.out.println("Resultado: 30% de descuento aplicado.");
                } else {
                    System.out.println("Resultado: Tarifa estándar.");
                }
                break;
                // inscripcion anual//
            case 2:
                System.out.println( "Ingrese su edad");
                int edadAnual = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Edad: " + edadAnual);

                if (edadAnual<18){
                    System.out.print("No puede inscribirse porque es menor de edad");
                } else if (edadAnual>60){
                    System.out.println("Recibes el 20% de descuento");
                } else {
                    System.out.print("Paga tarifa normal");
                }
                break;
                //Servicios adicionales//
            case 3:
                System.out.println("Selecciona el servicio");
                System.out.println("1- piscina y sauna");
                System.out.println("2- entrenamiento personalizado");
                System.out.println("Opcion: ");
                int servicio = scanner.nextInt();


                System.out.println("Opción: ");

                if (servicio == 1) {
                    System.out.println("Piscina y sauna");
                    System.out.println("Sin costo.");
                } else if (servicio == 2) {
                    System.out.println("Entrenamiento personalizado");
                    System.out.println("Costo adicional.");
                } else {
                    System.out.println("Opción de servicio no válida.");
                }
                break;






        }
    }
    }
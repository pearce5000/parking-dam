package ies.puerto;

import java.util.Scanner;

public class Parking {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        float tarifaHora = 1.50f;
        int totalVehiculos = 0;
        int totalHorasRegitradas = 0;
        int totalCalculosTarifa = 0;
        float importeTotalCalculado = 0f;
        System.out.print("Introduzca el nombre de usuario: ");
        String nombre = teclado.nextLine();
        menu();



        teclado.close();
    }

    /**
     *
     */
    static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (true) {
            System.out.println("============");
            System.out.println("PARKING DAM");
            System.out.println("============");
            System.out.println("1. Registrar vehículos");
            System.out.println("2. Calcular tarifa de estacionamientos");
            System.out.println("3. Mostrar resumen del día");
            System.out.println("4. Salir");
            do {
                switch (opcion = teclado.nextInt()) {
                    case 1:
                        registrarVehiculos();
                    case 2:
                        calcularTarifa();
                    case 3:
                        mostrarResumen();
                    default:
                        System.out.println("Opción no válida");
                }
            } while (opcion != 4);
            return;
        }
    }

    /**
     *
     * @param
     */
    static void registrarVehiculos() {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        int totalVehiculos = 0;
        String matricula;
        int horasEstimadas = 0;
        do {
        System.out.println("¿Cuántos vehículos quieres registrar?");
        cantidad = teclado.nextInt();
        if (cantidad <= 0) {
            System.out.println("Debe ser un entero positivo");
        }
        } while (cantidad <= 0);

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Vehiculo "+i);
            System.out.println("Introduzca la matrícula");
            matricula = teclado.nextLine();
            System.out.println("Introduzca las horas estimadas");
            horasEstimadas = teclado.nextInt();



        }
    }

    /**
     *
     */
    static void calcularTarifa() {
        Scanner teclado = new Scanner(System.in);
        int horasEstimadas = 0;
        float tarifaHora = 1.50f;
        int calculosTarifa = 0;
        float importeTotal = 0;

        do {
            System.out.println("Horas para calcular la tarifa");
            horasEstimadas = teclado.nextInt();
            if (horasEstimadas <= 0) {
                System.out.println("Las horas deben ser mayores que 0");
            }
        } while (horasEstimadas <= 0);
        float importe = horasEstimadas * tarifaHora;
        calculosTarifa++;
        importeTotal += importe;
        System.out.println("Importe: "+importe+" euros");
    }

    /**
     *
     */
    static void mostrarResumen() {

    }
}

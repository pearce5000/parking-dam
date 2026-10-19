package ies.puerto;

import java.util.Scanner;

/**
 * @author Daniel Morales
 * @version 1.0.0
 */
public class Parking {

    static Scanner teclado = new Scanner(System.in);
    static float tarifaHora = 1.50f;
    static int totalVehiculos = 0;
    static int totalHorasRegistradas = 0;
    static int totalCalculosTarifa = 0;
    static float importeTotalCalculado = 0f;
    static String nombre;

    static void main() {
        System.out.print("Introduzca el nombre de usuario: ");
        nombre = teclado.nextLine();
        menu();
    }

    /**
     * Funcion que muestra el menu y selecciona la funcion deseada.
     */
    static void menu() {
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
            System.out.println("Gracias por usar PARKING DAM");
            teclado.close();
            return;
        }
    }

    /**
     * Funcion que registra la cantidad de vehiculos y las horas estimadas que han hecho uso del parking.
     * @param cantidad int que guarda la cantidad de vehiculos que se van a registrar.
     * @param horasEstimadas int que registra las horas de uso del parking.
     * @param matricula String que registra la matricula de los vehículos.
     */
    static void registrarVehiculos() {
        int cantidad = 0;
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
            matricula = teclado.next();

            do {
                System.out.println("Introduzca las horas estimadas");
                horasEstimadas = teclado.nextInt();
                if (horasEstimadas <= 0) {
                    System.out.println("Las horas deben ser mayores que 0");
                }
            } while (horasEstimadas <= 0);
            totalVehiculos++;
            totalHorasRegistradas += horasEstimadas;
        }
        System.out.println("Vehiculos registrados en esta operacion: "+cantidad);
        menu();
    }

    /**
     * Funcion que calcula la tarifa.
     * @param horasEstimadas int que registra las horas estimadas del parking de cada vehiculo.
     */
    static void calcularTarifa() {
        int horasEstimadas = 0;

        do {
            System.out.println("Horas para calcular la tarifa");
            horasEstimadas = teclado.nextInt();
            if (horasEstimadas <= 0) {
                System.out.println("Las horas deben ser mayores que 0");
            }
        } while (horasEstimadas <= 0);
        float importe = horasEstimadas * tarifaHora;
        totalCalculosTarifa++;
        importeTotalCalculado += importe;
        System.out.println("Importe: "+importe+" euros");
        menu();
    }

    /**
     *Funcion que muestra el resumen de las operaciones realizadas.
     */
    static void mostrarResumen() {
        System.out.println("Usuario: "+nombre);
        System.out.println("Vehículos registrados: "+totalVehiculos);
        System.out.println("Horas registradas: "+totalHorasRegistradas);
        System.out.println("Cálculos de tarifas: "+totalCalculosTarifa);
        System.out.println("Importe total calculado: "+importeTotalCalculado);
        menu();
    }
}
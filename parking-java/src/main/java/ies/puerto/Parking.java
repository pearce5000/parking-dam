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



        teclado.close();
    }

}

/*
5. Realiza una función que lea 10 números y devuelva si ha leído algún número
negativo o no.
 */

package ejercicios;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        if (hayNegativo()) {
            System.out.println("Al menos un numero es negativo");

        } else {
            System.out.println("No hay ningun numero negativo");
        }

    }

    public static boolean hayNegativo() {

        Scanner sc = new Scanner(System.in);

        int numero;
        boolean hayNegativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Escribe un numero: ");
            numero = sc.nextInt();

            if (numero < 0) {
                hayNegativo = true;
            }
        }

        System.out.println();
        return hayNegativo;
    }
}

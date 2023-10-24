/*
6. Realiza una función que lea 10 números y devuelva cuántos son positivos
 */

package ejercicios;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("La cantidad de numeros positivos es de " + cantidadPositivos());
    }

    public static int cantidadPositivos() {

        Scanner sc = new Scanner(System.in);

        int contadorPositivos = 0, numero;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Escribe un numero: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                contadorPositivos++;
            }
        }

        System.out.println();
        return contadorPositivos;
    }
}

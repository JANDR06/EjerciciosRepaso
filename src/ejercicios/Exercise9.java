/*
9. Realiza una función que calcule el valor A elevado a B (A^B) sin hacer uso del
operador de potencia (^), siendo A y B valores introducidos por teclado, haz una
función main que muestre el resultado por pantalla.
 */

package ejercicios;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Escribe un valor: ");
        a = sc.nextInt();
        System.out.print("Escribe la potencia la cual va a estar elevado el valor: ");
        b = sc.nextInt();

        System.out.println("Resultado: " + calculaPotencia(a, b));

    }

    public static long calculaPotencia(int x, int y) {
        return (long) Math.pow(x, y);
    }
}

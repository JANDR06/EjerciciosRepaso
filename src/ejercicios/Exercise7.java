/*
7. Realiza dos funciones, una que calcule la suma y otra el producto de dos
números pasados por parámetro.

 */

package ejercicios;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Escribe un numero: ");
        num1 = sc.nextInt();
        System.out.print("Escribe otro numero: ");
        num2 = sc.nextInt();

        System.out.println();

        System.out.println("La suma es " + sumaDosNumeros(num1, num2));
        System.out.println("El producto es " + productoDosNumeros(num1, num2));

    }

    public static int sumaDosNumeros(int x, int y) {
        return x + y;
    }

    public static int productoDosNumeros(int x, int y) {
        return x * y;
    }
}

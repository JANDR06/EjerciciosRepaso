/*
4. Realiza un programa que muestre los números desde el 1 hasta un número N
que se introducirá por teclado
 */

package ejercicios;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor final: ");
        int valorFinal = sc.nextInt();

        for (int i = 1; i <= valorFinal; i++) {
            System.out.print(i + " ");
        }
    }
}

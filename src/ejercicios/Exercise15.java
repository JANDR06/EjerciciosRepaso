/*
15. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
número tantas veces como su valor.
 */

package ejercicios;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        do {
            System.out.print("Escribe un numero entre el 0 y el 20: ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 20);

        System.out.println();
        System.out.println("------------ RESULTADO ------------");

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

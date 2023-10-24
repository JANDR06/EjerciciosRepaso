/*
16. Realiza una función que tenga dos números enteros A y B como parámetro,
siendo B mayor que A (esto lo controlarás en el main). Devolverá un String con
los números desde A hasta B
 */

package ejercicios;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Escribe un numero: ");
        a = sc.nextInt();

        do {
            System.out.print("Escribe un numero mas grande que el anterior: ");
            b = sc.nextInt();
        } while (b <= a);

        System.out.println();
        System.out.println("Resultado: " + cadenaNumeros(a, b));
    }

    public static String cadenaNumeros (int a, int b) {

        String cadena = "";

        for (int i = a; i <= b; i++) {

            cadena += String.valueOf(i);
        }

        return cadena;
    }
}

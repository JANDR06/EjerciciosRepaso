/*
2. Realiza un programa que muestre los números pares comprendidos entre el 1 y
el 200. Para ello utiliza un contador y suma de 2 en 2.
 */

package ejercicios;

public class Exercise2 {
    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 200) {

            if (contador > 0) {
                System.out.println(contador);
            }

            contador += 2;
        }
    }
}

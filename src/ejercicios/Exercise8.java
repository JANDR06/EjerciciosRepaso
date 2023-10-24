/*
8. Realiza un programa que sume independientemente los pares y los impares de
los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas
sumas.
 */

package ejercicios;

public class Exercise8 {
    public static void main(String[] args) {

        int sumaPares = 0, sumaImpares = 0;

        for (int i = 100; i <= 200; i++) {

            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("La suma de los numeros pares entre el 100 y el 200 es: " + sumaPares);
        System.out.println("La suma de los numeros impares entre el 100 y el 200 es: " + sumaImpares);
    }
}

package clase3argprog;

import java.util.Arrays;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicio1 {

    /**
     * Recibe una palabra y una letra y retorna la cantidad de veces que letra
     * fue hallada
     *
     * @param palabra
     * @param letra
     * @return
     */
    public int contarLetra(String palabra, char letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.toLowerCase().charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Recibe 3 numeros y retorna un vector de numeros ordenados de manera
     * ascendente o decreciente
     *
     * @param num1
     * @param num2
     * @param num3
     * @param orden
     * @return
     */
    public int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] numeros = {num1, num2, num3};
        if (orden.equals("ascendente")) {
            /**
             * Metodo de Arrays que ordena de forma ascendente
             */
            Arrays.sort(numeros);
        } else if (orden.equals("decreciente")) {
            /**
             * Primero ordenamos de forma ascendente y luego utilizamos un bucle
             * para invertir el orden con una variable auxiliar temp
             */
            Arrays.sort(numeros);
            int i = 0, j = numeros.length - 1;
            while (i < j) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
                i++;
                j--;
            }
        }
        return numeros;
    }

    /**
     * Recibe un vector y un numero y suma todos los numeros del vector mayores
     * que el numero recibido
     *
     * @param numeros
     * @param x
     * @return
     */
    public int sumarNumerosMayoresQueX(int[] numeros, int x) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }
        return suma;
    }

}

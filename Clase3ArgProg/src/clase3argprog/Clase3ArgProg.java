package clase3argprog;

import java.util.Arrays;

/**
 *
 * @author Emanuel Villarin
 */
public class Clase3ArgProg {

    public static void main(String[] args) {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.println("Ejercicio 1");
        System.out.println("A)");

        int aparece = ejercicio1.contarLetra("Aparejo", 'j');
        System.out.println("La letra 'j' se encuentra " + aparece + " veces en Aparejo");

        aparece = ejercicio1.contarLetra("Aparejo", 'a');
        System.out.println("La letra 'a' se encuentra " + aparece + " veces en Aparejo");

        System.out.println("");

        System.out.println("B)");

        int[] numerosOrdenados = ejercicio1.ordenarNumeros(27, 13, 7, "decreciente");
        System.out.println(Arrays.toString(numerosOrdenados) + " decreciente");

        numerosOrdenados = ejercicio1.ordenarNumeros(27, 13, 7, "ascendente");
        System.out.println(Arrays.toString(numerosOrdenados) + " ascendente");

        System.out.println("");

        System.out.println("C)");
        int resultado = ejercicio1.sumarNumerosMayoresQueX(new int[]{1, 5, 2, 7, 3}, 4);

        System.out.println("La suma de los numeros mayores que 4 es: " + resultado);

        System.out.println("");

        Ejercicio2 codificador = new Ejercicio2();
        System.out.println("Ejercicio 2");

        // Codificar el mensaje "hola que tal" con desplazamiento de 1
        String mensajeCodificado = codificador.codificar("hola que tal", 1);
        System.out.println("Mensaje codificado: " + mensajeCodificado);

        // Decodificar el mensaje "jqncbswgbvcn" con desplazamiento de 2
        String mensajeDecodificado = codificador.decodificar("jqncbswgbvcn", 2);
        System.out.println("Mensaje decodificado: " + mensajeDecodificado);

    }

}

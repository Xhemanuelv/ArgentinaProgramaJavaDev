package clase4argprog;

import clase4argprog.ejercicios.Ej3;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String opcion = "codificar"; // o "decodificar"
        int desplazamiento = 3;
        /**
         * valores aceptados por archivoEntrada entrada.txt || salida.txt
         * si se quiere decodificar salida se cambia este valor por salida
         * el archivo de salida anexa en lugar de sobreescribir
         */
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";

        Ej3.codificarDecodificar(opcion, desplazamiento, archivoEntrada, archivoSalida);
    }
}

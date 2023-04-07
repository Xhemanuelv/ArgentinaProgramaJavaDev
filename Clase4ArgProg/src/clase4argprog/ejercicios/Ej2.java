package clase4argprog.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Villarin
 */
public class Ej2 {

    /**
     * Recibe parametros en un arreglo unidimensional de string, estos
     * corresponden a la ruta del archivo, se agrega para la resolucion de ej2 a
     * la operacion a realizar
     *
     * @param parametros
     * @return
     */
    public static int procesarNumeros(String[] parametros) {
        int result = 0;
        List<Integer> numeros = new ArrayList();
        // Obtener la dirección del archivo (primer argumento) y el tipo de operación (segundo argumento)
        String rutaArchivo = parametros[0];
        String operacionARealizar = parametros[1];

        try {
            // Agregar el directorio por defecto del proyecto a la ruta del archivo
            File direccionProyecto = new File("");
            rutaArchivo = direccionProyecto.getAbsolutePath() + "\\" + rutaArchivo;

            try (BufferedReader leerArchivo = new BufferedReader(new FileReader(rutaArchivo))) {
                String line;
                //los numeros del archivo se leen linea por linea
                while ((line = leerArchivo.readLine()) != null) {
                    int numero = Integer.parseInt(line.trim());
                    //guardamos los numeros para mostrarlos antes de la salida
                    numeros.add(numero);
                    if (operacionARealizar.equals("sumar")) {
                        result += numero;
                    } else if (operacionARealizar.equals("multiplicar")) {
                        if (result == 0) {
                            result = 1;
                        }
                        result *= numero;
                    }
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println(numeros.toString());

        return result;
    }
}

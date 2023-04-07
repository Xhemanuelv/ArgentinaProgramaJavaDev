package clase4argprog.ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Emanuel Villarin
 */
public class Ej3 {

    private final static String abecedario = "abcdefghijklmnñopqrstuvwxyz ";

    public static void codificarDecodificar(String opcion, int desplazamiento, String archivoEntrada, String archivoSalida) {
        try {
            BufferedWriter bw;
            try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
                bw = new BufferedWriter(new FileWriter(archivoSalida, true));
                String linea;
                while ((linea = br.readLine()) != null) {
                    String resultado;
                    if (opcion.equalsIgnoreCase("codificar")) {
                        resultado = codificar(linea, desplazamiento);
                    } else {
                        resultado = decodificar(linea, desplazamiento);
                    }
                    bw.write(resultado);
                    bw.newLine();
                }
            }
            bw.close();
            System.out.println("La operacion se ha realizado correctamente.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String codificar(String mensaje, int desplazamiento) {
        char[] mensajeChars = mensaje.toLowerCase().toCharArray();
        for (int i = 0; i < mensajeChars.length; i++) {
            int pos = abecedario.indexOf(mensajeChars[i]);
            if (pos >= 0) {
                int nuevaPos = (pos + desplazamiento) % abecedario.length();
                mensajeChars[i] = abecedario.charAt(nuevaPos);
            }
        }
        return String.valueOf(mensajeChars);
    }

    private static String decodificar(String mensajeCodificado, int desplazamiento) {
        char[] mensajeCodificadoChars = mensajeCodificado.toLowerCase().toCharArray();
        for (int i = 0; i < mensajeCodificadoChars.length; i++) {
            int pos = abecedario.indexOf(mensajeCodificadoChars[i]);
            if (pos >= 0) {
                int nuevaPos = (pos - desplazamiento + abecedario.length()) % abecedario.length();
                mensajeCodificadoChars[i] = abecedario.charAt(nuevaPos);
            }
        }
        return String.valueOf(mensajeCodificadoChars);
    }
}

package clase3argprog;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicio2 {

    private String abecedario = "abcdefghijklmnñopqrstuvwxyz ";

    /**
     * Recibe un mensaje y retorna el mismo codificado en base al string
     * abecedario
     *
     * @param mensaje
     * @param desplazamiento
     * @return
     */
    public String codificar(String mensaje, int desplazamiento) {
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

    public String decodificar(String mensajeCodificado, int desplazamiento) {
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

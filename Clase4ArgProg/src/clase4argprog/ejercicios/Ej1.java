package clase4argprog.ejercicios;

import java.util.Arrays;

/**
 *
 * @author Emanuel Villarin
 */
public class Ej1 {

    /**
     * Recibe un arreglo de string con los parametros requeridos
     *
     * @param parametros
     */
    public void ordenar(String[] parametros) {

        int[] numeros = new int[3];
        numeros[0] = Integer.parseInt(parametros[0]);
        numeros[1] = Integer.parseInt(parametros[1]);
        numeros[2] = Integer.parseInt(parametros[2]);
        char criterio = parametros[3].charAt(0);

        switch (criterio) {
            case 'a' ->
                Arrays.sort(numeros);
            case 'd' -> {
                Arrays.sort(numeros);
                for (int i = 0; i < numeros.length / 2; i++) {
                    int temp = numeros[i];
                    numeros[i] = numeros[numeros.length - 1 - i];
                    numeros[numeros.length - 1 - i] = temp;
                }
            }
            default -> {
                System.out.println("Criterio no válido");
                return;
            }
        }
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

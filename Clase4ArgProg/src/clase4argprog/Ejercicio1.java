package clase4argprog;

import clase4argprog.ejercicios.Ej1;
import java.util.Scanner;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Ejercicio 1");
        String[] ejA = {"3", "5", "7", "d"};
        System.out.println("Ejercicio A");
        ejercicioA(ejA);

        System.out.println("Ejercicio B");
        String[] ejB = new String[1];
        ejercicioB(ejB);

        System.out.println("Ejercicio C");
        String[] ejC = new String[4];
        ejercicioC(ejC);

        System.out.println("");

    }

    public static void ejercicioA(String[] parametros) {

        Ej1 ej1 = new Ej1();

        ej1.ordenar(parametros);
    }

    public static void ejercicioB(String[] parametros) {

        Ej1 ej1 = new Ej1();
        parametros = pedirPorConsola();
        ej1.ordenar(parametros);
    }

    private static String[] pedirPorConsola() {
        Scanner leer = new Scanner(System.in);
        String[] parametros = new String[4];
        int num1, num2, num3;
        char criterio;
        System.out.print("Ingrese el 1er numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese el 2do numero: ");
        num2 = leer.nextInt();
        System.out.print("Ingrese el 3er numero: ");
        num3 = leer.nextInt();
        boolean intenteNuevamente;

        do {
            System.out.println("Ingrese el criterio de ordenamiento a o d (ascendente o descendiente)");
            criterio = leer.next().toLowerCase().charAt(0);
            intenteNuevamente = !(criterio == 'a' || criterio == 'd');
            if (intenteNuevamente) {
                System.out.println("Ingrese solo a o d");
            }
        } while (intenteNuevamente);

        parametros[0] = Integer.toString(num1);
        parametros[1] = Integer.toString(num2);
        parametros[2] = Integer.toString(num3);
        parametros[3] = String.valueOf(criterio);

        return parametros;
    }

    public static void ejercicioC(String[] parametros) {
        if (parametros.length == 4) {
            boolean datosCorrectos = verificarDatos(parametros);
            if (datosCorrectos) {
                ejercicioA(parametros);
            } else {
                ejercicioB(parametros);
            }
        } else {
            ejercicioB(parametros);
        }

    }

    private static boolean verificarDatos(String[] parametros) {
        int[] numeros = new int[3];
        char criterio;

        try {
            for (int i = 0; i < 2; i++) {
                numeros[i] = Integer.parseInt(parametros[i]);
            }
            criterio = parametros[3].charAt(3);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Uno de los datos no es valido, se pediran por consola");
        }
        return false;
    }
}

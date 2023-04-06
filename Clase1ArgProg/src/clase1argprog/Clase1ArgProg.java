package clase1argprog;

/**
 *
 * @author Emanuel villarin
 */
public class Clase1ArgProg {

    public static void main(String[] args) {

        ejercicio1();

        ejercicio2();

    }

    /**
     * Desarrolla los puntos requeridos por Ej. 1
     */
    public static void ejercicio1() {

        System.out.println("Ejercicio 1");

        int a = 5, b = 14;
        /**
         * Ejercicio 1 A
         */
        System.out.println("A)");
        System.out.println("Los numeros entre a y b son:");
        while (a <= b) {
            if (a < b) {
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
                System.out.println("");
            }
            a++;
        }
        a = 5;
        /**
         * Ejercicio 1 B
         */
        System.out.println("");
        System.out.println("B)");
        System.out.println("Los numeros pares entre a y b son:");
        while (a <= b) {
            if (a < b && (a % 2 == 0)) {
                System.out.print(a + ", ");
            } else if (a % 2 == 0) {
                System.out.print(a);
                System.out.println("");
            }
            a++;
        }
        a = 5;
        System.out.println("");
        /**
         * Ejercicio 1 C
         */
        System.out.println("C)");
        System.out.println("Utilizamos una variable extra para almacenar el valor de a");
        System.out.println("Los numeros impares entre a y b son:");
        int variableExtra = a;
        while (variableExtra <= b) {
            if (variableExtra < b && (a % 2 != 0)) {
                System.out.print(variableExtra + ", ");
            } else if (variableExtra % 2 != 0) {
                System.out.print(variableExtra);

            }
            variableExtra++;
        }
        System.out.println("");
        /**
         * Ejercicio 1 D
         */
        System.out.println("");
        System.out.println("D)");
        System.out.println("For para mostrar lo mismo que en B de manera invertida");
        for (int i = b; i >= a; i--) {
            if (i > a && (i % 2 == 0)) {
                System.out.print(i + ",");
            } else if (i == a && (i % 2 == 0)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }

    /**
     * Desarrolla la parte de codigo requerida Ej. 2
     */
    public static void ejercicio2() {

        System.out.println("");
        System.out.println("Ejercicio 2");
        // Ejercicio 2 
        float ingresoTotalMensualHogar = 260000; //ingreso hogar tipo 2 <= $489095
        int vehiculosNuevos = 2 /*3 <= vehiculos menor a 5 anios*/, inmuebles = 1 /*  3 <= inmuebles*/;
        boolean embarcacion = false, aeronave = false, capacidadEconomicaPlena = false /*activos que demuestren cap economica plena*/;

        if (capacidadEconomicaPlena || embarcacion || aeronave) {

            System.out.println("Pertenece al segmento de ingresos altos");

        } else if (vehiculosNuevos >= 3 || inmuebles >= 3 || ingresoTotalMensualHogar >= 489095) {

            System.out.println("Pertenece al segmento de ingresos altos");

        } else {
            System.out.println("No pertenece al segmento de ingresos altos");
        }

    }

}

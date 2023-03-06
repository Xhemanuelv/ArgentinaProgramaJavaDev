package clase1argprogr.Servicio;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicios {

    /**
     * Ejercicio 1
     */
    public void ejercicio1() {
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
        System.out.println("For para mostrar lo mismo que en b de manera invertida");
        for (int i = b; i >= a; i--) {
            if (i > a && (i % 2 == 0)) {
                System.out.print(i + ",");
            } else if (i == a && (i % 2 == 0)) {
                System.out.println(i);
            }
        }
        System.out.println("");
    }

    public void ejercicio2() {
        /**
         * ● Ingresos mensuales totales del hogar equivalentes o superiores a
         * $489.083 (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
         * 
         * ● Tener 3 o más vehículos con una antigüedad menor a 5 años. 
         * 
         * ● Tener 3 o más inmuebles. 
         * 
         * ● Poseer una embarcación, una aeronave de lujo o
         * ser titular de activos societarios que demuestren capacidad económica
         * plena.”
         */
        float ingresoTotalMensualHogar;
        int vehiculosNuevos,inmuebles;
        boolean embarcacion,aeronave,capacidadEconomicaPlena;
        
    }

}

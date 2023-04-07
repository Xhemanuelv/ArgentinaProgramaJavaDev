package clase4argprog;

/**
 *
 * @author Emanuel Villarin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 2");
        // Crear un arreglo con los argumentos de la operación y dirección del archivo
        String[] argumentosArchivo = {"numeros.txt", "sumar"};

        // Llamar al método de la clase NumberProcessor para procesar el archivo
        int sumaNumArch = clase4argprog.ejercicios.Ej2.procesarNumeros(argumentosArchivo);

        // Imprimir el resultado por consola
        System.out.println("El resultado es: " + sumaNumArch);
    }

}

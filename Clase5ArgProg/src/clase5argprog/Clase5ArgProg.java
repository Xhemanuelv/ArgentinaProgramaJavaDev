package clase5argprog;

import clase5argprog.entidades.Carrito;
import clase5argprog.entidades.Descuento;
import clase5argprog.entidades.DescuentoFijo;
import clase5argprog.entidades.DescuentoPorcentaje;
import clase5argprog.entidades.ItemCarrito;
import clase5argprog.entidades.Producto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Emanuel Villarin
 */
public class Clase5ArgProg {

    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        try {
            FileReader fileReader = new FileReader("datos.csv");
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    int cantidad = Integer.parseInt(data[0]);
                    double precioUnitario = Double.parseDouble(data[1]);
                    String producto = data[2];

                    Producto p = new Producto(producto, precioUnitario, cantidad);
                    ItemCarrito item = new ItemCarrito(p, cantidad);
                    carrito.agregarItem(item);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        double precioTotal = carrito.precio();
        System.out.println("El precio total es: " + precioTotal);

        Descuento descuentoFijo = new DescuentoFijo(120);
        double precioTotalConDescuentoFijo = descuentoFijo.aplicarDescuento(carrito.precio());
        System.out.println("El precio total con descuento fijo es: " + precioTotalConDescuentoFijo);

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(0.15);
        double precioTotalConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(carrito.precio());
        System.out.println("El precio total con descuento porcentaje es: " + precioTotalConDescuentoPorcentaje);
    }
}

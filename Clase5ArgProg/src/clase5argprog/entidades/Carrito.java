package clase5argprog.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;
    private LocalDate fechaCompra;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito item) {
        items.add(item);
        fechaCompra = LocalDate.now();
    }

    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }

    public double precio() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.getProducto().getPrecio() * item.getCantidad();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrito{" + "items=" + items + ", fechaCompra=" + fechaCompra + '}';
    }

}

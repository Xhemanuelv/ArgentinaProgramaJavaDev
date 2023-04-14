package clase5argprog.entidades;

/**
 *
 * @author Emanuel Villarin
 */
public class DescuentoFijo extends Descuento {

    private double monto;

    public DescuentoFijo(double monto) {
        this.monto = monto;
    }

    public DescuentoFijo(String nombre, String descripcion, double monto) {
        super(nombre, descripcion);
        this.monto = monto;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - monto;
    }

    // Getters y setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "DescuentoFijo{" + "monto=" + monto + '}';
    }

}

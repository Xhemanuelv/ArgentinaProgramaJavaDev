package clase5argprog.entidades;

/**
 *
 * @author Emanuel Villarin
 */
public class DescuentoPorcentaje extends Descuento {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public DescuentoPorcentaje(String nombre, String descripcion, double porcentaje) {
        super(nombre, descripcion);
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - porcentaje);
    }

    // Getters y setters
    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "DescuentoPorcentaje{" + "porcentaje=" + porcentaje + '}';
    }

}

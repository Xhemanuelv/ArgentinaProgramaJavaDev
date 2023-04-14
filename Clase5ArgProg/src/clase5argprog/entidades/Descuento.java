package clase5argprog.entidades;

/**
 *
 * @author Emanuel Villarin
 */
public abstract class Descuento {

    private String nombre;
    private String descripcion;

    public Descuento() {
    }

    public Descuento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double aplicarDescuento(double precio);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

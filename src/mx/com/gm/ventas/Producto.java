package mx.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre,double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("mx.com.gm.ventas.Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

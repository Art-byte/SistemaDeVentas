package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MaxProductos = 10;

    public Orden(){
        this.productos = new Producto[Orden.MaxProductos];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarProducto(Producto producto){

        if(this.contadorProductos<Orden.MaxProductos){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos" + Orden.MaxProductos);
        }
    }

    public double calcularTotal(){
        double total = 0;

        for(int i = 0; i<this.contadorProductos;i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }

        return total;
    }

    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden");
        for(int i =0; i< this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}

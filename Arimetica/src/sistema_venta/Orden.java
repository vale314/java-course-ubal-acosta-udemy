package sistema_venta;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if(contadorProductos < MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Se alzanzo el limte de productos: " + Orden.MAX_PRODUCTOS);

    }

    public double calcularTotal() {
        double total = 0;

        for(int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }

        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + this.idOrden);
        var totalOrden = calcularTotal();

        System.out.println("Total: " + totalOrden);
        System.out.println("Productos de la orden: ");

        for(int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i].toString());
        }
    }
}

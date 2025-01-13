package sistema_venta;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("Sistema De Ventas");
        var producto1 = new Producto("Zapatos", 450.25);
        var producto2 = new Producto("Zapatos2", 430.25);

        var orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Pants_Deportivo", 483.25));
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}

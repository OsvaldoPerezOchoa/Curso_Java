public class DetalleProducto {
    public static void main(String[] args) {

        System.out.println("*** Ejemplo variables ***");

        // Definir variables
        String nombreProducto = "Laptop";
        float precio = 1500.50f;
        int cantidadDisponible = 5;
        boolean ventaDisponible = true;

        // Imprimir detalles del producto
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("¿Está disponible para la venta? " + ventaDisponible);

        //Modificar datos
        nombreProducto = "Laptop Gaming";
        precio = 2000.75f;
        cantidadDisponible = 3;
        ventaDisponible = false;

        // Imprimir detalles del producto modificado
        System.out.println("Nombre del producto modificado: " + nombreProducto);
        System.out.println("Precio modificado: $" + precio);
        System.out.println("Cantidad disponible modificada: " + cantidadDisponible);
        System.out.println("¿Está disponible para la venta? " + ventaDisponible);
    }
}

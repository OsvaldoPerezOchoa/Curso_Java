public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de reserva de hotel ***");
        // Definir variables
        var nombreCliente = "Osvaldo Pérez Ochoa";
        var diasReservados = 5;
        var tasaPorDia = 350.50;
        var hasVistaAlMar = true;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días reservados: " + diasReservados);
        System.out.println("Tasa por día: $" + tasaPorDia);
        System.out.println("¿Vista al mar? " + hasVistaAlMar);

        // Modificar datos
        diasReservados = 7;
        tasaPorDia = 400.75;
        hasVistaAlMar = false;

        System.out.println("Días reservados modificados: " + diasReservados);
        System.out.println("Tasa por día modificada: $" + tasaPorDia);
        System.out.println("¿Vista al mar? " + hasVistaAlMar);
    }
}

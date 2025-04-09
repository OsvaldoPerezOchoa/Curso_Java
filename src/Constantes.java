public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de constantes ***");
        final var PI = 3.14159; // Definir una constante
        System.out.println("Valor de PI: " + PI);
        // PI = 3.14; // Error: no se puede modificar una constante

        final var VALOR_PI = Math.PI;
        System.out.println("Valor de PI: " + VALOR_PI);

        final var MENSAJE = "Bienvenido a Java";
        System.out.println(MENSAJE);
    }
}

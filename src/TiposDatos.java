public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros
        byte edad = 31; //1 byte
        short anio = 2023; //2 bytes
        int precio = 360; //4 bytes
        long telefono = 5555555555L; //8 bytes

        //Decimales
        float precioFloat = 360.40f; //4 bytes
        double precioDouble = 360.40; //8 bytes


        //Imprimir variables
        System.out.println(edad);
        System.out.println(anio);
        System.out.println(precio);
        System.out.println(telefono);
        System.out.println(precioFloat);
        System.out.println(precioDouble);

        //Caracteres
        char letra = 'A'; //2 bytes
        System.out.println(letra);

        //booleano
        boolean disponible = true; //1 byte
        System.out.println(disponible);

    }
}

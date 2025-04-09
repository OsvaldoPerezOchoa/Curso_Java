public class TipoVar {
    public static void main(String[] args) {
        //variables sin var
        String nombreCompleto = "Osvaldo Pérez Ochoa";
        System.out.println(nombreCompleto);

        //variables con var
        var nombreCompleto2 = "Osvaldo Pérez Ochoa";
        System.out.println(nombreCompleto2);

        //var con tipo de dato
        var edad = 24;
        System.out.println(edad);

        //var con tipo de dato
        var precio = 360.40;
        System.out.println(precio);

        //var con tipo de dato
        var sueldo = 2500.43;
        System.out.println(sueldo);

        //var con tipo de dato
        var isDisponible = true;
        System.out.println(isDisponible);

        //se debe definir su valor
        //var nombreCompleto3; //error
        //nombreCompleto3 = "Osvaldo Pérez Ochoa"; //error

        //var nombreCompleto4 = null; //error
    }
}

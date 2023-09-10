package GestorFinanciero;

public class Main {
    public static void main(String[] args) {
        //Crear una instancia de la clase Empresa
         Empresa empresa1 = new Empresa("Empresa de prueba 1", "Calle 22 #44-35", "3254323456","123456789-0");

         //Mostrar atributos clase Empresa
            System.out.println("Nombre de la empresa: " + empresa1.getNombre());
            System.out.println("Dirección de la empresa: " + empresa1.getDireccion());
            System.out.println("Teléfono de la empresa: " + empresa1.getTelefono());
            System.out.println("NIT de la empresa: " + empresa1.getNit());


        //Crear una instancia de la clase Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", "juan.perez@gmail.com", "Empresa de prueba 1", "Usuario");

        //Mostrar atributos clase Empresa
            System.out.println("Nombre del empleado: " + empleado1.getNombreEmpleado());
            System.out.println("Email: " + empleado1.getEmail());
            System.out.println("Empresa: " + empleado1.getEmpresaEmpleado());
            System.out.println("rol: " + empleado1.getRole());


        //Crear una instancia de la clase MovimientoDinero
        MovimientoDinero movimientoDinero1 = new MovimientoDinero(280,"Egreso", "Capital", "Pepito Pérez");

        //Mostrar atributos clase MovimientoDinero
        System.out.println("Monto de dinero: " + movimientoDinero1.getMontoDinero());
        System.out.println("Tipo de operación: " + movimientoDinero1.getTipoOperacion());
        System.out.println("Concepto: " + movimientoDinero1.getConceptoDinero());
        System.out.println("Responsable del movimiento: " + movimientoDinero1.getResponsableMovimiento());
    }

}

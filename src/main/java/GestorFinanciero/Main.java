package GestorFinanciero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información para crear una instancia de la clase Empresa
        System.out.println("-------- INFORMACION DE LA EMPRESA --------");
        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = scanner.nextLine();

        System.out.println("Ingrese la dirección de la empresa:");
        String direccionEmpresa = scanner.nextLine();

        System.out.println("Ingrese el teléfono de la empresa:");
        String telefonoEmpresa = scanner.nextLine();

        System.out.println("Ingrese el NIT de la empresa:");
        String nitEmpresa = scanner.nextLine();

        Empresa empresa1 = new Empresa(nombreEmpresa, direccionEmpresa, telefonoEmpresa, nitEmpresa);

        // Solicitar información para crear una instancia de la clase Empleado
        System.out.println("-------- INFORMACION DEL EMPLEADO --------");
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del empleado:");
        String emailEmpleado = scanner.nextLine();

        System.out.println("Ingrese el nombre de la empresa del empleado:");
        String nombreEmpresaEmpleado = scanner.nextLine();

        System.out.println("Ingrese el rol del empleado:");
        String rolEmpleado = scanner.nextLine();

        Empleado empleado1 = new Empleado(nombreEmpleado, emailEmpleado, nombreEmpresaEmpleado, rolEmpleado);

        // Solicitar información para crear una instancia de la clase MovimientoDinero
        System.out.println("-------- INFORMACION MOVIMIENTOS --------");
        System.out.println("Ingrese el monto de dinero:");
        double montoDinero = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el salto de línea

        System.out.println("Ingrese el tipo de operación (Egreso/Ingreso):");
        String tipoOperacion = scanner.nextLine();

        System.out.println("Ingrese el concepto del movimiento:");
        String conceptoDinero = scanner.nextLine();

        System.out.println("Ingrese el responsable del movimiento:");
        String responsableMovimiento = scanner.nextLine();

        MovimientoDinero movimientoDinero1 = new MovimientoDinero(montoDinero, tipoOperacion, conceptoDinero, responsableMovimiento);

        // Cerramos el scanner
        scanner.close();


//        //Crear una instancia de la clase Empresa
//         Empresa empresa1 = new Empresa("Empresa de prueba 1", "Calle 22 #44-35", "3254323456","123456789-0");
//
//         //Mostrar atributos clase Empresa
//            System.out.println("Nombre de la empresa: " + empresa1.getNombre());
//            System.out.println("Dirección de la empresa: " + empresa1.getDireccion());
//            System.out.println("Teléfono de la empresa: " + empresa1.getTelefono());
//            System.out.println("NIT de la empresa: " + empresa1.getNit());
//
//
//        //Crear una instancia de la clase Empleado
//        Empleado empleado1 = new Empleado("Juan Pérez", "juan.perez@gmail.com", "Empresa de prueba 1", "Usuario");
//
//        //Mostrar atributos clase Empresa
//            System.out.println("Nombre del empleado: " + empleado1.getNombreEmpleado());
//            System.out.println("Email: " + empleado1.getEmail());
//            System.out.println("Empresa: " + empleado1.getEmpresaEmpleado());
//            System.out.println("rol: " + empleado1.getRole());
//
//
//        //Crear una instancia de la clase MovimientoDinero
//        MovimientoDinero movimientoDinero1 = new MovimientoDinero(280,"Egreso", "Capital", "Pepito Pérez");
//
//        //Mostrar atributos clase MovimientoDinero
//        System.out.println("Monto de dinero: " + movimientoDinero1.getMontoDinero());
//        System.out.println("Tipo de operación: " + movimientoDinero1.getTipoOperacion());
//        System.out.println("Concepto: " + movimientoDinero1.getConceptoDinero());
//        System.out.println("Responsable del movimiento: " + movimientoDinero1.getResponsableMovimiento());
    }
}

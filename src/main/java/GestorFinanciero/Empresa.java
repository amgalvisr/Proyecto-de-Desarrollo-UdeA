package GestorFinanciero;

public class Empresa {


    //Atributos de la clase Empresa
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;

    //Constructor de la clase Empresa
    public Empresa(String nombre, String direccion, String telefono, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }


    //Getters de la clase Empresa

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNit() {
        return nit;
    }


    //Setters de la clase Empresa

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
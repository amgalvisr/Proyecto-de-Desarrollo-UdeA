package GestorFinanciero;

public class Empleado{
    //Atributos
    private String nombreEmpleado;
    private String email;
    private String empresaEmpleado;
    private String role;

    //Constructor

    public Empleado(String nombreEmpleado, String email, String empresaEmpleado, String role) {
        this.nombreEmpleado = nombreEmpleado;
        this.email = email;
        this.empresaEmpleado = empresaEmpleado;
        this.role = role;
    }


    //Getters

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public String getRole() {
        return role;
    }


    //Setters

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

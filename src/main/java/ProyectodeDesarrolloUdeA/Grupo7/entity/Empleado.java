package ProyectodeDesarrolloUdeA.Grupo7.entity;

public class Empleado{
    //Atributos
    private String nombreEmpleado;
    private String email;
    private String empresaEmpleado;
    private String role;
    private long id;

    //Constructor

    public Empleado() {
        this.nombreEmpleado = nombreEmpleado;
        this.email = email;
        this.empresaEmpleado = empresaEmpleado;
        this.role = role;
        this.id = id;
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

    public long getId() {
        return id;
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

    public void setId(long id) {
        this.id = id;
    }
}

<<<<<<<< HEAD:Grupo7/Grupo7/Grupo7/src/main/java/ProyectoDesarrolloUdea/Grupo7/entity/Empleado.java
package ProyectoDesarrolloUdea.Grupo7.entity;

import jakarta.persistence.*;
========
package ProyectodeDesarrolloUdea.Grupo7.entity;

import jakarta.persistence.*;
import lombok.Data;

>>>>>>>> cad1a8cc5ef1ccf6aac546e22bc2aa8e5d068544:Grupo7/src/main/java/ProyectodeDesarrolloUdea/Grupo7/entity/Empleado.java

@Entity
@Table(name="Empleado")
public class Empleado {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombreEmpleado;

    @Column(name="email_address", unique = true, nullable = false)
    private String email;

    @Column
    private String empresaEmpleado;

    @Column
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
<<<<<<<< HEAD:Grupo7/Grupo7/Grupo7/src/main/java/ProyectoDesarrolloUdea/Grupo7/entity/Empleado.java
}
========
}
>>>>>>>> cad1a8cc5ef1ccf6aac546e22bc2aa8e5d068544:Grupo7/src/main/java/ProyectodeDesarrolloUdea/Grupo7/entity/Empleado.java

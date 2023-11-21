<<<<<<<< HEAD:Grupo7/Grupo7/Grupo7/src/main/java/ProyectoDesarrolloUdea/Grupo7/entity/Empresa.java
package ProyectoDesarrolloUdea.Grupo7.entity;
========
package ProyectodeDesarrolloUdea.Grupo7.entity;
>>>>>>>> cad1a8cc5ef1ccf6aac546e22bc2aa8e5d068544:Grupo7/src/main/java/ProyectodeDesarrolloUdea/Grupo7/entity/Empresa.java

import jakarta.persistence.*;

@Entity
@Table(name= "Empresa")
public class Empresa {


    //Atributos de la clase Empresa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nombre;
    @Column
    private String direccion;
    @Column(unique = true, nullable = false)
    private String telefono;
    @Column(unique = true, length = 10)
    private String nit;

<<<<<<<< HEAD:Grupo7/Grupo7/Grupo7/src/main/java/ProyectoDesarrolloUdea/Grupo7/entity/Empresa.java
========
    //Constructor de la clase Empresa
//    public Empresa(String nombre, String direccion, String telefono, String nit) {
//        this.nombre = nombre;
//        this.direccion = direccion;
//        this.telefono = telefono;
//        this.nit = nit;
//}
>>>>>>>> cad1a8cc5ef1ccf6aac546e22bc2aa8e5d068544:Grupo7/src/main/java/ProyectodeDesarrolloUdea/Grupo7/entity/Empresa.java


    //Getters de la clase Empresa

    public Long getId() {
        return id;
    }

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


    public void setId(Long id) {
        this.id = id;
    }

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

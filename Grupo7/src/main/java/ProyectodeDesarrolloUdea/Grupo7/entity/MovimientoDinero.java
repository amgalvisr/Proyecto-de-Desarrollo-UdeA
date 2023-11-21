package ProyectodeDesarrolloUdea.Grupo7.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double montoDinero;
    @Column
    private String tipoOperacion;
    @Column
    private String conceptoDinero;
    @Column
    private String responsableMovimiento;

    //Constructores

//    public MovimientoDinero(Double montoDinero, String tipoOperacion, String conceptoDinero, String responsableMovimiento) {
//        this.montoDinero = montoDinero;
//        this.tipoOperacion = tipoOperacion;
//        this.conceptoDinero = conceptoDinero;
//        this.responsableMovimiento = responsableMovimiento;
//    }

    //Getters

    public Long getId() {
        return id;
    }

    public Double getMontoDinero() {
        return montoDinero;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public String getConceptoDinero() {
        return conceptoDinero;
    }

    public String getResponsableMovimiento() {
        return responsableMovimiento;
    }


    //Setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setMontoDinero(Double montoDinero) {
        this.montoDinero = montoDinero;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public void setConceptoDinero(String conceptoDinero) {
        this.conceptoDinero = conceptoDinero;
    }

    public void setResponsableMovimiento(String responsableMovimiento) {
        this.responsableMovimiento = responsableMovimiento;
    }
}

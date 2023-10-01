package ProyectodeDesarrolloUdeA.Grupo7.entity;

public class MovimientoDinero {
    private double montoDinero;
    private String tipoOperacion;
    private String conceptoDinero;
    private String responsableMovimiento;

    //Constructores

    public MovimientoDinero(double montoDinero, String tipoOperacion, String conceptoDinero, String responsableMovimiento) {
        this.montoDinero = montoDinero;
        this.tipoOperacion = tipoOperacion;
        this.conceptoDinero = conceptoDinero;
        this.responsableMovimiento = responsableMovimiento;
    }

    //Getters

    public double getMontoDinero() {
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

    public void setMontoDinero(double montoDinero) {
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

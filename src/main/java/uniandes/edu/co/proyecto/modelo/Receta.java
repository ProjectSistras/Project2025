package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="receta")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer receta_id;
    
    private Date fecha;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "afiliado_id")
    private Afiliado afiliado;
    
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
    
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;

    public Receta(Date fecha, String descripcion, Afiliado afiliado, Medico medico, Servicio servicio) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.afiliado = afiliado;
        this.medico = medico;
        this.servicio = servicio;
    }

    public Integer getReceta_id() {
        return receta_id;
    }

    public void setReceta_id(Integer receta_id) {
        this.receta_id = receta_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Receta(){;}
}
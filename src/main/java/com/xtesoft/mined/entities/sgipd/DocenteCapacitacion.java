package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "Docentes_capacitacion")
@Entity
public class DocenteCapacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_capacitacion", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_sigobsol_usuario", nullable = false)
    private Docente idSigobsolUsuario;

    @Column(name = "nombre_capacitacion", nullable = false, length = 350)
    private String nombreCapacitacion;

    @Column(name = "cantidad_horas", nullable = false)
    private Long cantidadHoras;

    @Column(name = "institucion", nullable = false, length = 350)
    private String institucion;

    @Column(name = "fecha_inicio", nullable = false)
    private Timestamp fechaInicio;

    @Column(name = "fecha_finalizacion", nullable = false)
    private Timestamp fechaFinalizacion;

    @Column(name = "pais", nullable = false, length = 350)
    private String pais;

    @Column(name = "diploma_obtenido", nullable = false, length = 350)
    private String diplomaObtenido;

    @Column(name = "indice_capacitacion", nullable = false)
    private Integer indiceCapacitacion;

    @Column(name = "valido")
    private Boolean valido;

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }

    public Integer getIndiceCapacitacion() {
        return indiceCapacitacion;
    }

    public void setIndiceCapacitacion(Integer indiceCapacitacion) {
        this.indiceCapacitacion = indiceCapacitacion;
    }

    public String getDiplomaObtenido() {
        return diplomaObtenido;
    }

    public void setDiplomaObtenido(String diplomaObtenido) {
        this.diplomaObtenido = diplomaObtenido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Timestamp getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Timestamp fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Long getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(Long cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public String getNombreCapacitacion() {
        return nombreCapacitacion;
    }

    public void setNombreCapacitacion(String nombreCapacitacion) {
        this.nombreCapacitacion = nombreCapacitacion;
    }

    public Docente getIdSigobsolUsuario() {
        return idSigobsolUsuario;
    }

    public void setIdSigobsolUsuario(Docente idSigobsolUsuario) {
        this.idSigobsolUsuario = idSigobsolUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
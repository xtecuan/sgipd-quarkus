package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

@Table(name = "Calificaciones")
@Entity
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_calificacion", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tramite_aplic", nullable = false)
    private DocenteAplicacion idTramiteAplic;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_criterio", nullable = false)
    private Criterio idCriterio;

    @Column(name = "valor_calif", precision = 10, scale = 2)
    private BigDecimal valorCalif;

    @Column(name = "valor_ponderacion", precision = 10, scale = 2)
    private BigDecimal valorPonderacion;

    @Column(name = "fecha_ingreso")
    private Timestamp fechaIngreso;

    @Column(name = "usuario_ingreso", length = 100)
    private String usuarioIngreso;

    @Column(name = "fecha_actualizacion")
    private Timestamp fechaActualizacion;

    @Column(name = "usuario_actualizacion", length = 100)
    private String usuarioActualizacion;

    @Column(name = "aprobacion")
    private Boolean aprobacion;

    @Column(name = "estatus", length = 15)
    private String estatus;

    @Column(name = "observacion", length = 1000)
    private String observacion;

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Boolean getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(Boolean aprobacion) {
        this.aprobacion = aprobacion;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Timestamp getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Timestamp fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public Timestamp getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Timestamp fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public BigDecimal getValorPonderacion() {
        return valorPonderacion;
    }

    public void setValorPonderacion(BigDecimal valorPonderacion) {
        this.valorPonderacion = valorPonderacion;
    }

    public BigDecimal getValorCalif() {
        return valorCalif;
    }

    public void setValorCalif(BigDecimal valorCalif) {
        this.valorCalif = valorCalif;
    }

    public Criterio getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Criterio idCriterio) {
        this.idCriterio = idCriterio;
    }

    public DocenteAplicacion getIdTramiteAplic() {
        return idTramiteAplic;
    }

    public void setIdTramiteAplic(DocenteAplicacion idTramiteAplic) {
        this.idTramiteAplic = idTramiteAplic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
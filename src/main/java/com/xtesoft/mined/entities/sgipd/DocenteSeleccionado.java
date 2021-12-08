package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Table(name = "Docentes_seleccionados")
@Entity
public class DocenteSeleccionado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seleccionado", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tramite_aplic", nullable = false)
    private DocenteAplicacion idTramiteAplic;

    @Column(name = "valor_calif_total", nullable = false, precision = 5, scale = 2)
    private BigDecimal valorCalifTotal;

    @Column(name = "posicion", nullable = false)
    private Long posicion;

    @Column(name = "fecha_ingreso")
    private Instant fechaIngreso;

    @Column(name = "usuario_ingreso", length = 100)
    private String usuarioIngreso;

    @Column(name = "fecha_actualizacion")
    private Instant fechaActualizacion;

    @Column(name = "usuario_actualizacion", length = 100)
    private String usuarioActualizacion;

    @Lob
    @Column(name = "Observaciones")
    private String observaciones;

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Instant getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Instant fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public Instant getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Instant fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Long getPosicion() {
        return posicion;
    }

    public void setPosicion(Long posicion) {
        this.posicion = posicion;
    }

    public BigDecimal getValorCalifTotal() {
        return valorCalifTotal;
    }

    public void setValorCalifTotal(BigDecimal valorCalifTotal) {
        this.valorCalifTotal = valorCalifTotal;
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
package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_criterio", nullable = false)
    private Long id;

    @Column(name = "nombre_criterio", nullable = false, length = 25)
    private String nombreCriterio;

    @Lob
    @Column(name = "descripcion_criterio", nullable = false)
    private String descripcionCriterio;

    @Column(name = "puntaje_maximo", nullable = false)
    private Double puntajeMaximo;

    @Lob
    @Column(name = "descripcion_puntaje", nullable = false)
    private String descripcionPuntaje;

    @Column(name = "formula", length = 350)
    private String formula;

    @Column(name = "indice_criterio", nullable = false, precision = 10, scale = 2)
    private BigDecimal indiceCriterio;

    @Column(name = "fraccion_ponderacion", precision = 5, scale = 4)
    private BigDecimal fraccionPonderacion;

    public BigDecimal getFraccionPonderacion() {
        return fraccionPonderacion;
    }

    public void setFraccionPonderacion(BigDecimal fraccionPonderacion) {
        this.fraccionPonderacion = fraccionPonderacion;
    }

    public BigDecimal getIndiceCriterio() {
        return indiceCriterio;
    }

    public void setIndiceCriterio(BigDecimal indiceCriterio) {
        this.indiceCriterio = indiceCriterio;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getDescripcionPuntaje() {
        return descripcionPuntaje;
    }

    public void setDescripcionPuntaje(String descripcionPuntaje) {
        this.descripcionPuntaje = descripcionPuntaje;
    }

    public Double getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(Double puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getDescripcionCriterio() {
        return descripcionCriterio;
    }

    public void setDescripcionCriterio(String descripcionCriterio) {
        this.descripcionCriterio = descripcionCriterio;
    }

    public String getNombreCriterio() {
        return nombreCriterio;
    }

    public void setNombreCriterio(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
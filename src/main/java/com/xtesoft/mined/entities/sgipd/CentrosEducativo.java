package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Centros_educativos")
@Entity
public class CentrosEducativo {
    @Id
    @Column(name = "codinfra", nullable = false)
    private Long id;

    @Column(name = "nombrece", nullable = false)
    private String nombrece;

    @Column(name = "departamento", nullable = false)
    private String departamento;

    @Column(name = "municipio", nullable = false)
    private String municipio;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipio idMunicipio;

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombrece() {
        return nombrece;
    }

    public void setNombrece(String nombrece) {
        this.nombrece = nombrece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
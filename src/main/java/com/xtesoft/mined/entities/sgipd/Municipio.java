package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Municipios")
@Entity
public class Municipio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_departamento", nullable = false)
    private Departamento idDepartamento;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "cod_institucional", length = 15)
    private String codInstitucional;

    public String getCodInstitucional() {
        return codInstitucional;
    }

    public void setCodInstitucional(String codInstitucional) {
        this.codInstitucional = codInstitucional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
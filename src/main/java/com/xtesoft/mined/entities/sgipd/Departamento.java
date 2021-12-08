package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Departamentos")
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 25)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
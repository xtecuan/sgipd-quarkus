package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Plazas")
@Entity
public class Plaza {
    @Id
    @Column(name = "id_secuencial", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "codinfra", nullable = false)
    private CentrosEducativo codinfra;

    @Column(name = "nivel_educativo", length = 10)
    private String nivelEducativo;

    @Column(name = "turno", length = 10)
    private String turno;

    @Column(name = "especialidad", length = 92)
    private String especialidad;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad idEspecialidad;

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public CentrosEducativo getCodinfra() {
        return codinfra;
    }

    public void setCodinfra(CentrosEducativo codinfra) {
        this.codinfra = codinfra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
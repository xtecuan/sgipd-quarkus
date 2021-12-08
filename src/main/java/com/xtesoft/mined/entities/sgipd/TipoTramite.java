package com.xtesoft.mined.entities.sgipd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Tipo_tramite")
@Entity
public class TipoTramite {
    @Id
    @Column(name = "id_tipo_tramite", nullable = false)
    private Long id;

    @Column(name = "nombre_tramite", nullable = false)
    private String nombreTramite;

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
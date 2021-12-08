package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Docentes")
@Entity
public class Docente {
    @Id
    @Column(name = "id_sigobsol_usuario", nullable = false)
    private Long id;

    @Column(name = "id_tramite", nullable = false)
    private Long idTramite;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tipo_tramite", nullable = false)
    private TipoTramite tipoTramite;

    @Column(name = "nombres", length = 250)
    private String nombres;

    @Column(name = "apellidos", length = 250)
    private String apellidos;

    @Column(name = "direccion_postal", length = 250)
    private String direccionPostal;

    @Column(name = "departamento", length = 25)
    private String departamento;

    @Column(name = "municipio", length = 25)
    private String municipio;

    @Column(name = "nip", length = 35)
    private String nip;

    @Column(name = "dui", length = 125)
    private String dui;

    @Column(name = "correo_e", length = 100)
    private String correoE;

    @Column(name = "nivel_docente", length = 25)
    private String nivelDocente;

    @Column(name = "tel_fijo", length = 35)
    private String telFijo;

    @Column(name = "tel_celular", length = 35)
    private String telCelular;

    @Column(name = "discapacidad")
    private String discapacidad;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipio idMunicipio;

    @Column(name = "rechazado", length = 25)
    private String rechazado;

    public String getRechazado() {
        return rechazado;
    }

    public void setRechazado(String rechazado) {
        this.rechazado = rechazado;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    public String getTelFijo() {
        return telFijo;
    }

    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    public String getNivelDocente() {
        return nivelDocente;
    }

    public void setNivelDocente(String nivelDocente) {
        this.nivelDocente = nivelDocente;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Long getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(Long idTramite) {
        this.idTramite = idTramite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
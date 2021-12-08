package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Table(name = "Docentes_experiencia")
@Entity
public class DocenteExperiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_experiencia", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_sigobsol_usuario", nullable = false)
    private Docente idSigobsolUsuario;

    @Column(name = "institucion_educativa_nacional", length = 250)
    private String institucionEducativaNacional;

    @Column(name = "institucion_educativa_extranjero", length = 250)
    private String institucionEducativaExtranjero;

    @Column(name = "cantidad_de_annios", precision = 10, scale = 2)
    private BigDecimal cantidadDeAnnios;

    @Column(name = "departamento", length = 100)
    private String departamento;

    @Column(name = "municipio", length = 250)
    private String municipio;

    @Column(name = "desde")
    private Instant desde;

    @Column(name = "hasta")
    private Instant hasta;

    @Column(name = "nombramiento", length = 300)
    private String nombramiento;

    @Column(name = "sector", length = 100)
    private String sector;

    @Column(name = "indice_experiencia", nullable = false)
    private Integer indiceExperiencia;

    @ManyToOne
    @JoinColumn(name = "id_municipio")
    private Municipio idMunicipio;

    @Column(name = "experiencia_valida")
    private Boolean experienciaValida;

    @Column(name = "interino")
    private Boolean interino;

    public Boolean getInterino() {
        return interino;
    }

    public void setInterino(Boolean interino) {
        this.interino = interino;
    }

    public Boolean getExperienciaValida() {
        return experienciaValida;
    }

    public void setExperienciaValida(Boolean experienciaValida) {
        this.experienciaValida = experienciaValida;
    }

    public Municipio getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Municipio idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Integer getIndiceExperiencia() {
        return indiceExperiencia;
    }

    public void setIndiceExperiencia(Integer indiceExperiencia) {
        this.indiceExperiencia = indiceExperiencia;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(String nombramiento) {
        this.nombramiento = nombramiento;
    }

    public Instant getHasta() {
        return hasta;
    }

    public void setHasta(Instant hasta) {
        this.hasta = hasta;
    }

    public Instant getDesde() {
        return desde;
    }

    public void setDesde(Instant desde) {
        this.desde = desde;
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

    public BigDecimal getCantidadDeAnnios() {
        return cantidadDeAnnios;
    }

    public void setCantidadDeAnnios(BigDecimal cantidadDeAnnios) {
        this.cantidadDeAnnios = cantidadDeAnnios;
    }

    public String getInstitucionEducativaExtranjero() {
        return institucionEducativaExtranjero;
    }

    public void setInstitucionEducativaExtranjero(String institucionEducativaExtranjero) {
        this.institucionEducativaExtranjero = institucionEducativaExtranjero;
    }

    public String getInstitucionEducativaNacional() {
        return institucionEducativaNacional;
    }

    public void setInstitucionEducativaNacional(String institucionEducativaNacional) {
        this.institucionEducativaNacional = institucionEducativaNacional;
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
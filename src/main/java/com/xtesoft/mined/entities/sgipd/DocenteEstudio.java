package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Docentes_estudios")
@Entity
public class DocenteEstudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudios", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_sigobsol_usuario", nullable = false)
    private Docente idSigobsolUsuario;

    @Column(name = "annio_graduacion")
    private Long annioGraduacion;

    @Column(name = "indice_titulo")
    private Integer indiceTitulo;

    @ManyToOne
    @JoinColumn(name = "id_grado_academico")
    private GradoAcademico idGradoAcademico;

    @ManyToOne
    @JoinColumn(name = "id_especialidad")
    private Especialidad idEspecialidad;

    @ManyToOne
    @JoinColumn(name = "id_institucion_educativa")
    private InstitucionesEducativa idInstitucionEducativa;

    @Column(name = "valido")
    private Boolean valido;

    public Boolean getValido() {
        return valido;
    }

    public void setValido(Boolean valido) {
        this.valido = valido;
    }

    public InstitucionesEducativa getIdInstitucionEducativa() {
        return idInstitucionEducativa;
    }

    public void setIdInstitucionEducativa(InstitucionesEducativa idInstitucionEducativa) {
        this.idInstitucionEducativa = idInstitucionEducativa;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public GradoAcademico getIdGradoAcademico() {
        return idGradoAcademico;
    }

    public void setIdGradoAcademico(GradoAcademico idGradoAcademico) {
        this.idGradoAcademico = idGradoAcademico;
    }

    public Integer getIndiceTitulo() {
        return indiceTitulo;
    }

    public void setIndiceTitulo(Integer indiceTitulo) {
        this.indiceTitulo = indiceTitulo;
    }

    public Long getAnnioGraduacion() {
        return annioGraduacion;
    }

    public void setAnnioGraduacion(Long annioGraduacion) {
        this.annioGraduacion = annioGraduacion;
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
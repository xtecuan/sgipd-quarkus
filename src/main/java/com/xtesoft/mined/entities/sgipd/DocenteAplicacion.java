package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "Docentes_aplicaciones")
@Entity
@NamedQueries({
        @NamedQuery(name = "DocenteAplicacion.findAllNoRechazadasByNip",
                query = "SELECT da FROM DocenteAplicacion da WHERE da.rechazado='No Rechazado' AND TRIM(da.idSigobsolUsuario.nip) = TRIM(:nip) AND da.idSigobsolUsuario.rechazado = 'No Rechazado'  order by da.id", lockMode = LockModeType.OPTIMISTIC)
})
public class DocenteAplicacion {
    @Id
    @Column(name = "id_tramite_aplic", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_sigobsol_usuario", nullable = false)
    private Docente idSigobsolUsuario;

    @ManyToOne
    @JoinColumn(name = "tipo_tramite")
    private TipoTramite tipoTramite;

    @ManyToOne
    @JoinColumn(name = "id_secuencial_plaza")
    private Plaza idSecuencialPlaza;

    @Column(name = "rechazado", length = 25)
    private String rechazado;

    public String getRechazado() {
        return rechazado;
    }

    public void setRechazado(String rechazado) {
        this.rechazado = rechazado;
    }

    public Plaza getIdSecuencialPlaza() {
        return idSecuencialPlaza;
    }

    public void setIdSecuencialPlaza(Plaza idSecuencialPlaza) {
        this.idSecuencialPlaza = idSecuencialPlaza;
    }

    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
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
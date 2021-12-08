package com.xtesoft.mined.entities.sgipd;

import javax.persistence.*;

@Table(name = "CARGA_SIGOB_PSICOMETRICA_PLAZAS_DOCENTES")
@Entity
@NamedQueries({
        @NamedQuery(name = "PruebaPsicometrica.findAll",query = "SELECT pp FROM PruebaPsicometrica pp ORDER BY pp.nip", lockMode = LockModeType.OPTIMISTIC)
})
public class PruebaPsicometrica {
    @Id
    @Column(name = "nip", nullable = false, length = 25)
    private String nip;

    @Column(name = "dui", length = 100)
    private String dui;

    @Column(name = "nombres", length = 300)
    private String nombres;

    @Column(name = "apellidos", length = 300)
    private String apellidos;

    @Column(name = "sexo", length = 6)
    private String sexo;

    @Column(name = "RESULTADO")
    private Double resultado;

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
}
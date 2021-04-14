package domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Tramite")
public class Tramite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTramite;

    private String tipoTramite;

    private Timestamp fechaTramite;

    public Tramite() {

    }

    public int getIdtramite() {
        return idTramite;
    }

    public void setIdTramite(int idtramite) {
        this.idTramite = idtramite;
    }


    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Timestamp getFechaTramite() {
        return fechaTramite;
    }

    public void setFechaTramite(Timestamp fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    @Override
    public String toString() {
        return "Tramite [idtramite= " + idTramite + ", tipoTramite= " + tipoTramite + ", fechaTramite =" + fechaTramite + "]";
    }
}
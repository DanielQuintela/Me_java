package TrabalhoUnit;

import java.util.ArrayList;
import java.util.Date;

public class Consulta extends Dentista{

    private String nomecliente;
    private Date dtconsulta;
    private String horaconsulta;
    private String flagprimeiracons;
    private String statuscons;
    private ArrayList<Double> valorcons;

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomeliente(String nomec) {
        this.nomecliente = nomec;
    }

    public Date getDtconsulta() {
        return dtconsulta;
    }

    public void setDtconsulta(Date dtconsulta) {
        this.dtconsulta = dtconsulta;
    }

    public String getHoraconsulta() {
        return horaconsulta;
    }

    public void setHoraconsulta(String horaconsulta) {
        this.horaconsulta = horaconsulta;
    }

    public String getFlagprimeiracons() {
        return flagprimeiracons;
    }

    public void setFlagprimeiracons(String flagprimeiracons) {
        this.flagprimeiracons = flagprimeiracons;
    }

    public String getStatuscons() {
        return statuscons;
    }

    public void setStatuscons(String statuscons) {
        this.statuscons = statuscons;
    }

    public ArrayList<Double> getValorcons() {
        return valorcons;
    }

    public void setValorcons(ArrayList<Double> valorcons) {
        this.valorcons = valorcons;
    }
}

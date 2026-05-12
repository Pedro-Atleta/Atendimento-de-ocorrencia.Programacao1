
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class Ocorrencia {

    private String IDocorrencia;
    private String tipoOcorrencias;
    private Date Data;
    private int hora;
    private String local;
    private String status;
    private String prioridade;
    private String sinistro;

    public String getIdOcorrencia() {
        return IDocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.IDocorrencia = ocorrencia;
    }

    public String getTipoOcorrencias() {
        return tipoOcorrencias;
    }

    public void setTipoOcorrencias(String tipoOcorrencias) {
        this.tipoOcorrencias = tipoOcorrencias;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getSinistro() {
        return sinistro;
    }

    public void setSinistro(String sinistro) {
        this.sinistro = sinistro;
    }

    public Ocorrencia(String ocorrencia, String tipoOcorrencias, Date Data, int hora, String local, String status, String prioridade, String sinistro) {
        this.IDocorrencia = ocorrencia;
        this.tipoOcorrencias = tipoOcorrencias;
        this.Data = Data;
        this.hora = hora;
        this.local = local;
        this.status = status;
        this.prioridade = prioridade;
        this.sinistro = sinistro;
    }
}
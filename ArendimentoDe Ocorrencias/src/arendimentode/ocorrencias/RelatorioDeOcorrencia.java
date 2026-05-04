package arendimentode.ocorrencias;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class RelatorioDeOcorrencia {
    private int IdRelatorio;
    private String descricao;
    private Date dataEncerramento;
    private int horaEncerramento;
    private String reponavel;

    public int getIdRelatorio() {
        return IdRelatorio;
    }

    public void setIdRelatorio(int IdRelatorio) {
        this.IdRelatorio = IdRelatorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public int getHoraEncerramento() {
        return horaEncerramento;
    }

    public void setHoraEncerramento(int horaEncerramento) {
        this.horaEncerramento = horaEncerramento;
    }

    public String getReponavel() {
        return reponavel;
    }

    public void setReponavel(String reponavel) {
        this.reponavel = reponavel;
    }
}
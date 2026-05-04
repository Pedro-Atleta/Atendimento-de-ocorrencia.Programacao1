/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arendimentode.ocorrencias;

/**
 *
 * @author aluno
 */
public class Viatura {
    private int idViaura;
    private String tipoParaSalvamento;
    private String placa;
    private String status;

    public Viatura(int idViaura, String tipoParaSalvamento, String placa, String status) {
        this.idViaura = idViaura;
        this.tipoParaSalvamento = tipoParaSalvamento;
        this.placa = placa;
        this.status = status;
    }
    

    public int getIdViaura() {
        return idViaura;
    }

    public void setIdViaura(int idViaura) {
        this.idViaura = idViaura;
    }

    public String getTipoParaSalvamento() {
        return tipoParaSalvamento;
    }

    public void setTipoParaSalvamento(String tipoParaSalvamento) {
        this.tipoParaSalvamento = tipoParaSalvamento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    } 
} 
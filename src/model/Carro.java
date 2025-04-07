package model;

import java.util.Calendar;

public class Carro {
    public String modelo;
    protected int anoFabricacao;
    private String cor;

    public void anosCarro() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idadeCarro = anoAtual - anoFabricacao;
        System.out.println("O carro " + modelo + " tem " + idadeCarro + " anos.");
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


}


package com.bulletinfotech.licitacao.model;

public class ConfiguracaoDisputa {
    private boolean modoConservador;
    private int casasDecimais;
    private double valorLimite;

    public ConfiguracaoDisputa(boolean modoConservador, int casasDecimais, double valorLimite) {
        this.modoConservador = modoConservador;
        this.casasDecimais = casasDecimais;
        this.valorLimite = valorLimite;
    }

    public boolean isModoConservador() { return modoConservador; }
    public int getCasasDecimais() { return casasDecimais; }
    public double getValorLimite() { return valorLimite; }

    public void setModoConservador(boolean modoConservador) { this.modoConservador = modoConservador; }
    public void setCasasDecimais(int casasDecimais) { this.casasDecimais = casasDecimais; }
    public void setValorLimite(double valorLimite) { this.valorLimite = valorLimite; }
}

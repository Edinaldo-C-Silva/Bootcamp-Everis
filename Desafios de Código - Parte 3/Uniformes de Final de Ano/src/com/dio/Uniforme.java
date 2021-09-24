package com.dio;

public class Uniforme {
	private String nomeEstudante;
    private String corUniforme;
    private String tamUniforme;

    @Override
    public String toString() {
        return corUniforme + " " + tamUniforme + " "+ nomeEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getCorUniforme() {
        return corUniforme;
    }

    public void setCorUniforme(String corUniforme) {
        this.corUniforme = corUniforme;
    }

    public String getTamUniforme() {
        return tamUniforme;
    }

    public void setTamUniforme(String tamUniforme) {
        this.tamUniforme = tamUniforme;
    }
}

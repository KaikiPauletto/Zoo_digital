package br.edu.atitus.kaiki_pauletto.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean perigoso;

    public Reptil(String nome, Integer idade, Boolean perigoso) {
        super(nome, "Réptil", idade);
        this.perigoso = perigoso;
    }

    public Boolean getPerigoso() {
        return perigoso;
    }

    public void setPerigoso(Boolean perigoso) {
        this.perigoso = perigoso;
    }
}
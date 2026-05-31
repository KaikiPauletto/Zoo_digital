package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Ave;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade) {
        super(nome, idade, "Marrom");
    }

    @Override
    public void comer() {
        comer("animais pequenos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está gritando!");
    }

    @Override
    public void voar() {
        IO.println(getNome() + " está voando alto.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma presa.");
    }
}

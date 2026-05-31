package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Ave;

public final class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, Integer idade) {
        super(nome, idade, "Preta e Branca");
    }

    @Override
    public void comer() {
        comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando krill no gelo.");
    }
}

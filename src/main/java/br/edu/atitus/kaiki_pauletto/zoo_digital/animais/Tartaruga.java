package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Reptil;

public final class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        comer("plantas aquáticas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo sons suaves.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }
}
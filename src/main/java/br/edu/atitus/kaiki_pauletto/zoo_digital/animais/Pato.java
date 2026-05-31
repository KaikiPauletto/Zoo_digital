package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Ave;

public final class Pato extends Ave implements Nado, Voo {

    public Pato(String nome, Integer idade) {
        super(nome, idade, "Branca");
    }

    @Override
    public void comer() {
        comer("sementes");
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
    public void voar() {
        IO.println(getNome() + " está voando.");
    }
}

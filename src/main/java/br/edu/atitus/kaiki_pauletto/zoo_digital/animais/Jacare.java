package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Reptil;

public final class Jacare extends Reptil implements Nado, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está rugindo!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está emboscando sua presa.");
    }
}
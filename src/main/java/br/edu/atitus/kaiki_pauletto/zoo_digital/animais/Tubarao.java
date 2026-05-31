package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Peixe;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, Integer idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        comer("focas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está se movimentando silenciosamente.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando sua presa.");
    }
}

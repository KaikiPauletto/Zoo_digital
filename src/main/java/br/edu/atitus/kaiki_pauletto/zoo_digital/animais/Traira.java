package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Peixe;

public final class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, Integer idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        comer("peixes menores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo movimentos na água.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando pequenos peixes.");
    }
}
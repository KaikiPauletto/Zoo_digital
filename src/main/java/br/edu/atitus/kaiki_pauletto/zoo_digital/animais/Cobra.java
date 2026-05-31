package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Reptil;

public final class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("roedores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está sibilando!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma pessoa.");
    }
}

package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Reptil;

public final class Camaleao extends Reptil implements Escalada {

    public Camaleao(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        comer("insetos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo um som de passos ao caminhar.");
    }

    @Override
    public void escalar() {
        IO.println(getNome() + " está escalando um galho.");
    }
}

package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Mamifero;

public final class Golfinho extends Mamifero implements Nado, Predacao {

    public Golfinho(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo sons de golfinho!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando rapidamente!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando peixes.");
    }
}
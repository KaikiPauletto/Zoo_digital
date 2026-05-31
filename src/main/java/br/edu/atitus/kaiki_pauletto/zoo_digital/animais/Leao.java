package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Mamifero;

public final class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está rugindo!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo pela savana!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma zebra.");
    }
}

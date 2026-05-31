package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Mamifero;

public final class Macaco extends Mamifero implements Corrida, Escalada {

    public Macaco(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("banana");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está gritando!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo!");
    }

    @Override
    public void escalar() {
        IO.println(getNome() + " está escalando uma árvore!");
    }
}

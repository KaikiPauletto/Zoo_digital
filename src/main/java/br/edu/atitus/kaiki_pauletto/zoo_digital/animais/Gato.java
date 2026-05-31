package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Mamifero;

public final class Gato extends Mamifero implements Corrida, Nado, Predacao {

    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está miando!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo bem louco!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando pra sair da água!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando um rato.");
    }
}
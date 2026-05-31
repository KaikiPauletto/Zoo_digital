package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {

    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        comer("ração");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está latindo!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo rapidamente!");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando cachorrinho!");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando uma bolinha.");
    }
}
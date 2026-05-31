package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Ave;

public final class Galinha extends Ave implements Corrida {

    public Galinha(String nome, Integer idade) {
        super(nome, idade, "Branca");
    }

    @Override
    public void comer() {
        comer("milho");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está cacarejando!");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo pelo galinheiro.");
    }
}

package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Peixe;

public final class PeixePalhaco extends Peixe implements Nado {

    public PeixePalhaco(String nome, Integer idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        comer("algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está se comunicando.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }
}

package br.edu.atitus.kaiki_pauletto.zoo_digital.animais;

import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Peixe;

public final class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, Integer idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        comer("crustáceos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está emitindo sons submarinos.");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando.");
    }
}

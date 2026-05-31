package br.edu.atitus.kaiki_pauletto.zoo_digital.especies;

public abstract class Animal {

    private static int contador = 0;

    private String nome;
    private Integer idade;
    private String especie;

    public Animal(String nome, Integer idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        contador++;
    }



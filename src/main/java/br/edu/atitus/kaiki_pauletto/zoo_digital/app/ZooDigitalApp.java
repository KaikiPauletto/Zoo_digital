package br.edu.atitus.kaiki_pauletto.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.kaiki_pauletto.zoo_digital.animais.*;
import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.Escalada;
import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.Nado;
import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.kaiki_pauletto.zoo_digital.comportamentos.Voo;
import br.edu.atitus.kaiki_pauletto.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Animal> animais = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            IO.println("\n----------- ZOO DIGITAL -----------");
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("8 - Listar Animais Escaladores");
            IO.println("0 - Sair");
            IO.print("Opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {

                    case 1:
                        cadastrarAnimal(animais, scanner);
                        break;

                    case 2:
                        listarTodosAnimais(animais);
                        break;

                    case 3:
                        listarCorredores(animais);
                        break;

                    case 4:
                        listarNadadores(animais);
                        break;

                    case 5:
                        listarVoadores(animais);
                        break;

                    case 6:
                        listarPredadores(animais);
                        break;

                    case 7:
                        exibirTotalAnimais();
                        break;

                    case 8:
                        listarEscaladores(animais);
                        break;

                    case 0:
                        IO.println("Encerrando...");
                        break;

                    default:
                        IO.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                IO.println("Digite um número válido.");
            }
        }

        scanner.close();
    }

    private static void cadastrarAnimal(List<Animal> animais, Scanner scanner) {

        IO.println("\n----------- CADASTRAR ANIMAL -----------");

        IO.println("1 - Cachorro");
        IO.println("2 - Gato");
        IO.println("3 - Golfinho");
        IO.println("4 - Leão");
        IO.println("5 - Macaco");
        IO.println("6 - Pato");
        IO.println("7 - Pinguim");
        IO.println("8 - Águia");
        IO.println("9 - Galinha");
        IO.println("10 - Traíra");
        IO.println("11 - Peixe-Morcego");
        IO.println("12 - Tubarão");
        IO.println("13 - Peixe-Palhaço");
        IO.println("14 - Cobra");
        IO.println("15 - Jacaré");
        IO.println("16 - Tartaruga");
        IO.println("17 - Camaleão");

        IO.print("Escolha o animal: ");

        int tipo;

        try {
            tipo = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            IO.println("Opção inválida.");
            return;
        }

        IO.print("Nome: ");
        String nome = scanner.nextLine();

        IO.print("Idade: ");
        int idade;

        try {
            idade = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            IO.println("Idade inválida.");
            return;
        }

        Animal animal = null;

        switch (tipo) {

            case 1:
                animal = new Cachorro(nome, idade);
                break;

            case 2:
                animal = new Gato(nome, idade);
                break;

            case 3:
                animal = new Golfinho(nome, idade);
                break;

            case 4:
                animal = new Leao(nome, idade);
                break;

            case 5:
                animal = new Macaco(nome, idade);
                break;

            case 6:
                animal = new Pato(nome, idade);
                break;

            case 7:
                animal = new Pinguim(nome, idade);
                break;

            case 8:
                animal = new Aguia(nome, idade);
                break;

            case 9:
                animal = new Galinha(nome, idade);
                break;

            case 10:
                animal = new Traira(nome, idade);
                break;

            case 11:
                animal = new PeixeMorcego(nome, idade);
                break;

            case 12:
                animal = new Tubarao(nome, idade);
                break;

            case 13:
                animal = new PeixePalhaco(nome, idade);
                break;

            case 14:
                animal = new Cobra(nome, idade);
                break;

            case 15:
                animal = new Jacare(nome, idade);
                break;

            case 16:
                animal = new Tartaruga(nome, idade);
                break;

            case 17:
                animal = new Camaleao(nome, idade);
                break;

            default:
                IO.println("Animal inexistente.");
                return;
        }

        if (animal == null) {
            IO.println("Erro ao cadastrar animal.");
            return;
        }

        animais.add(animal);

        IO.println("Animal cadastrado com sucesso!");
    }

    private static void listarTodosAnimais(List<Animal> animais) {

        if (animais.isEmpty()) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        IO.println("\n----------- LISTA DE ANIMAIS -----------");

        for (Animal animal : animais) {

            IO.println("....................................");
            IO.println("Nome: " + animal.getNome());
            IO.println("Idade: " + animal.getIdade());
            IO.println("Espécie: " + animal.getEspecie());

            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarCorredores(List<Animal> animais) {

        IO.println("\n----------- ANIMAIS CORREDORES -----------");

        boolean encontrou = false;

        for (Animal animal : animais) {

            if (animal instanceof Corrida corredor) {

                encontrou = true;

                IO.println("....................................");
                IO.println("Nome: " + animal.getNome());
                IO.println("Idade: " + animal.getIdade());
                IO.println("Espécie: " + animal.getEspecie());

                corredor.correr();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal corredor cadastrado.");
        }
    }

    private static void listarNadadores(List<Animal> animais) {

        IO.println("\n----------- ANIMAIS NADADORES -----------");

        boolean encontrou = false;

        for (Animal animal : animais) {

            if (animal instanceof Nado nadador) {

                encontrou = true;

                IO.println("....................................");
                IO.println("Nome: " + animal.getNome());
                IO.println("Idade: " + animal.getIdade());
                IO.println("Espécie: " + animal.getEspecie());

                nadador.nadar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal nadador cadastrado.");
        }
    }

    private static void listarVoadores(List<Animal> animais) {

        IO.println("\n----------- ANIMAIS VOADORES -----------");

        boolean encontrou = false;

        for (Animal animal : animais) {

            if (animal instanceof Voo voador) {

                encontrou = true;

                IO.println("....................................");
                IO.println("Nome: " + animal.getNome());
                IO.println("Idade: " + animal.getIdade());
                IO.println("Espécie: " + animal.getEspecie());

                voador.voar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal voador cadastrado.");
        }
    }

    private static void listarPredadores(List<Animal> animais) {

        IO.println("\n----------- ANIMAIS PREDADORES -----------");

        boolean encontrou = false;

        for (Animal animal : animais) {

            if (animal instanceof Predacao predador) {

                encontrou = true;

                IO.println("....................................");
                IO.println("Nome: " + animal.getNome());
                IO.println("Idade: " + animal.getIdade());
                IO.println("Espécie: " + animal.getEspecie());

                predador.cacar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal predador cadastrado.");
        }
    }

    private static void listarEscaladores(List<Animal> animais) {

        IO.println("\n----------- ANIMAIS ESCALADORES -----------");

        boolean encontrou = false;

        for (Animal animal : animais) {

            if (animal instanceof Escalada escalador) {

                encontrou = true;

                IO.println("....................................");
                IO.println("Nome: " + animal.getNome());
                IO.println("Idade: " + animal.getIdade());
                IO.println("Espécie: " + animal.getEspecie());

                escalador.escalar();
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal escalador cadastrado.");
        }
    }

    private static void exibirTotalAnimais() {
        IO.println("\n----------- TOTAL DE ANIMAIS -----------");
        IO.println("Quantidade de animais cadastrados: " + Animal.getContador());
    }
}
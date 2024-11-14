package br.com.catolica.zoologico.model;

public abstract class Pessoa {
    public String nome;
    public int idade;
    public String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

}


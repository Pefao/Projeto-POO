package br.com.catolica.zoologico.pessoa;

import br.com.catolica.zoologico.model.Pessoa;

public class Trabalhador extends Pessoa {

    public int salario;

    public Trabalhador(String nome, int idade, String cpf, int salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}


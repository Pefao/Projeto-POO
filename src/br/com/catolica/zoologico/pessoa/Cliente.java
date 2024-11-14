package br.com.catolica.zoologico.pessoa;

import br.com.catolica.zoologico.model.Pessoa;

public class Cliente extends Pessoa {

    public int saldo;

    public Cliente(String nome, int idade, String cpf, int saldo) {
        super(nome, idade, cpf);
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "saldo=" + saldo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

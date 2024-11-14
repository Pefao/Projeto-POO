package br.com.catolica.zoologico.model;

import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;

public abstract class Animal {
    public String nome;
    public int idade;
    public boolean fome;
    public Perigo perigo;
    public Comida comida;
    public Origem origem;

    public Animal(String nome, int idade, boolean fome, Perigo perigo, Comida comida, Origem origem) {
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.perigo = perigo;
        this.comida = comida;
        this.origem = origem;
    }

    public void alimentar(Comida comida) {
        if(!fome) {
            System.out.println("Nâo esta com fome");
            return;
        }
        if(comida != this.comida) {
            System.out.println("O animal nâo pode comer isso");
            return;
        }
        this.fome = false;
        System.out.println("O animal esta alimentado");
    }

    public abstract String especie();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", fome=" + fome +
                ", perigo=" + perigo +
                ", comida=" + comida +
                ", origem=" + origem +
                ", especie=" + especie()  +
                '}';
    }
}

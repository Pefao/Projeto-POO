package br.com.catolica.zoologico.animal;

import br.com.catolica.zoologico.Interface.IAnimalNadador;
import br.com.catolica.zoologico.Interface.IAnimalTerrestre;
import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;
import br.com.catolica.zoologico.model.Animal;

public class Pinguim extends Animal implements IAnimalNadador, IAnimalTerrestre {
    public Pinguim(String nome, int idade, boolean fome) {
        super(nome, idade, fome, Perigo.BAIXO, Comida.PEIXE, Origem.MADAGASCAR);
    }
    public void escorregar() {
        System.out.println("Pinguim Escorregando");
    }

    @Override
    public void nadar() {
        System.out.println("Piguim Nadando");
    }

    @Override
    public void andar() {
        System.out.println("Pinguim Andando");

    }

    @Override
    public void correr() {
        System.out.println("Pinguim Correndo");

    }

    @Override
    public String especie() {
        return "Pinguim";
    }
}

package br.com.catolica.zoologico.animal;

import br.com.catolica.zoologico.Interface.IAnimalNadador;
import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;
import br.com.catolica.zoologico.model.Animal;

public class Orca extends Animal implements IAnimalNadador {

    public Orca(String nome, int idade, boolean fome) {
        super(nome, idade, fome, Perigo.ALTO, Comida.PEIXE, Origem.OCEANO);
    }

    @Override
    public void nadar() {
        System.out.println("Orca Nadando");

    }

    @Override
    public String especie() {
        return "Orca";
    }
}

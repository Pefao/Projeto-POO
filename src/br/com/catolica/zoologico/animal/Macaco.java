package br.com.catolica.zoologico.animal;

import br.com.catolica.zoologico.Interface.IAnimalTerrestre;
import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;
import br.com.catolica.zoologico.model.Animal;

public class Macaco extends Animal implements IAnimalTerrestre {
    public Macaco(String nome, int idade, boolean fome) {
        super(nome, idade, fome, Perigo.MORTAL, Comida.BANANA, Origem.MADAGASCAR);
    }
    public void pularGalho() {
        System.out.println("Macaco Pulando de Galho");
    }
    public void macacoEngenheiro() {
        System.out.println("Macaco Fazendo Engenharia");
    }

    @Override
    public void andar() {
        System.out.println("Macaco Andando");

    }

    @Override
    public void correr() {
        System.out.println("Macaco Correndo");

    }

    @Override
    public String especie() {
        return "Macaco";
    }
}

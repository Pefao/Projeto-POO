package br.com.catolica.zoologico.animal;

import br.com.catolica.zoologico.Interface.IAnimalTerrestre;
import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;
import br.com.catolica.zoologico.model.Animal;

public class Girafa extends Animal implements IAnimalTerrestre {

    public Girafa(String nome, int idade, boolean fome) {
        super(nome, idade, fome, Perigo.ALTO, Comida.FRUTA, Origem.MADAGASCAR);
    }

    @Override
    public void andar() {
        System.out.println("Girafa Andando");

    }

    @Override
    public void correr() {
        System.out.println("Girafa Correndo");

    }

    @Override
    public String especie() {
        return "Girafa";
    }
}

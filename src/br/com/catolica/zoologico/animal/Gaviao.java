package br.com.catolica.zoologico.animal;

import br.com.catolica.zoologico.Interface.IAnimalVoador;
import br.com.catolica.zoologico.enumerate.Comida;
import br.com.catolica.zoologico.enumerate.Origem;
import br.com.catolica.zoologico.enumerate.Perigo;
import br.com.catolica.zoologico.model.Animal;

public class Gaviao extends Animal implements IAnimalVoador {
    public Gaviao(String nome, int idade, boolean fome) {
        super(nome, idade, fome, Perigo.MEDIO, Comida.CARNE, Origem.AUSTRALIA);
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void planar() {
        System.out.println("Plandando");
    }

    @Override
    public String especie() {
        return "Gavião";
    }
}

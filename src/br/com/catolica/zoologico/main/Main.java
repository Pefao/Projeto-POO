package br.com.catolica.zoologico.main;

import br.com.catolica.zoologico.animal.*;
import br.com.catolica.zoologico.model.Animal;
import br.com.catolica.zoologico.model.Pessoa;
import br.com.catolica.zoologico.pessoa.Cliente;
import br.com.catolica.zoologico.pessoa.Trabalhador;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Animal> animais = Arrays.asList(
            new Gaviao("Claidinho", 2, false),
            new Girafa("Cadu", 10, false),
            new Macaco("Jonga", 20, true),
            new Orca("jubileia", 4, false),
            new Pinguim("Kowalski", 54, false)
    );
    private static List<Cliente> clientes = Arrays.asList(
            new Cliente("Bu", 18, "123456789", 1_000_000 )
    );

    private static List<Trabalhador> trabalhadors = Arrays.asList(
           new Trabalhador("Pedro", 20, "1234567", 400)
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("Digite 1 Para Comprar animal");
            System.out.println("Digite 2 Para Alimentar animal");
            System.out.println("Digite 3 Para Ver animais");
            System.out.println("Digite 4 Para Ver Funcionarios");
            System.out.println("Digite 5 Para Ver Clientes");
            System.out.println("Digite 6 Para Sair");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("animal comprado com sucesso\n");
                    break;
                case "2":
                    alimentaAnimal();
                    break;
                case "3":
                    verAnimais();
                    break;
                case "4":
                    verFuncionarios();
                    break;
                case "5":
                    verClientes();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Numero invalido, coloca direito ai!!!!\n");
                    continue loop;
            }
        }
    }

    public static void verAnimais() {
       for(Animal animal : animais) {
           System.out.println(animal);
       }
    }

    public static void verClientes() {
        for(Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public static void verFuncionarios() {
        for(Trabalhador trabalhador : trabalhadors) {
            System.out.println(trabalhador);
        }
    }
    public static void alimentaAnimal() {
       for (int i = 0; i < animais.size(); i++) {
           System.out.printf("%d - %s \n",  i + 1 , animais.get(i));
        }
       Scanner scanner = new Scanner(System.in);

       String opcao = scanner.nextLine();

       int number;

        try {
            number = Integer.parseInt(opcao);
        } catch (NumberFormatException e) {
            System.out.println("O valor fornecido não evalido");
            return;
        }

        if(--number < 0 || number >= animais.size()) {
            System.out.println("O valor fornecido não evalido");
            return;
        }
        animais.get(number).alimentar(animais.get(number).comida);

    }
}

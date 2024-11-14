# Zoologico - Sistema de Administração

## Descrição do Projeto

O projeto Zoologico é um sistema de gestão onde você assume o papel de administrador de um zoológico. Ele foi desenvolvido para simular e gerenciar diferentes aspectos da vida no zoológico, incluindo a interação com os animais, o gerenciamento de recursos e a administração de visitantes e trabalhadores.

## Estrutura do Projeto

O código é organizado em classes e interfaces, que representam as diferentes entidades e funcionalidades do zoológico:

## Classes Abstratas

Animal: Classe base para todos os animais do zoológico. Contém atributos e métodos comuns a todos os animais.

Pessoa: Classe base para todas as pessoas relacionadas ao zoológico, sejam clientes ou trabalhadores.

## Interfaces

AnimalVoador: Interface que define o comportamento de animais que podem voar.

AnimalTerrestre: Interface que define o comportamento de animais que vivem em terra.

AnimalAquatico: Interface que define o comportamento de animais que vivem na água.

## Classes Específicas

Macaco, Gavião, Girafa (e outros): Classes que estendem a classe abstrata Animal e implementam as interfaces apropriadas para definir seus comportamentos específicos.

Cliente e Trabalhador: Classes que estendem a classe Pessoa e representam as diferentes funções das pessoas dentro do zoológico.

## Atributos Principais

O sistema possui três atributos principais que ajudam a categorizar os animais:

Comida: Quantidade de alimento necessária para cada animal.

Periculosidade: Nível de periculosidade associado ao animal.

Região: Local onde o animal vive no zoológico.

## Funcionalidades

Gerenciamento de Animais: Adicionar, remover e visualizar informações sobre os animais do zoológico.

Gestão de Pessoas: Controle sobre os visitantes e trabalhadores, diferenciando entre clientes e funcionários.

Classificação de Animais: Identificação de animais com base nas interfaces que eles implementam (por exemplo, voadores, terrestres, aquáticos).

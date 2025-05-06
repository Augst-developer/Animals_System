# Projeto: Sistema de Animais (POO em Java)

### Este projeto é uma aplicação simples desenvolvida em Java para praticar conceitos de Programação Orientada a Objetos (POO), como:

- Criação de classes

- Herança

- Encapsulamento

- Métodos e atributos

> O projeto envolve três classes principais (Animal, Peixe, Mamifero) e uma classe de teste (TestarAnimais) para demonstrar o funcionamento do sistema.

## Estrutura das Classes

### Classe Animal

- Atributos: nome, comprimento, patas, cor, ambiente, velocidade.

- Métodos:

  - Construtor para inicializar os atributos.

  - Métodos get e set para cada atributo.

  - Método dados(): imprime todos os dados do animal.

### Classe Peixe

- Herda de: Animal.

- Atributo adicional: caracteristica.

- Métodos:

  - Construtor que recebe os atributos do Animal e caracteristica.

  - Métodos get e set para caracteristica.

  - Método dadosPeixe(): imprime dados do animal + característica do peixe.

### Classe Mamifero
- Herda de: Animal.

- Atributo adicional: alimento.

- Métodos:

  - Construtor que recebe os atributos do Animal e alimento.

  - Métodos get e set para alimento.

  - Método dadosMamifero(): imprime dados do animal + alimento do mamífero.

### Classe TestarAnimais
- Possui o método main que cria objetos das classes e chama os métodos para exibir os dados:

    - Camelo (Mamífero)

    - Tubarão (Peixe)
    
    - Urso-do-canadá (Mamífero)


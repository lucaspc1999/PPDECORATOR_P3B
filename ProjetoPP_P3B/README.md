# Configurador de Carros
Este projeto é um configurador de carros simples que permite adicionar opcionais a um carro básico, usando o padrão de projeto Decorator.

## Descrição
O configurador de carros permite ao usuário iniciar com um carro básico e adicionar opcionais como Sistema de Navegação, Bancos de Couro e Sistema de Som Premium. O custo total do carro é atualizado conforme os opcionais são adicionados. O usuário pode ver a descrição e o custo do carro a qualquer momento durante a configuração.

## Estrutura do Projeto
### Pacotes
* entidades: Contém as classes concretas que representam o carro básico e os decoradores.
* interfac: Contém a interface Carro que define os métodos getDescricao e getCusto.
## Classes
* Principal.java: Classe principal que contém o método main e a lógica de interação com o usuário.
* Carro.java (interface): Define os métodos que todas as classes de carros devem implementar.
* CarroBasico.java: Implementa a interface Carro, representando um carro básico.
* CarroDecorador.java: Classe abstrata que implementa a interface Carro e serve de base para os decoradores.
* BancosDeCouro.java: Extende CarroDecorador e adiciona bancos de couro ao carro.
* SistemaDeNavegacao.java: Extende CarroDecorador e adiciona um sistema de navegação ao carro.
* SistemaDeSomPremium.java: Extende CarroDecorador e adiciona um sistema de som premium ao carro.
## Padrão Decorator
O padrão Decorator permite adicionar comportamentos a objetos de maneira flexível e dinâmica, evitando a criação de subclasses para cada possível combinação de comportamentos. Neste projeto, o padrão Decorator é usado para adicionar opcionais ao carro.

# Como Funciona
1. Interface 'Carro': Define os métodos 'getDescricao' e 'getCusto' que serão implementados pelas classes concretas e decoradoras.
2. Classe 'CarroBasico': Implementa a interface 'Carro', fornecendo uma implementação básica para um carro.
3. Classe Abstrata 'CarroDecorador': Implementa a interface 'Carro' e contém um objeto 'Carro' que será decorado. Esta classe delega as chamadas de método ao objeto 'Carro' decorado.
4. Decoradores Concretos ('BancosDeCouro', 'SistemaDeNavegacao', 'SistemaDeSomPremium'): Extendem 'CarroDecorador' e adicionam funcionalidades específicas, como novos opcionais, ao carro.

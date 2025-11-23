# 👨‍💻 Sistema de Cálculo Salarial Simplificado em Java (POO)

Este projeto é uma aplicação de console desenvolvida em Java, focada em demonstrar conceitos fundamentais da **Programação Orientada a Objetos (POO)**. O objetivo é simular o cadastro e manipulação básica dos dados de um funcionário, incluindo o cálculo do salário líquido e o aumento salarial por porcentagem.

---

## 🎯 Conceitos Abordados

O desenvolvimento desta aplicação permitiu aplicar e reforçar os seguintes conceitos essenciais da POO em Java:

* **Classes e Objetos:** Criação da classe `Funcionario` para modelar uma entidade do mundo real.
* **Atributos:** Definição de características (`Name`, `SalarioBruto`, `Imposto`).
* **Métodos (Comportamento):** Implementação de lógica dentro da classe (`SalarioLiquido()` e `AumentarSalario()`).
* **Encapsulamento (Inicial):** Manutenção da lógica de negócio dentro da classe `Funcionario`.
* **Sobrescrita (`@Override`):** Utilização do método `toString()` para representação amigável do objeto.
* **Sintaxe Fundamental:** Correção de erros comuns de *case-sensitivity* (ex: `String` vs `string`) e assinaturas de método (ex: `main(String[] args)`).
* **Manipulação de Entrada:** Uso da classe `Scanner` para interagir com o usuário via console.

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos

Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina.

### Execução via IDE (IntelliJ, Eclipse, VS Code)

1.  Clone este repositório para sua máquina local.
2.  Abra o projeto em sua IDE preferida.
3.  Localize a classe que contém o método `main` (provavelmente `Main.java` ou `ProgramaFuncionario.java`).
4.  Execute a classe. O programa irá solicitar a entrada dos dados do funcionário no console.

### Estrutura do Projeto

O projeto é dividido em duas classes principais:

1.  **`Funcionario.java`**: Contém a estrutura (atributos) e a lógica (métodos) para manipular os dados do funcionário.
2.  **`Main.java`**: Classe de execução, onde ocorre a entrada de dados do usuário (`Scanner`) e a chamada dos métodos da classe `Funcionario`.

---

## 🛠️ Funcionalidades

O programa executa a seguinte sequência de passos:

1.  **Leitura de Dados:** Solicita o nome, salário bruto e valor do imposto.
2.  **Cálculo e Exibição:** Calcula e exibe o salário líquido (`SalarioBruto` - `Imposto`).
3.  **Aumento Salarial:** Solicita uma porcentagem de aumento.
4.  **Atualização:** Aplica o aumento *apenas* ao `SalarioBruto`.
5.  **Exibição Final:** Mostra os dados do funcionário novamente, refletindo o novo salário líquido.

### Exemplo de Interação no Console

```bash
Entre com os dados do funcionário:
Nome: João da Silva
Salário Bruto: 5000.00
Imposto: 1000.00

Dados iniciais:
Funcionário: João da Silva, Salário Líquido: R$ 4000.00

Digite a porcentagem de aumento salarial: 10.0

Dados atualizados:
Funcionário: João da Silva, Salário Líquido: R$ 4500.00

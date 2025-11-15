📘 Sistema de Gerenciamento de Turma – Java

Um sistema em Java para cadastrar alunos, registrar notas e calcular médias individuais e gerais.
Projeto ideal para praticar POO, composição, validações, regex, tratamento de exceções e Java Streams.

🎯 Objetivo do Projeto

Este projeto tem como finalidade:

Criar uma Turma com nome válido

Cadastrar Alunos com nome completo validado

Registrar notas para cada aluno

Calcular:

Média individual

Média geral da turma

Exibir tudo formatado no final

Servindo de prática para:

Classes e objetos

Relação de composição (Turma → Alunos)

Encapsulamento

Validação de entrada com regex

Stream API para cálculo matemático

Tratamento de exceções no console

🧱 Estrutura das Classes
🔹 Main

Responsável pela interação com o usuário:

Lê nome da turma

Lê quantidade de alunos

Lê nome e notas de cada aluno

Lida com erros de entrada

Imprime a turma ao final

🔹 Turma

Representa uma turma, contendo:

Nome validado

Lista de alunos

Método de calcular média geral

Método toString() formatado

Composição com a classe Aluno

🔹 Aluno

Representa cada aluno, contendo:

Nome validado com regex

Lista de notas

Método para calcular média individual

Métodos getters

toString() personalizado

📊 Diagrama UML (Mermaid)
classDiagram
    class Main {
        +main(String[] args)
    }

    class Turma {
        -String nome
        -List~Aluno~ alunos
        +Turma(String nome)
        +addAluno(Aluno aluno)
        +getNome() String
        +getAlunos() List~Aluno~
        +mediaTurma() double
        +toString() String
    }

    class Aluno {
        -String nome
        -List~Double~ notas
        +Aluno(String nome)
        +addNota(Double nota)
        +media() double
        +getNome() String
        +getNotas() List~Double~
        +toString() String
    }

    Turma "1" --> "*" Aluno : contém

🚀 Como Executar

Compile os arquivos:

javac Main.java Turma.java Aluno.java


Execute:

java Main


Informe:

Nome da turma

Quantidade de alunos

Nome completo de cada aluno

4 notas do aluno

📌 Regras Importantes do Sistema
✔ Nome da Turma

Deve começar com letra maiúscula

Restante apenas letras minúsculas

Sem números ou caracteres especiais

✔ Nome do Aluno

Deve estar no formato:
Nome Sobrenome

Ambos começando com letra maiúscula

Permite 2º sobrenome opcional

✔ Notas

Precisam ser números válidos

São sempre 4 por aluno

📝 Exemplo de Execução (console)
Nome da turma: Programacao
Quantos alunos na turma: 2

Aluno #1:
Nome: João Silva
Nota #1: 8
Nota #2: 7
Nota #3: 9
Nota #4: 8

Aluno #2:
Nome: Maria Santos
Nota #1: 10
Nota #2: 9
Nota #3: 9
Nota #4: 10

Turma: Programacao
Aluno: João Silva - Média: 8.00
Aluno: Maria Santos - Média: 9.50
Média da turma: 8.75

🛠️ Tecnologias e Conceitos Utilizados

Java 17

POO (Programação Orientada a Objetos)

Composição entre classes

Regex (validação Unicode)

Exception Handling

Java Streams API

StringBuilder

# Sistema ReadMyBooks

Projeto de Backend desenvolvido em Java com foco nos conceitos de Programação Orientada a Objetos (POO).

O sistema foi desenvolvido a partir de um workflow de uma biblioteca, transformando suas funcionalidades em classes, atributos, métodos e relacionamentos entre objetos.

## Sobre o projeto

O Sistema de Biblioteca tem como objetivo organizar e gerenciar livros, prateleiras, pesquisas, filtros, reservas e listas de espera.

A proposta do projeto é aplicar na prática os principais conceitos de POO, criando uma estrutura que possa posteriormente ser expandida para um backend completo.

O projeto foi planejado inicialmente a partir de um workflow, que posteriormente foi convertido em um Diagrama de Classes UML para definir a estrutura do sistema.

## Funcionalidades

### Gerenciamento de livros

- Adicionar livros
- Editar informações dos livros
- Excluir livros
- Exibir livros cadastrados
- Pesquisar livros
- Ordenar livros por nome
- Ordenar livros por autor
- Ordenar livros por data de lançamento
- Aplicar filtros

### Reservas

- Realizar reserva de livros
- Cancelar reserva
- Verificar data de entrega
- Identificar livros reservados

### Lista de espera

- Adicionar usuários à lista de espera
- Remover usuários da lista de espera
- Consultar a posição dos usuários
- Controlar a ordem de espera por um livro

## Estrutura do sistema

O sistema é dividido em classes responsáveis por diferentes partes da biblioteca.

### Livro

Representa um livro cadastrado no sistema.

Principais atributos:

```text
nome Read my books
autor Gustavo Rodrigues da Silva e Adler da Rocha Alves
dataLancamento 07/10/2026

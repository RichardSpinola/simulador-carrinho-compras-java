# Simulador de Carrinho de Compras com Catálogo Pré-Carregado

Projeto final da disciplina de Lógica de Programação e Algoritmos (1º semestre — ADS, UCSAL), desenvolvido em dupla.

## Descrição

Sistema de carrinho de compras em Java que utiliza um catálogo pré-carregado de itens e preços. O usuário pode visualizar os itens disponíveis, selecionar um produto, informar a quantidade desejada e adicionar ao carrinho, que armazena os dados de forma organizada até a finalização da compra.

## Tecnologias

- Java (uso de `Scanner` para entrada de dados via console)

## Requisitos atendidos

- **Estruturas de seleção:** menu via `switch` com as opções Catálogo, Compra, Exibir carrinho, Editar Compra e Finalizar Compra.
- **Estrutura de repetição:** `do-while` mantém o programa em execução até a finalização da compra.
- **Vetores paralelos:** ao invés de uma matriz bidimensional, o catálogo e o carrinho são representados por vetores separados (nomes, valores, quantidades em estoque), com o índice vinculando as informações de cada produto.
- **Métodos:** um método para exibir o catálogo, um para processar a compra (adicionar ao carrinho), um para exibir os itens do carrinho e um para finalizar a compra e calcular o total.
- **Catálogo pré-carregado:** 5 produtos com nome, valor unitário e quantidade em estoque definidos no início do programa.

## Extras implementados

- ✅ **Remoção de itens:** opção "Editar Compra" permite remover quantidades já adicionadas ao carrinho, devolvendo o estoque.
- ✅ **Cupom de desconto:** ao finalizar a compra, o cliente pode informar se possui cupom, aplicando 20% de desconto sobre o valor total.
- ✅ **Limite de estoque:** cada produto tem uma quantidade disponível que é atualizada conforme os itens são comprados ou removidos do carrinho.
- ⬜ **Relatório final detalhado:** não implementado — a finalização exibe apenas o valor total, sem o detalhamento item a item.

## Como executar

```bash
javac src/CarrinhoDeCompras_Equipe6.java
java -cp src CarrinhoDeCompras_Equipe6
```

## Autores

Projeto desenvolvido em dupla:

- [@RichardSpinola](https://github.com/RichardSpinola)
- [@ArthurBigdedd](https://github.com/ArthurBigdedd)

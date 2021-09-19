## Pilhas

Basicamente um empilhamento de dados, um é colocado em cima do outro.

##### LIFO - Last in First out
O último elemento adicionado é o primeiro a ser retirado

Cada nó aponta para o anterior em vez de apontar para o próximo
O primeiro nó da pilha aponta para null
Há sempre uma referência apontando para o nó do topo da pilha

#### Métodos

##### Top
Retorna uma referência para o nó no topo da pilha, mas não retira ele do topo.

##### Pop
Retorna uma referência para o nó no topo da pilha e retira o elemento do topo da pilha.
Assim a referência ao topo passa para o nó anterior ao que foi retirado.

##### Push
Adiciona um novo nó à pilha.
A referência de topo vai para o novo nó adicionado.

##### IsEmpty
Retorna um booleano dependendo se a pilha é nula.

## Fila

Basicamente uma fila de pessoas, uma atrás da outra.

##### FIFO - First in First out
O primeiro elemento adicionado é o primeiro a ser retirado

Cada nó aponta para o próximo
O último nó da fila aponta para null
Há sempre uma referência apontando para o último nó

#### Métodos

##### Enqueue
Adiciona um novo elemento atrás da fila
A referência que aponta para o último vai apontar para esse novo nó

##### Dequeue
Retira o primeiro elemento da fila
O segundo elemento passa a ser o primeiro. A referência ao primeiro passa a ser uma referência a null

##### IsEmpty
Verifica se a referência de entrada aponta para null

##### First
Retorna o primeiro elemento da fila, mas não o retira

## Lista Encadeada

Conceito parecido com a fila, mas com algumas mudanças de regras

Cada nó tem uma referência que aponta para o próximo
O último nó aponta para null
Há sempre uma referência apontando para o primeiro nó da lista

#### Métodos

##### Add
Adiciona um nó à lista
Pode-se escolher onde se quer adicionar o nó, diferente das anteriores que só adicionavam no começo.
Ao se adicionar o novo nó a um lugar da lista, o novo nó aponta para o nó a frente, e o nó atrás aponta para o novo nó.

##### Remove
Retira um nó da lista.
A referência do nó anterior vai apontar para o nó à frente
Quando a JVM vê um objeto sem referência pra ele, ela deleta

##### IsEmpty
Verifica se a lista é vazia

##### Get
Pega uma cópia de um nó a partir de um índice, sem removê-lo da lista

## Lista Duplamente Encadeada

Conceito similar ao da Lista Encadeada, mas podendo seguir para ambos os lados

Cada nó tem uma referência que aponta para o próximo nó e o nó anterior
O primeiro nó tem a referência de anterior apontada para null, e o último tem a referência de próximo apontada para null 
Há sempre uma referência apontando para o último e para o primeiro nó da lista

#### Métodos

##### Add (elemento)
Adiciona um novo nó com um elemento

##### Remove
Retira o nó da lista

##### Get
Retorna o dado que está em um nó, mas sem removê-lo

##### Add (elemento, indice)
Adiciona um novo nó com um elemento, e também pode-se escolher o índice da posição que se quer adicionar este nó

## Listas Circulares

Utiliza nós simples, assim como a lista encadeada

Cada nó tem uma referência que aponta para o próximo
O último nó aponta para o primeiro
Há sempre uma referência apontando para o primeiro nó da lista
Último nó é chamado de cabeça, o primeiro é chamado de cauda

#### Métodos

##### Add
Adiciona um novo nó à lista
O novo nó aponta para a antiga cauda, o último aponta para a nova cauda

##### Remove

##### get(index)

##### isEmpty

------------------------------------------

## Árvore

Tipo de estrutura não linear.
Utiliza o nó duplo, mas ambas as referências são a próximos nós.

Cada nó pode referenciar até 2 próximos nós
O nó principal é a raiz, da qual todos os nós saem
Os nós intermediários são os galhos, que são referenciados mas também referenciam outros nós
Os nós das pontas são as folhas, e suas referências apontam para nulo

Nós que saem de outro nó são chamados de "nós filhos", e o nó que leva a este é o "nó pai". É possível que haja "nós irmãos", ambos pertencentes ao mesmo nó pai.

Nós podem ser classificados por seu nível/profundidade (quantos nós se deve passar para chegar nele)
Uma árvore pode ter sub-árvores, que são outras árvores que saem de um de seus galhos

#### Árvore binária

Usada para buscas
Os nós são posicionados de maneira que os valores maiores estão sempre no nó da direita, e os valores menores estão sempre no nó da esquerda.

O conteúdo da árvore binária deve ser comparável!

#### Interface - Comparable

Uma interface para fazer a comparação dos conteúdos dos nós. A classe nó deverá implementar essa interface
Objetos precisam implementar o método CompareTo

#### Operações

##### Inserção
Maiores para a direita, menores para a esquerda
Ao inserir um valor, precisa-se compará-lo com o valor de cada nó, para poder determinar sua posição na árvore

##### Exclusão
Ao se excluir a um nó, pega-se o maior elemento da esquerda dele para torná-lo a nova raíz, pois o maior valor à esquerda é o valor imediatamente menor que a raiz

##### Exibição
Utiliza-se algoritmos recursivos

#### Tipos de atravessamento de árvore

##### Em ordem
Primeiro verifica a árvore que está à esquerda de um nó, depois exibe o próprio nó, depois verifica a árvore que está à direita

##### Pré ordem
Primeiro exibe o valor do nó, depois verifica a árvore à esquerda, depois verifica a árvore à direita

##### Pós ordem
Verifica a árvore à esquerda, depois verifica a árvore à direita, depois exibe o conteúdo do nó
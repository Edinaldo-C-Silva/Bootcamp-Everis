## Estruturas de Dados em Java

Atribuição em java é feita sempre por cópia de valor.

Com tipo primitivo, compiamos o valor em memória para a nova variável, assim o valor é duplicado.
Com objetos, copiamos o valor da referência em memória, sem duplicar o objeto. Ou seja, ao modificar um objeto, também modifica o outro, pois os dois apontam para o mesmo endereço de memória.

### Conceito de Nó

Um espaço em memória que armazena o dado e uma referência para o próximo nó
A estrutura nó tem o espaço para armazenar um tipo de dado (por exemplo, inteiro), e tem também um espaço reservado para apontar para outro nó, possibilitando a criação de uma cadeia de nós.

Java não trabalha com ponteiros, mas com uma variável que armazena uma referência. 

Em uma cadeia, um nó aponta para o próximo nó na cadeia, e o último da cadeia aponta para null

Para apontar para um nó, basta colocar uma referência à própria classe nó como um de seus atributos.

### Generics

#### Wildcards (Coringas)

São usados para representar uma entrada não especificada
Se colocados como parâmetro de um método, aquele método pode receber qualquer tipo de parâmetro

##### Unknown Wildcards

Podem aceitar qualquer coisa

public void imprimeLista(List<?> lista)

##### UpperBounded Wildcards
Podem aceitar somente classes que herdam de uma outra classe especificada

public void imprimeLista(List<? extends pessoa> listaPessoas) 

##### LowerBounded Wildcards
Podem aceitar somente classes que são pais da classe especificada

public void imprimeLista(List<? super Pessoa> listaPessoas)

#### Convenção

Letras utilizadas para cada tipo de wildcard

K = Usado para "key"
V = Usado para "value"
E = usado para "Element"
T = usado para "Type"
? = genérico
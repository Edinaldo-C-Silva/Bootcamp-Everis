## Tipos primitivos

Variáveis básicas
Não aceitam nulos
Possuem valores padrão

#### byte - 8 bits
-128 a 127

#### char - 16 bits
caracteres

#### short - 16 bits
-32768 a 32767

#### int - 32 bits
-2147483648 a 2147483647

#### long - 64 bits
-2^63 a 2^63-1
Deve ter um 'L' ao final do valor

#### float - 32 bits
Números reais - até 3402e38 
Deve ter um 'f' ao final do valor

#### double - 64 bits
Números reais - até 1797e308

#### boolean - 1 bit
true ou false

Tipos Não Primitivos
----------------------

São objetos, possuem métodos para tratar os dados.

#### String
Sequência de caracteres

#### Number
Números

#### Object
Objeto principal do java, todos os outros objetos estendem ele

#### Qualquer outro objeto

## Tipagem

#### Tipagem estática
Verifica os tipos de variáveis em tempo de compilação.

#### Tipagem forte
Quando um tipo é atribuído a uma variável, ele não pode ser alterado.

#### Tipo Inferido
Declara a variável sem exlicitar a tipo, usando a palavra "var" para indicar que é uma variável.

## Modificadores de acesso

#### public
Qualquer classe pode acessar

#### private
Somente a própria classe pode acessar

#### protected
Somente as classes que pertencem ao mesmo pacote podem acessar

#### abstract
Classe ou método.
Método abstrato não tem corpo. Se o método for abstrato a classe deve ser também.
Classe abstrata não pode ser instanciada. Ela é usada para outras classes estenderem.
Ao herdar, deve-se fazer override dos métodos abstratos.

#### static
Variável ou método.
Variável estática pode ser acessada por todas as instâncias daquela classe. quando ela é modificada, a modificação ocorre para todas as classes.
Método estático pode ser executado sem ter uma instância da classe.

#### final
Classe, método ou variável.
Classe final não pode ser estendida.
Método final não pode ser sobrescrito por classes filhas.
Variável final não pode ter seu valor alterado depois de ser atribuído.

## Interface
Todos os métodos da interface devem ser implementados pelas classes que a implementam.
A classe que implementa uma interface se torna daquele tipo.
Métodos default dentro da interface são herdados diretamente pelas classes, sem necessidade de ser sobrescritos.

Quando um novo método é adicionado à interface, ele deve ser implementado nas classes que a implementam. Isso não ocorre com métodos default.

Interfaces podem herdar outras interfaces.

#### Herança Múltipla
Uma classe pode implementar mais de uma interface.
Deve sobrescrever os métodos de todas as interfaces.
Caso mais de uma interface possua o mesmo método default, a classe que as implementa deve sobrescrever o método.

## Enums

Enums são dicionários de dados imutáveis, que não se pode criar novas instâncias.
Enums são static final e seus nomes são em maiúsculo.
O construtor de um Enum é private.
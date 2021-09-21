## Arquitetura em aplicações para Internet

### Tipos de Arquitetura

#### Monolito

Uma única aplicação que tem acesso a um (ou mais) banco de dados e várias conexões externas (clientes)

A aplicação pode ter várias instâncias trabalhando ao mesmo tempo, para distribuir a demanda de serviços.

##### Vantagens

Baixa complexidade (Só tem um serviço)
Monitoramento simplificado (Por ser apenas uma aplicação, é mais fácil de monitorar e modificar)

##### Desvantagens

Stack única (Não se pode mudar as tecnologias da aplicação facilmente)
Compartilhamento de recursos (Se um serviço precisa de mais recursos, será necessário escalar todo o sistema)
Acoplamento (As funcionalidades dependem diretamente uma da outra por estarem no mesmo sistema)
Escalabilidade mais complexa (conforme se precisar escalar a aplicação, vai demorar mais para subir a aplicação)

#### Microserviços

Várias aplicações, cada aplicação fazendo um serviço específico. Cada aplicação está dentro de um nodo, e pode ter mais de uma instância.

Cada aplicação pode ter acesso a apenas um banco de dados dentro do sistema, sendo independentes dos outros bancos.

Um serviço pode ser completamente interno, não tendo conexão com os clientes externos

Pode ser feito de diversas maneiras

#### Microserviço #1

Os serviços podem conversar entre si diretamente, comunicando e integrando suas funcionalidades.

##### Vantagens

Stack Dinâmica (cada um trabalha com tecnologias diferentes)
Simples escalabilidade (Mais fácil e rápido criar mais instâncias)

##### Desvantagens

Acoplamento (um serviço tem comunicação direta com outro, então eles dependem diretamente um do outro)
Monitoramento mais complexo (Tem várias aplicações diferentes para monitorar, com códigos separados e tecnologias separadas)
Provisionamento mais complexo (Por ter vários serviços, é necessário ter um provisionador)

#### Microserviço #2

O sistema utiliza um Message Broker, que faz a comunicação entre os serviços, assim não é necessário se conectar todos os serviços diretamente.

##### Vantagens

Stack Dinâmica (cada um trabalha com tecnologias diferentes)
Simples escalabilidade (Mais fácil e rápido criar mais instâncias)
Desacoplamento (As aplicações se conectam de forma assíncrona, enviando uma mensagem ao Message Broker, para que os outros serviços recebam quando precisem, assim não dependendo diretamente um do outro)

##### Desvantagens

Monitoramento mais complexo (Tem várias aplicações diferentes para monitorar, além de um Message Broker que faz a comunicação de todos os serviços)
Provisionamento mais complexo (Por ter vários serviços, é necessário ter um provisionador, e deve-se prover também o Message Broker, que é o serviço mais importante da aplicação)
Ponto único de falha (O Message Broker é necessário para a comunicação de todos os serviços, se ele falhar, a aplicaçao inteira falha)

#### Microserviço #3

Utiliza um Gerenciador de Pipeline que fará a comunicação entre o proxy e os serviços.

##### Vantagens

Stack Dinâmica (cada um trabalha com tecnologias diferentes)
Simples escalabilidade (Mais fácil e rápido criar mais instâncias)
Desacoplamento (Os serviços não se conectam diretamente, o Pipeline faz a ligação de comunicação entre eles)
Menor Complexidade (Não há a comunicação assíncrona como com o Message Broker, o Pipeline tem a informação de quais passos foram executados, assim podendo se saber quando a aplicação falhou)

##### Desvantagens

Monitoramento mais complexo (Tem várias aplicações diferentes para monitorar, além de um Pipeline que faz a comunicação)
Provisionamento mais complexo (Por ter vários serviços, é necessário ter um provisionador, e deve-se prover também o Pipeline)
Ponto único de falha (O Gerenciador de Pipeline é necessário para a comunicação de todos os serviços, se ele falhar, a aplicaçao inteira será afetada. O Pipeline deverá saber lidar com possíveis falhas)
Gargalo (O Gerenciador de Pipeline pode se tornar um gargalo em toda a aplicação se tiver muita complexidade)

#### Gerenciamento de erros e volume de acesso

É mais complexo no Pipeline e nos processos assíncronos

##### Comunicação assíncrona:
O serviço que produziu a mensagem não espera o retorno pra saber se houve erro.

##### Solução:
###### Dead letter queue
Tem uma nova fila no message broker que retem as mensagens quando elas dão erro, para se tentar novamente
Assim pode-se saber quantos erros deram e porque eles aconteceram.

##### Pipeline:
Quando houver um erro em um passo do pipeline, ele tem que saber desfazer este passo e os anteriores.
Alguns passos não se pode desfazer, o pipeline deve saber lidar com o estado dos passos anteriores ao recomeçar.

##### Solução:
###### Sistema de rollback
Um sistema que possa desfazer os passos anteriores e lidar com as alterações.
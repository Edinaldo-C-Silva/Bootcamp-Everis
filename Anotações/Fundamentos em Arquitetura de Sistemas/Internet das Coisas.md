## Internet das Coisas

Conectar coisas à internet para que elas possam trocar informações

##### Objetivos:

Colocar sensores em objetos do dia-a-dia
Coletar dados dos sensores
Usar estes dados para tomar decisões

##### Conceitos básicos:
- Coisas - Onde se quer colocar os sensores e coletar dados
- Nuvem - Onde se quer processar e armazenar os dados
- Inteligência - O processo de se utilizar os dados armazenados para resolver problemas ou ganhar vantagens

#### Desafios da internet das coisas

- Privacidade e segurança
- Quantidade exponencial de dispositivos conectados à rede
- Ser capaz de processar e armazenar enormes quantidades de informações
- Gerar valor a partir dos dados coletados

#### Arquitetura de Internet das Coisas

Conectar as coisas

##### Atributos a se considerar:

- Baixo consumo de energia (O dispositivo vai se hospedar na coisa que ele está sendo usado, é necerrário ter um baixo consumo de energia, especialmente para objetos que utilizam baterias)
- Rede de dados limitada (muitas vezes o dispositivo não vai estar conectado a um wifi com dados ilimitados, deve-se trabalhar com os dados que estão disponíveis)
- Resiliência (O dispositivo deve se adaptar as situações, como a falta de rede. Por exemplo, um buffer que guarda informações)
- Segurança (O dispositivo deve ser seguro para realizar atividades de maneira a não poder ser usado por pessoas não autorizadas)
- Customização (É necessário que o dispositivo possa se adaptar à situação e ambiente que ele será utilizado)
- Baixo Custo (Por muitos dispositivos serem utilizados, deve-se ter dispositivos que são viáveis)

Dispositivo embarcado funciona diretamente no sistema da coisa (por exemplo, um carro), assim estando sempre ligado e funcionando.

#### Exemplos:

##### Arduíno
Plataforma de prototipagem, com vários sensores de entradas e saídas, e o desenvolvedor pode escrever código em C/C++ que pode ser injetado por interface USB ou serial. A conexão à internet é feita através de Shields.

##### MCUs
Microcontrolador de Chip Único
Usados quando a solução precisa ser confiável e não pode falhar em transmitir os dados (Uso industrial, médico, militar e de transporte)
Ele tem um sistema operacional real time, que fala diretamente com o hardware, e tem um tempo de processamento rápido.

##### Raspberry Pi
Computador completo
Hardware integrado em uma única placa, roda Linux ou Windows.
Pode ter tanto uso doméstico como comercial.

### Protocolo MQTT
Message Queue Telemetric Transport

Protocolo de comunicação com a nuvem utilizado na Internet das Coisas

- Base na pilha do TCP/IP
- Protocolo de mensagem assíncrona
- Padrão OASIS suportado pelas linguagens de programação mais populares
- Criado pela IBM para conectar sensores via satélite

MQTT Broker é um roteador de mensagens
Os dispositivos que estão conectados enviam as mensagens a ele. O Broker recebe as mensagens dos dispositivos, e envia para outros dispositivos que estão inscritos nele.
Dispositivos podem se inscrever no Broker se tiverem interesse em receber as mensagens que ele publica.

#### Tópico para publicar informações

###### Protocolo -> broker -> identificador de usuário -> sensor -> Tipo de informação

- mqtt://broker.io/user/gps/position

###### Para se inscrever no broker

- sub mqtt://broker.io/user/gps/position (se inscrevendo em uma informação específica de um usuario especifico)
- sub mqtt://broker.io/user/gps/velocity
- sub mqtt://broker.io/+/gps/position (se inscrevendo em todos os usuários)
- sub mqtt://broker.io/+/# (se inscrevendo em todas as mensagens de todos os usuários)

#### Nivel de Qualidade de Serviço (QoS)

##### QoS 0 

Quando se publica uma mensagaem, não há garantia de que a mensagem será entregue
Mensagem não é retransmitida

##### QoS 1

Garante que a mensagem foi entregue ao menos uma vez
Mensagem é armazenada no client, publica a mensagem e espera uma confirmação (pode retransmitir caso não haja confirmação)

##### QoS 2

Garante que a mensagem foi entregue pelo menos uma vez
Mensagem é armazenada no client, publica a mensagem e espera uma confirmação (pode retransmitir caso não haja confirmação)
O client então responde ao broker que ele sabe que a mensagem foi recebida, e avisa que pode se deletar a mensagem
O broker então confirma que a mensagem foi deletada
## Web Services

Serviços que permitem a integração entre aplicações
Utilizam linguagens de marcação para permitir a comunicação entre aplicações diferentes
XML e JSON são as mais comuns

#### SOAP

Simple Object Access Protocol

Protocolo baseado em XML para acessar serviços web por HTTP
Desenvolvido para facilitar integração entre aplicações

##### Vantagens

Permite integração entre aplicações, pois usa o XML
Independe da plataforma e software
É um transporte genérico, pode ser usado por outros protocolos além do HTTP

##### Estrutura SOAP

SOAP Envelope - primeiro elemento do documento, encapsula toda a mensagem
SOAP Header - Possui informações de atributos e metadados da requisição
SOAP Body - elemento que contém os detalhes da mensagem

#### XML

Extensive Markup Language

As tags são etiquetas para o conteúdo e facilita a separação de conteúdo
Não tem limitação na criação de tags
Linguagem comum para integração de aplicações

##### Estrutura

<envelope>
    <metodo>
        <chave>valor</chave>
    <metodo>
</envelope>

#### WSDL

Web Dervices Description Language

Usado para descrever Web Services, como um contrato
A descrição é feita em um documento XML, onde é descrito o serviço, especificações de acesso, operações e métodos.

Especifica quais são os métodos, os parâmetros, os retornos, a mensagaem e a descrição do serviço.

http://www.soapclient.com/xml/soapresponder.wsdl
Exemplo de WSDL

https://www.soapUI.org
Interface para facilitar leitura de WSDL

#### XSD

XML Schema Definition

É um esquema no formato XML usado para definir a estrutura de dados.
É como uma documentação de como deve ser montado o XML que será enviado através do Web Service

#### REST

Representational State Transfer

O objeto da chamada é uma representação dele naquele momento

É um estilo de arquitetura que define a implementação de um serviço web
Não é um protocolo
Pode trabalhar com formatos XML, JSON e outros

##### Vatnagens

Permite integrações entre aplicações e entre cliente e servidor.
Utiliza os métodos do HTTP para definir a operação que está sendo efetuada
Arquitetura de fácil compreensão

##### Estrutura do REST

Cliente faz requisição HTTP (GET, POST, PUT, DELETE...) ao servidor
Servidor retora um código de operação e uma mensagem (texto, XML, JSON...)

Quando uma aplicação web disponibiliza rotinas

Para ser uma arquitetura REST, deve seguir os conceitos dos métodos HTTP (por exemplo, se um POST for usado para qualquer coisa que não seja uma criação, a API não é REST)

#### API

Application Programming Interface

Conjuntos de rotinas documentadas e disponibilizadas por uma aplicação para que outras aplicações possam consumir suas funcionalidades

As maiores plataformas de tecnologia disponibilizam APIs para suas funcionalidades:
Facebook, Twitter, Telegram, Whatsapp, Github

#### JSON

JavaScript Object Notation

Formatação leve utilizada para troca de mensagens entre sistemas
Usa uma estrutura de chave e valor e de listas ordenadas

Estrutura

{
    "chave": "valor",
    "lista":[
        {
            "chave": "valor"
        },
        {
            "chave": "valor"
        },
    ]
}

#### Métodos HTTP

##### GET
Solicita a representação de um recurso (o recurso, do jeito que está neste momento)

##### POST
Solicita a criação de um recurso

##### DELETE
Solicita a exclusão de um recurso

##### PUT
Solicita a atualização de um recurso

#### Códigos de Estado

Usados pelo servidos para avisar o cliente sobre o estado da operação

##### 1XX - Informativo
Avisa ao cliente que sua requisição foi recebida

##### 2XX - Sucesso
Retorna ao cliente que a solicitação foi recebida e processada com sucesso

##### 3XX - Redirecionamento
Usado quando se precisa fazer outra ação além da requisitada
Por exemplo, redirecionar para outro endereço web

##### 4XX - Erro do Cliente
O cliente que fez a requisição passou informações erradas.

##### 5XX - Erro do Servidor
A requisição foi passada corretamente, mas o servidor não conseguiu processar por erro interno

https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status
Explicação dos códigos de estado
# Projeto de Microsserviços

Este projeto é uma aplicação baseada em microsserviços, onde a parte front-end é executada em um container Docker já pronto, e o banco de dados utilizado é o PostgreSQL, também em um container Docker.

## Tecnologias Utilizadas

- Docker
- PostgreSQL
- RabbitMQ
- Java/Spring Boot (ou outra tecnologia de back-end)
- [Outras tecnologias que você está utilizando]

## Pré-requisitos

Antes de começar, você precisará ter o Docker instalado em sua máquina. Você pode baixar e instalar o Docker [aqui](https://www.docker.com/get-started).

## Instalação

### 1. Executando o Container do Front-end

Para iniciar o container do front-end, execute o seguinte comando:

docker run -d --name proposta-web-container -p 80:80 matheuspieropan/proposta-web

Isso iniciará o front-end e ele estará acessível em http://localhost.

### 2. Executando o Container do Banco de Dados PostgreSQL

Para iniciar o container do PostgreSQL, execute o seguinte comando:


docker run --name postgres-container -d -e POSTGRES_PASSWORD=123 -e POSTGRES_DB=proposta_db -p 5432:5432 postgres

Isso criará um banco de dados chamado proposta_db com a senha 123. O banco de dados estará acessível na porta 5432.
Conexão com o Banco de Dados

Certifique-se de que sua aplicação back-end está configurada para se conectar ao banco de dados PostgreSQL utilizando as seguintes credenciais:

    Host: localhost
    Porta: 5432
    Nome do Banco de Dados: proposta_db
    Usuário: postgres (usuário padrão)
    Senha: 123

### 3. Executando o Container do RabbitMQ

Para iniciar o container do RabbitMQ com a interface de gerenciamento, execute o seguinte comando:

docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management

Acessando a Interface de Gerenciamento

Após iniciar o container, você pode acessar a interface de gerenciamento do RabbitMQ através do seguinte link:

    http://localhost:15672

As credenciais padrão para login são:

    Usuário: guest
    Senha: guest

Observações

    A porta 5672 é utilizada para comunicação com o RabbitMQ.
    A porta 15672 é utilizada para a interface de gerenciamento.



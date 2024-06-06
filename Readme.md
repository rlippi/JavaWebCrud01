# Projeto de Gerenciamento de Usuários com Spring Boot

Este projeto foi desenvolvido com o objetivo de criar um sistema backend para gerenciamento de usuários, fornecendo endpoints para realizar operações CRUD (Create, Retrieve, Update, Delete) baseado nos procedimentos práticos abaixo.

## Objetivos da Prática

- Criar um projeto Spring Boot em Java.
- Implementar o modelo de domínio.
- Estruturar as camadas lógicas: resource, service, repository.
- Configurar um banco de dados de teste (H2).
- Povoar o banco de dados.
- Implementar operações CRUD.
- Tratamento de exceções.

## Infraestrutura e Materiais Utilizados

### Instalações:

- Spring Tools 4
- Postman

### Software:

- **Spring Tools 4**: IDE baseada em Eclipse, utilizada para projetos Spring Boot.
  - [Download](https://spring.io/tools)
- **Postman**: Aplicativo para testes de API.
  - [Download](https://www.postman.com/downloads/)


## Procedimentos Práticos

### Criação do Projeto Base

1. Crie o projeto base utilizando o Spring Initializr:
   - Maven
   - Java 17
   - Spring Boot 3.0.0
   - JAR packaging
   - Dependência: Spring Web (criada de início, posteriormente a dependência H2 Database será criada manualmente juntamente com JPA)

2. Descompacte o projeto e abra-o no Spring Tool Suite.

3. Configure o projeto para incluir as dependências do Spring Data JPA e H2 Database.

4. Configure os arquivos `application.properties` e `application-test.properties` conforme as instruções.


### Implementação do Modelo de Domínio

1. Crie a classe `User` no pacote `entities`.

2. Adicione os atributos básicos e as annotations necessários para mapeamento da entidade JPA.


### Estruturação das Camadas Lógicas

1. Crie a classe `UserResource` no pacote `resource`.
   - Anote-a com `@RestController` e defina o `@RequestMapping`.

2. Crie a interface `UserRepository` no pacote `repositories` estendendo `JpaRepository`.

3. Crie a interface `UserService` no pacote `services` anotada com `@Service`.


### Implementação das Operações CRUD

1. Implemente os métodos CRUD na classe `UserService`.

2. Implemente os endpoints no `UserResource` utilizando o `UserService`.


### Tratamento de Exceções

1. Crie a classe `ResourceNotFoundException` no pacote `exceptions`.

2. Implemente o `ResourceExceptionHandler` para tratar exceções.


### Teste da Aplicação

Utilize o Postman para testar os endpoints implementados.


## Checklist

- [x] Criação do projeto base com Spring Initializr.
- [x] Adição das dependências e configuração do projeto.
- [x] Implementação das classes `User`, `UserResource`, `UserService`, `UserRepository`.
- [x] Implementação das classes e mecanismo de exceção.
- [x] Configuração da aplicação para testes.
- [x] Teste da aplicação com o Postman.


## Como executar o código:

1- Acesse o STS Studio: File > Import > Maven > Existing Maven Projects;
2- Em Maven Projects clique em "Browse" > crud > clique no botão "Selecionar Pasta"
3- Selecione o arquivo "Pow.xml" > clique em "Finish".
4- Acesse o caminho: src/main/java > br.com.portfolio.crud;
5- Clique com o botão direito em CrudApplication.java > Run As > Spring Boot App

Pronto! A aplicação já está rodando! 
Agora acesse o Postman e faça os testes como: GET > localhost:8080/users


## Resultados

O projeto foi concluído atendendo a todas as requisições acima.

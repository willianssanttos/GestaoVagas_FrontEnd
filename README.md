# Gestão de Vagas - Frontend

### Descrição
O Gestão de Vagas - Frontend é uma interface de usuário desenvolvida para facilitar a interação com o sistema de gestão de vagas. Este projeto é desenvolvido com Java, Spring Boot E Thymeleaf, e serve como ponto de acesso visual e funcional para empresas e candidatos.

--------------

#### Funcionalidades

- Visualização de Vagas : Apresenta vagas disponíveis com informações desenvolvidas.
- Cadastro de Usuários : Permite que candidatos e empresas se registrem.
- Autenticação JWT : Login seguro para empresas e candidatos.

------------

#### Tecnologias Utilizadas

- Java : Linguagem principal do desenvolvimento.
- Spring Boot : Framework para desenvolvimento rápido.
- Maven : Gerenciador de dependências.
- Docker : Para conteinerização do frontend.
- Thymeleaf : Para renderização dinâmica de páginas HTML.

-------------

#### Requisitos para Execução

- Java 17 ou superior
- Maven 3.8+
- Docker (opcional, para execução via containers)

---------------

### Como Executar

##### Configurar a aplicação :

- Se o backend está rodando e configurado corretamente.
1. Atualizar as configurações de conexão com o backend no arquivo ``application.properties``.

2. Construir o projeto:
    ./mvnw clean install

3. Executar a aplicação:
    ./mvnw spring-boot:run

4. Acessar o sistema : Acesse o sistema pelo navegador em: http://localhost:8082

----------------

### Uso do Docker

 Construir e executar o contêiner :

- docker build -t gestao-vagas-frontend .
- docker run -p 8080:8080 gestao-vagas-frontend
- Acessar o sistema: O serviço estará disponível em http://localhost:8080 .


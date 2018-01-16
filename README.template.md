# vehicle-rest-webapp
> Aplicação REST de cadastro de veículos.

[![Build Status][travis-image]][travis-url]

Trata-se de uma aplicação REST com Spring Boot + Spring Data JPA + Spring Security + Maven para cadastro de veículos.

## Instalação

OS X & Linux & Windows :

```sh
java -jar vehicle-rest-webapp-1.0.jar
```

## Exemplo de uso

Alguns exemplos interessantes e úteis sobre como seu projeto pode ser utilizado. Adicione blocos de códigos e, se necessário, screenshots.

## Configuração para Desenvolvimento

A aplicação é do tipo standalone, sendo necessário apenas que uma JVM esteja instalada na plataforma. As dependências internas da aplicação são gerenciadas através da ferramenta Maven. A aplicação pode ser modificada (via pom.xml) para ser compilada para um .war que pode ser executado em qualquer Servlet container ou Webserver típico (Tomcat, WildFly, Glassfish etc). 

Para execução desta aplicação é necessário apenas que o download deste repositório seja realizado, extraído e acessado via terminal. O projeto vehicle-rest-webapp se encontrará dentro do diretório extraído, o seguinte comando deve então ser executado no terminal, com uma JVM pré-instalada e a JDK configurada adequadamente na variável de ambiente JAVA_HOME: 

```sh
mvn spring-boot:run
```

## Histórico de lançamentos

* 1.0
    * O primeiro lançamento adequado
* 0.0.1-SNAPSHOT
    * Projeto em andamento

## Meta

Glênio Silva Pimentel – [@GlenioSP](https://www.linkedin.com/in/gleniosp/) – glenio.sp@gmail.com

Distribuído sob a licença MIT.

[https://github.com/GlenioSP/](https://github.com/GlenioSP/)

[travis-image]: https://img.shields.io/travis/dbader/node-datadog-metrics/master.svg?style=flat-square
[travis-url]: https://ci.spring.io/teams/spring-boot/pipelines/spring-boot?groups=Build

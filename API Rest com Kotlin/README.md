```¨PROJETO EM DESENVOLVIMENTO¨```

 <h1 align="center">
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> API Rest com Kotlin  (PT/BR) </span>
</h1>

<h2 align="center">Descrição do Projeto 🫧</h2> 
<p>O desafio de projeto "Documentando e Testando sua API Rest com Kotlin" tem como objetivo desenvolver habilidades na criação de documentação e testes para uma API Rest utilizando a linguagem Kotlin. O desafio consistirá em criar uma API Rest completa, documentar seus endpoints utilizando a especificação OpenAPI e implementar testes automatizados para garantir o funcionamento correto da API. Além disso, o desafio irá estimular o uso de boas práticas de programação e a compreensão dos conceitos fundamentais de testes e documentação de APIs Rest.</p>
<p>Implemente as regras de negócio a seguir para a solicitação de empréstimo: </p>
<ol>
  <li>o máximo de parcelas permitido será 48</li>
  <li>data da primeira parcela deverá ser no máximo 3 meses após o dia atual</li>
</ol>
<br>
<h2 align="center">API para Sistema de Avaliação de Créditos 🫧</h2>
<p>Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma <strong>API REST SPRING BOOT E KOTLIN</strong> 🍃💜 para a empresa fornecer aos seus clientes as seguintes funcionalidades:</p>

<ul>
<li><h3>Cliente (Customer):</h3>
  <ul>
    <li><strong>Cadastrar:</strong>
         <ol>
            <li><strong>Request: </strong><em>firstName, lastName, cpf, income, email, password, zipCode e street</em></li>
            <li><strong>Response: </strong><em>String</em></li>
        </ol>
    </li>
  <li><strong>Editar cadastro:</strong>
    <ol>
      <li><strong>Request: </strong><em>id, firstName, lastName, income, zipCode, street</em></li>
      <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
    </ol>
  </li>  
  <li><strong>Visualizar perfil:</strong>
    <ol>
      <li><strong>Request: </strong> <em>id</em></li>
      <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
    </ol> 
  </li>
  <li><strong>Deletar cadastro:</strong>
    <ol>
      <li><strong>Request: </strong><em>id</em></li>
      <li><strong>Response: </strong><em>sem retorno</em></li>
    </ol>
  </li>
  </ul>
  </li>
  <li><h3>Solicitação de Empréstimo (Credit):</h3>
  <ul>
    <li><strong>Cadastrar:</strong>
         <ol>
            <li><strong>Request: </strong><em>creditValue, dayFirstOfInstallment, numberOfInstallments e customerId</em></li>
            <li><strong>Response: </strong><em>String</em></li>
        </ol>
    </li>
    <li><strong>Listar todas as solicitações de emprestimo de um cliente:</strong>
    <ol>
      <li><strong>Request: </strong><em>customerId</em></li>
      <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment</em></li>
    </ol> 
    </li>
    <li><strong>Visualizar um emprestimo:</strong>
    <ol>
      <li><strong>Request: </strong><em>customerId e creditCode</em></li>
      <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer</em></li>
    </ol> 
    </li>
</ul>

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="450" width="650" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>
<figure>
<p align="center">
  <img src="https://i.imgur.com/1Ea5PH3.png" height="350" width="600" alt="Arquitetura em 3 camadas Projeto Spring Boot"/><br>
  Arquitetura em 3 camadas Projeto Spring Boot
</p>
</figure>
 
<hr>

```¨PROJECT IN DEVELOPMENT¨```

<h1 align="center">
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> API Rest with Kotlin (EN) </span>
</h1>

<h2 align="center">Project Description 🫧</h2> 
<p>The project challenge "Documenting and Testing your API Rest with Kotlin" aims to develop skills in creating documentation and tests for a Rest API using the Kotlin language. The challenge involves creating a complete Rest API, documenting its endpoints using the OpenAPI specification, and implementing automated tests to ensure the correct functioning of the API. Additionally, the challenge encourages the use of best programming practices and an understanding of fundamental concepts of Rest API testing and documentation.</p>
<p>Implement the following business rules for loan requests: </p>
<ol>
  <li>The maximum number of installments allowed is 48.</li>
  <li>The first installment date must be at most 3 months after the current day.</li>
</ol>
<br>
<h2 align="center">API for Credit Evaluation System 🫧</h2>
<p>A loan company needs to create a credit request analysis system. Your task is to create a <strong>REST API with SPRING BOOT AND KOTLIN</strong> 🍃💜 to provide the following functionalities to its clients:</p>

<ul>
<li><h3>Customer:</h3>
  <ul>
    <li><strong>Register:</strong>
         <ol>
            <li><strong>Request: </strong><em>firstName, lastName, cpf, income, email, password, zipCode, and street</em></li>
            <li><strong>Response: </strong><em>String</em></li>
        </ol>
    </li>
  <li><strong>Edit Profile:</strong>
    <ol>
      <li><strong>Request: </strong><em>id, firstName, lastName, income, zipCode, street</em></li>
      <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
    </ol>
  </li>  
  <li><strong>View Profile:</strong>
    <ol>
      <li><strong>Request: </strong> <em>id</em></li>
      <li><strong>Response: </strong><em>firstName, lastName, income, cpf, email, income, zipCode, street</em></li>
    </ol> 
  </li>
  <li><strong>Delete Profile:</strong>
    <ol>
      <li><strong>Request: </strong><em>id</em></li>
      <li><strong>Response: </strong><em>No return</em></li>
    </ol>
  </li>
  </ul>
  </li>
  <li><h3>Loan Request (Credit):</h3>
  <ul>
    <li><strong>Register:</strong>
         <ol>
            <li><strong>Request: </strong><em>creditValue, dayFirstOfInstallment, numberOfInstallments, and customerId</em></li>
            <li><strong>Response: </strong><em>String</em></li>
        </ol>
    </li>
    <li><strong>List all loan requests for a customer:</strong>
    <ol>
      <li><strong>Request: </strong><em>customerId</em></li>
      <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment</em></li>
    </ol> 
    </li>
    <li><strong>View a loan:</strong>
    <ol>
      <li><strong>Request: </strong><em>customerId and creditCode</em></li>
      <li><strong>Response: </strong><em>creditCode, creditValue, numberOfInstallment, status, emailCustomer, and incomeCustomer</em></li>
    </ol> 
    </li>
</ul>

<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="450" width="650" alt="Credit Evaluation System API"/><br>
  Simplified UML Diagram of a Credit Evaluation System API
</p>
</figure>
<figure>
<p align="center">
  <img src="https://i.imgur.com/1Ea5PH3.png" height="350" width="600" alt="Spring Boot Project 3-layer Architecture"/><br>
  3-layer Architecture of the Spring Boot Project
</p>
</figure>
 
<hr>




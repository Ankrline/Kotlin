<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Singleton (PT/BR) </span>
</h1> 

O Singleton é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.

Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar e listar usuários. Você tem a opção de implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários em toda a aplicação. No entanto, a implementação do padrão Singleton é opcional e você pode optar por seguir uma abordagem diferente para resolver o desafio, se preferir. 

## Objetivo 🫧
```Repositório desenvolvido para fins didáticos, o desafio é criar padronizando um Sistema de Gerenciamento de Usuários.```

## Especificações do Desafio 🫧

Crie uma classe `User` com os seguintes atributos: `id` (inteiro) e `name` (string).
Implemente uma classe `UserManager` que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:

  > a. Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
  > 
  > b. Listar todos os usuários cadastrados.

No programa principal `(main)`, siga as etapas abaixo:
  > a. Solicite ao usuário a quantidade de usuários que deseja cadastrar.
  > 
  > b. Peça ao usuário para informar os nomes dos usuários, um por linha.
  >
  > c. Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.

#### Entrada
Um número inteiro representando a quantidade de usuários que o usuário deseja cadastrar. 
Para cada usuário a ser cadastrado, uma string contendo o nome do usuário. 

#### Saída
 Uma lista com os nomes dos usuários cadastrados. 

## Exemplos 🫧
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
  <tr>
    <th>ENTRADA</th>
    <th>SAÍDA</th>
  </tr>
  <tr>
    <td>2<br>Ada<br>Linus</td>
    <td>1 - Ada<br>2 - Linus</td>
  </tr>
  <tr>
    <td>3<br>Grace<br>Alan<br>Steve</td>
    <td>1 - Grace<br>2 - Alan<br>3 - Steve</td>
  </tr>
  <tr>
    <td>4<br>Tim<br>Margaret<br>John<br>Richard</td>
    <td>1-Tim<br>2-Margaret<br>3-John<br>4-Richard</td>
  </tr>
</table>

## Nota 🫧
A implementação do padrão Singleton traz uma abordagem centralizada, com uma única instância do gerenciador de entidades, favorecendo a consistência dos dados e facilitando o acesso global. Por outro lado, optar por não usar o padrão permite maior flexibilidade, possibilitando várias instâncias independentes. A escolha depende das demandas do projeto, design e manutenção. Isso garante adaptabilidade entre diferentes linguagens ou contextos.


<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Singleton (ENG) </span>
</h1> 

Singleton is a software design approach that aims to ensure the existence of only one instance of a class and provide a centralized point to access it. This is especially beneficial in contexts where it is desirable to maintain a single instance of a class responsible for controlling a shared resource, such as settings, database connections, or caches.

In this challenge, you should create a user management system that allows adding and listing users. You have the option to implement the Singleton pattern to ensure that there is only one instance of the user manager throughout the application. However, the implementation of the Singleton pattern is optional, and you can choose a different approach to solve the challenge if you prefer.

## Objective 🫧
```This repository is developed for educational purposes. The challenge is to create a standardized User Management System.```

## Challenge Specifications 🫧

Create a `User` class with the following attributes: `id` (integer) and `name` (string).
Implement a `UserManager` class that follows the Singleton pattern. This class should have the following functionalities:

> a. Add a new user to the system, taking the name as input.
> 
> b. List all registered users.

In the main program `(main)`, follow the steps below:

> a. Ask the user for the number of users they want to register.
> 
> b. Prompt the user to enter the names of users, one per line.
> 
> c. After receiving the names and registering the users, list the registered users.

#### Input
An integer representing the number of users the user wants to register.
For each user to be registered, a string containing the user's name.

#### Output
A list of the names of the registered users.

## Examples 🫧
The table below presents examples with some input data and their respective expected outputs. Be sure to test your program with these examples and other possible cases.

<table>
  <tr>
    <th>INPUT</th>
    <th>OUTPUT</th>
  </tr>
  <tr>
    <td>2<br>Ada<br>Linus</td>
    <td>1 - Ada<br>2 - Linus</td>
  </tr>
  <tr>
    <td>3<br>Grace<br>Alan<br>Steve</td>
    <td>1 - Grace<br>2 - Alan<br>3 - Steve</td>
  </tr>
  <tr>
    <td>4<br>Tim<br>Margaret<br>John<br>Richard</td>
    <td>1 - Tim<br>2 - Margaret<br>3 - John<br>4 - Richard</td>
  </tr>
</table>

## Note 🫧
The implementation of the Singleton pattern brings a centralized approach with a single instance of the entity manager, favoring data consistency and facilitating global access. On the other hand, choosing not to use the pattern allows for greater flexibility, enabling multiple independent instances. The choice depends on the project's demands, design, and maintenance. This ensures adaptability across different languages or contexts.




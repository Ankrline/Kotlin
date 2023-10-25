<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Builder (PT/BR) </span>
</h1>
 
O Design Pattern "Builder" é uma técnica utilizada para criar objetos complexos passo a passo, separando o processo de construção da representação final do objeto. Isso ajuda a melhorar a legibilidade e a flexibilidade do código, especialmente quando você precisa criar objetos com muitos parâmetros ou configurações diferentes.

Neste desafio, buscando soluções para um problema de negócios em uma plataforma de e-commerce, é necessário melhorar a forma como os pedidos personalizados são tratados. Você tem a opção de implementar a solução utilizando o padrão Builder para criar pedidos de forma mais eficiente e organizada, ou seguir uma abordagem alternativa sem a necessidade de utilizar o padrão Builder.

## Objetivo 🫧
```Repositório desenvolvido para fins didáticos, o desafio é construir um Pedido Personalizado```

## Detalhamento da tarefa 🫧

>1. Capture o nome do cliente.
>
>2. Solicite ao usuário a quantidade de produtos que deseja adicionar ao pedido.
>
>3. Para cada produto, capture o nome, preço e quantidade.
>
>4. Capture o endereço de entrega.
>
>5. Calcule o total do pedido somando o preço de cada produto multiplicado pela quantidade.
>
>6. Imprima os detalhes do pedido, incluindo os produtos, seus preços, quantidades, total a pagar e endereço de entrega.

### Entrada 
O programa deve receber as seguintes informações do usuário:

>1. Nome do cliente (string);
>
>2. Lista de produtos a serem incluídos no pedido (cada produto possui nome, preço e quantidade);
>
>3. Endereço de entrega (string);

### Saída
>1. Após receber todas as informações do usuário, o programa deve criar um objeto de pedido personalizado usando o padrão Builder e imprimir os detalhes do pedido construído, incluindo o total a pagar.
>
>2. Para este desafio, considere apenas uma casa decimal após a vírgula.

## Exemplos 🫧
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
  <tr>
    <th>ENTRADA</th>
    <th>SAÍDA</th>
  </tr>
 <tr>
    <td>Ada<br>1<br>Chocolate<br>1.5<br>3<br>Arabaiana</td>
    <td>Ada<br>1. Chocolate | 1.5 | 2<br>Total: 3.0<br>End: Arabaiana</td>
  </tr>
  <tr>
    <td>Dante<br>1<br>Suco<br>2.5<br>2<br>Alto</td>
    <td>Dante<br>1. Suco | 2.5 | 2<br>Total: 5.0<br>End: Alto</td>
  </tr>
  <tr>
    <td>Sofia<br>1<br>Pipoca<br>4.5<br>3<br>Lagoa</td>
    <td>Sofia<br>1. Pipoca | 4.5 | 3<br>Total: 13.50<br>End: Lagoa</td>
  </tr>
</table>table>
  
## Nota 🫧
O padrão Builder é uma abordagem valiosa quando se trata de criar objetos complexos com diferentes configurações. No entanto, deve-se considerar a relação entre a complexidade do problema e a necessidade de aplicar o padrão, especialmente em cenários mais simples. A decisão de usar ou não o padrão Builder dependerá das necessidades específicas do projeto e das características do sistema em que está sendo aplicado.

<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Builder (EN) </span>
</h1>

The "Builder" Design Pattern is a technique used to create complex objects step by step, separating the construction process from the final object's representation. This helps improve code readability and flexibility, especially when you need to create objects with many different parameters or configurations.

In this challenge, while seeking solutions to a business problem in an e-commerce platform, there is a need to improve how custom orders are handled. You have the option to implement the solution using the Builder pattern to create orders more efficiently and organized, or follow an alternative approach without the need for using the Builder pattern.

## Objective 🫧
```Repository developed for didactic purposes, the challenge is to build a Custom Order.```

## Task Details 🫧

>1. Capture the customer's name.
>
>2. Ask the user for the number of products they want to add to the order.
>
>3. For each product, capture the name, price, and quantity.
>
>4. Capture the delivery address.
>
>5. Calculate the total order amount by summing the price of each product multiplied by the quantity.
>
>6. Print the order details, including the products, their prices, quantities, total to pay, and delivery address.

### Input
The program should receive the following information from the user:

>1. Customer's name (string);
>
>2. List of products to be included in the order (each product has a name, price, and quantity);
>
>3. Delivery address (string);

### Output
>1. After receiving all the user's information, the program should create a custom order object using the Builder pattern and print the constructed order details, including the total to pay.
>
>2. For this challenge, consider only one decimal place after the comma.

## Examples
The table below presents examples with some input data and their respective expected outputs. Be sure to test your program with these examples and with other possible cases.

<table>
  <tr>
    <th>INPUT</th>
    <th>OUTPUT</th>
  </tr>
 <tr>
    <td>Ada<br>1<br>Chocolate<br>1.5<br>3<br>Arabaiana</td>
    <td>Ada<br>1. Chocolate | 1.5 | 2<br>Total: 3.0<br>End: Arabaiana</td>
  </tr>
  <tr>
    <td>Dante<br>1<br>Juice<br>2.5<br>2<br>Alto</td>
    <td>Dante<br>1. Juice | 2.5 | 2<br>Total: 5.0<br>End: Alto</td>
  </tr>
  <tr>
    <td>Sofia<br>1<br>Popcorn<br>4.5<br>3<br>Lagoa</td>
    <td>Sofia<br>1. Popcorn | 4.5 | 3<br>Total: 13.50<br>End: Lagoa</td>
  </tr>
</table>

## Note 🫧
The Builder pattern is a valuable approach when dealing with creating complex objects with different configurations. However, the decision to use the Builder pattern or not should depend on the specific needs of the project and the characteristics of the system in which it is being applied, particularly in simpler scenarios.

<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Extension-Function (PT/BR) </span>
</h1> 

As Extension Functions, ou Funções de Extensão, são recursos poderosos disponíveis em linguagens de programação que permitem adicionar métodos a classes existentes sem a necessidade de modificar o código-fonte original dessas classes. Isso facilita a criação de novas funcionalidades ou comportamentos para tipos de dados já existentes, mesmo quando você não tem acesso ao código fonte original desses tipos.

Neste desafio, com foco em um sistema de gerenciamento de livros para uma biblioteca digital, você deve implementar uma solução que permita gerar um "slug" único para representar os dados de um livro. Um "slug" é uma versão simplificada e amigável para URLs de um texto, com espaços substituídos por traços (-) e caracteres especiais removidos. A solução requer que você crie uma função de extensão `generateSlug()` para a classe `String` que fará essa transformação.

## Objetivo 🫧
```Repositório desenvolvido para fins didáticos, o desafio é criar e gerar Slugs de Livros```

## Funcionalidade a ser implementada 🫧

`generateSlug()`: Crie uma função de extensão chamada `generateSlug()` para a classe String. A função deve gerar um "slug" para a string fornecida, removendo espaços e caracteres especiais, substituindo-os por traços.

### Entrada
A entrada consistirá em duas strings: o título e o autor de um livro.

### Saída
Imprima o "slug" gerado para o livro, no seguinte padrão:
`{nome-livro-separado-por-ifens_nome-autor-separado-por-ifens}`

## Exemplos 🫧
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
  <tr>
    <th>ENTRADA</th>
    <th>SAÍDA</th>
  </tr>
   <tr>
    <td>Senhor dos Aneis<br>J. R. R Tolkien</td>
    <td>Slug gerado para o livro:
senhor-dos-aneis_j-r-r-tolkien</td>
  </tr>
   <tr>
    <td>O Enigma do Parque<br>Jody Shields</td>
    <td>Slug gerado para o livro:
o-enigma-do-parque_jody-shields</td>
  </tr>
   <tr>
    <td>O Chamado de Cthulhu<br>H. P. Lovecraft</td>
    <td>Slug gerado para o livro:
o-chamado-de-cthulhu_h-p-lovecraft</td>
  </tr>
</table>

## Nota 🫧
O uso de extension functions tem seus pontos positivos, como a extensibilidade e organização do código, mas também apresenta desafios, como a possível confusão e a separação da lógica. A solução eficiente depende da linguagem de programação escolhida e das práticas de programação adotadas.

<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Extension Function (ENG) </span>
</h1>

Extension Functions, also known as Extension Methods, are powerful features available in programming languages that allow you to add methods to existing classes without modifying the original source code of those classes. This makes it easy to create new functionality or behaviors for existing data types, even when you don't have access to the original source code of those types.

In this challenge, focusing on a book management system for a digital library, you are required to implement a solution that allows generating a unique "slug" to represent book data. A "slug" is a simplified and URL-friendly version of text, with spaces replaced by hyphens (-) and special characters removed. The solution requires you to create an extension function `generateSlug()` for the `String` class that performs this transformation.

## Objective 🫧
```Repository developed for educational purposes, the challenge of creating and generating Book Slugs```

## Functionality to be implemented 🫧

`generateSlug()`: Create an extension function called `generateSlug()` for the String class. The function should generate a "slug" for the provided string, removing spaces and special characters and replacing them with hyphens.

### Input
The input will consist of two strings: the title and author of a book.

### Output
Print the generated "slug" for the book in the following format:
`{book-name-separated-by-hyphens_author-name-separated-by-hyphens}`

## Examples 🫧
The table below presents examples with some input data and their respective expected outputs. Be sure to test your program with these examples and with other possible cases.

<table>
  <tr>
    <th>INPUT</th>
    <th>OUTPUT</th>
  </tr>
   <tr>
    <td>The Lord of the Rings<br>J. R. R. Tolkien</td>
    <td>Generated Slug for the Book:
the-lord-of-the-rings_j-r-r-tolkien</td>
  </tr>
   <tr>
    <td>The Park Enigma<br>Jody Shields</td>
    <td>Generated Slug for the Book:
the-park-enigma_jody-shields</td>
  </tr>
   <tr>
    <td>The Call of Cthulhu<br>H. P. Lovecraft</td>
    <td>Generated Slug for the Book:
the-call-of-cthulhu_h-p-lovecraft</td>
  </tr>
</table>

## Note 🫧
The use of extension functions has its advantages, such as code extensibility and organization, but also presents challenges, such as potential confusion and logic separation. The efficient solution depends on the chosen programming language and programming practices.


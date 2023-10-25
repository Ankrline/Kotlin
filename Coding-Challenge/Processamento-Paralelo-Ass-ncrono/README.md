<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Processamento Paralelo/Assíncrono (PT/BR) </span>
</h1> 

No mundo da programação, frequentemente enfrentamos situações onde múltiplas tarefas precisam ser executadas simultaneamente para otimizar o tempo de resposta ou processamento. Um exemplo comum é o download de múltiplos arquivos da internet.

Para este desafio, suponha que você tenha uma lista de URLs que deseja "baixar". Seu objetivo é simular o download desses arquivos de forma paralela e imprimir o tamanho de cada URL após seu "download" ter sido disparado. Para simplificar, cada URL leva exatamente 1 segundo para ser "baixado".

## Objetivo 🫧
```Repositório desenvolvido para fins didáticos, o desafio é criar um tempo de Download Paralelo```

## Requisitos 🫧

> 1. Defina uma lista de URLs que você deseja "baixar".
>
> 2. Crie uma função para simular o "download" de uma URL. Essa função deve aceitar uma URL como entrada e retornar o tamanho da URL.
>
> 3. Implemente uma lógica que permita iniciar o "download" de várias URLs em paralelo.
>
> 4. Imprima o tamanho de cada URL na ordem em que foram inseridas.

### Entrada
A entrada consiste em uma lista de URLs, uma em cada linha. Uma linha vazia indica o fim da lista.

### Saída
A saída deve mostrar o tamanho de cada URL na ordem em que foram inseridas, seguido pelo "Tempo total", que é simplesmente a contagem de URLs.

## Exemplos 🫧
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
  <tr>
    <th>ENTRADA</th>
    <th>SAÍDA</th>
  </tr>
  <tr>
    <td>https://chat.openai.com/<br>https://www.invertexto.com/<br>https://web.dio.me/<br>[Linha vazia]</td>
    <td>Iniciando downloads...<br>Arq1: 24<br>Arq2: 27<br>Arq3: 19<br>Tempo total: 3</td>
  </tr>
  <tr>
    <td>https://www.netflix.com/<br>https://www.hbomax.com/<br>https://www.amazon.com.br/<br>[Linha vazia]</td>
     <td>Iniciando downloads...<br>Arq1: 24<br>Arq2: 23<br>Arq3: 26<br>Tempo total: 3</td>
  </tr>
  <tr>
    <td>https://refactoring.guru/<br>https://github.com/<br>https://stackoverflow.com/<br>[Linha vazia]</td>
    <td>Iniciando downloads...<br>Arq1: 25<br>Arq2: 19<br>Arq3: 26<br>Tempo total: 3</td>
  </tr>
</table>

## Nota 🫧
A simulação de download é uma forma simplificada de entender como tarefas paralelas podem ser disparadas e como os resultados podem ser coletados de volta na ordem desejada.


<h1>
    <img width="45" src="https://img.icons8.com/pulsar-line/48/upside-down-icon.png" alt="upside-down-icon"/>
    <span> Parallel-Asynchronous-Processing (ENG) </span>
</h1>

In the world of programming, we often encounter situations where multiple tasks need to be executed simultaneously to optimize response time or processing. A common example is downloading multiple files from the internet.

For this challenge, suppose you have a list of URLs that you want to "download." Your goal is to simulate the parallel download of these files and print the size of each URL after its "download" has been initiated. To simplify, each URL takes exactly 1 second to be "downloaded."

## Objective 🫧
```Repository developed for didactic purposes; the challenge is to create Parallel Download Timing.```

## Requirements 🫧

> 1. Define a list of URLs that you want to "download."
>
> 2. Create a function to simulate the "download" of a URL. This function should take a URL as input and return the size of the URL.
>
> 3. Implement logic that allows starting the "download" of multiple URLs in parallel.
>
> 4. Print the size of each URL in the order they were added.

### Input
The input consists of a list of URLs, one per line. An empty line indicates the end of the list.

### Output
The output should show the size of each URL in the order they were added, followed by the "Total Time," which is simply the count of URLs.

## Examples 🫧
The table below presents examples with some input data and their respective expected outputs. Be sure to test your program with these examples and with other possible cases.

<table>
  <tr>
    <th>INPUT</th>
    <th>OUTPUT</th>
  </tr>
  <tr>
    <td>https://chat.openai.com/<br>https://www.invertexto.com/<br>https://web.dio.me/<br>[Empty Line]</td>
    <td>Initiating downloads...<br>File1: 24<br>File2: 27<br>File3: 19<br>Total Time: 3</td>
  </tr>
  <tr>
    <td>https://www.netflix.com/<br>https://www.hbomax.com/<br>https://www.amazon.com.br/<br>[Empty Line]</td>
     <td>Initiating downloads...<br>File1: 24<br>File2: 23<br>File3: 26<br>Total Time: 3</td>
  </tr>
  <tr>
    <td>https://refactoring.guru/<br>https://github.com/<br>https://stackoverflow.com/<br>[Empty Line]</td>
    <td>Initiating downloads...<br>File1: 25<br>File2: 19<br>File3: 26<br>Total Time: 3</td>
  </tr>
</table>

## Note 🫧
The download simulation is a simplified way to understand how parallel tasks can be initiated and how results can be collected back in the desired order.

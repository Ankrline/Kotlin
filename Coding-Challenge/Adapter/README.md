<h1>
    <a href="https://www.dio.me/">
        <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png">
    </a>
    <span> Adapter (PT/BR) </span>
</h1>
O padrão de projeto Adapter é um padrão de projeto estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele atua como um intermediário, adaptando a interface de uma classe para outra interface esperada pelo cliente.

Neste desafio, você deverá implementar um conversor de moedas que permitirá que valores monetários sejam convertidos de dólares americanos (USD) para euros (EUR). Embora exista uma taxa de conversão direta de 1 USD = 0.85 EUR, o nosso sistema inicialmente só suportava a conversão de USD para libras esterlinas (GBP). Utilizando o padrão Adapter, você deve adaptar esse sistema antigo para fornecer a nova funcionalidade de conversão direta para EUR, usando a conversão intermediária para GBP.

## Objetivo 🎯
```Repositório desenvolvido para fins didáticos, o desafio é implementar um Adaptador para Conversão de Moedas```

### Entrada
>Um valor em dólares americanos USD (Double).

### Saída
O valor convertido para euros EUR (Double) usando o adaptador.
>Taxa de conversão direta (para referência):
>
>1 USD = 0.85 EUR

Taxas de conversão para a adaptação:
>1 USD para GBP = 0.80
>
>1 GBP para EUR = 1.0625

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
<table>
  <tr>
    <th>ENTRADA</th>
    <th>SAÍDA</th>
  </tr>
   <tr>
    <td>200</td>
    <td>USD: 200.0<br>EUR: 170.0</td>
  </tr>
   <tr>
    <td>150</td>
    <td>USD: 150.0<br>EUR: 127.5</td>
  </tr>
   <tr>
    <td>1000.0</td>
    <td>USD: 1000.0<br>EUR: 850.0</td>
  </tr>
</table>

## Nota:
O padrão Adapter é uma ferramenta valiosa para lidar com incompatibilidades de interface e integrar componentes heterogêneos. No entanto, é importante avaliar cuidadosamente sua utilização para garantir que os benefícios superem os possíveis custos em termos de complexidade e desempenho.

<h1>
    <a href="https://www.dio.me/">
        <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png">
    </a>
    <span> Adapter (EN) </span>
</h1>

The Adapter design pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as an intermediary, adapting the interface of one class to another interface expected by the client.

In this challenge, you should implement a currency converter that allows monetary values to be converted from US dollars (USD) to euros (EUR). Although there is a direct conversion rate of 1 USD = 0.85 EUR, our system initially only supported the conversion of USD to British pounds (GBP). Using the Adapter pattern, you must adapt this old system to provide the new functionality of direct conversion to EUR, using the intermediate conversion to GBP.

## Objective 🎯
```Repository developed for didactic purposes; the challenge is to implement an Adapter for Currency Conversion.```

### Input
>A value in US dollars USD (Double).

### Output
The value converted to euros EUR (Double) using the adapter.
>Direct conversion rate (for reference):
>
>1 USD = 0.85 EUR

Conversion rates for adaptation:
>1 USD to GBP = 0.80
>
>1 GBP to EUR = 1.0625

## Examples
The table below presents examples with some input data and their respective expected outputs. Be sure to test your program with these examples and with other possible cases.
<table>
  <tr>
    <th>INPUT</th>
    <th>OUTPUT</th>
  </tr>
   <tr>
    <td>200</td>
    <td>USD: 200.0<br>EUR: 170.0</td>
  </tr>
   <tr>
    <td>150</td>
    <td>USD: 150.0<br>EUR: 127.5</td>
  </tr>
   <tr>
    <td>1000.0</td>
    <td>USD: 1000.0<br>EUR: 850.0</td>
  </tr>
</table>

## Note:
The Adapter pattern is a valuable tool for dealing with interface incompatibilities and integrating heterogeneous components. However, it is important to carefully evaluate its use to ensure that the benefits outweigh possible costs in terms of complexity and performance.

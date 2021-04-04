<h1 align="center">API REST TINNOVA 1</h1>
<div align="center">
  <strong>processo seletivo</strong>
</div>

### Como executar

Tudo que será necessário para executar o projeto será java 8 instalado na maquina. Para executar basta baixar o JAR que está junto com o projeto (na pasta executavel) ou realizar o build do mesmo com mvn clean install.

para executar basta utilizar o seguinte comando:

```
java -jar tinnova-test-cars-0.0.1-SNAPSHOT.jar
```

O teste poderá ser realizado diretamente pelo swagger através do endereço: http://localhost:8080//tinnova/swagger-ui.html# ou via curl como nos exemplos abaixo:

##Bubble Sort:

Requisição:
```
curl -X GET "http://localhost:8080/tinnova/api/v1/bubbleSort/solve?values=5&values=3&values=2&values=4&values=6&values=1&values=0&values=6" -H "accept: application/json"
```
Retorno esperado:
```
{
  "OrderedVector": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    6
  ]
}
```

##Fatorial:

Requisição:
```
curl -X GET "http://localhost:8080/tinnova/api/v1/factorial/solve?value=10" -H "accept: application/json"
```

Retorno esperado:
```
{
  "Factorial": 3628800
}
```

##Soma de multiplos:

Requisição:
```
curl -X GET "http://localhost:8080/tinnova/api/v1/division/solve?value=10" -H "accept: application/json"
```
Retorno esperado:
```
{
  "DivisionResult": 23
}
```

##Eleição:

Requisição
```
curl -X GET "http://localhost:8080/tinnova/api/v1/voting/solve?blankVotes=10&nullVotes=10&totalVotes=500&validVotes=480" -H "accept: application/json"
```
Retorno esperado:
```
{
  "valid_votes_percent": 96,
  "blank_votes_percent": 2,
  "null_votes_percent": 2
}
```





# TexoIT-API

### Descrição

API Rest com Spring Boot, utilizando `OpenCSV`, `Lombok`, `H2` e `JUnit`. Ao inicializar a aplicação é feito uma cópia de dados de um arquivo CSV, que serão salvos na base de dados H2. 

Existe apenas um endpoint que retorna um objeto com um lista dos dois produtores com menor intervalo entre duas vitórias consecutivas e outra com os dois produtores com maior intervalo.

Endpoint: `GET` `http://localhost:8080/api/produtores`.

Exemplo de retorno:
`{
"min": [
{
"producer": "teste1",
"interval": 1,
"previousWin": 2001,
"followingWin": 2002
},
{
"producer": "teste2",
"interval": 2,
"previousWin": 2001,
"followingWin": 2003
}
],
"max": [
{
"producer": "teste3",
"interval": 10,
"previousWin": 2001,
"followingWin": 2011
},
{
"producer": "teste4",
"interval": 20,
"previousWin": 2001,
"followingWin": 2021
}
]
}`

Existe o teste de integração para os Filmes que pode ser executado com o comando `mvn test` no terminal.

### Requisitos
`Maven` `Java 8`

### Instalação das dependências
Após clonar o projeto executar o comando `mvn clean install` no terminal.

### Testes
Para rodar os testes basta executar o comando `mvn test` no terminal.

### Pendências
Faltam as querys que retornarão os dados devidamente filtrados dos repositories.
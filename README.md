# 🎬 Screenmatch - Ranking de Séries

Projeto em **Java 21 + Spring Boot** que consome a API **OMDb** para exibir informações de séries de TV de forma prática e estruturada.

## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Jackson (para parsing de JSON)
- Maven (ou Gradle)
- Git/GitHub

## 🛠 Funcionalidades
- Consumir dados de séries da API OMDb.
- Mapear JSON para objetos Java usando `record` e Jackson.
- Exibir informações como título, número de temporadas e avaliação no IMDB.

## 💡 Estrutura do Projeto
- `ScreenmatchApplication` → classe principal que inicia a aplicação.
- `ConsumoAPI` → realiza requisições HTTP.
- `ConverteDados` → converte JSON em objetos Java.
- `DadosSerie` → model que representa os dados da série.

## 📝 Exemplo de Uso
```java
var consumoAPI = new ConsumoAPI();
var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=YOUR_API_KEY");

ConverteDados conversor = new ConverteDados();
DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
System.out.println(dados);

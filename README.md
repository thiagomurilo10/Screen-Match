# 🎬 Screenmatch - Ranking de Séries

Projeto em **Java 21 + Spring Boot** que consome a API **OMDb** para exibir informações de séries de TV de forma prática e estruturada.

## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Jackson (para parsing de JSON)
- Maven
- Git / GitHub

## 🛠 Funcionalidades
- Buscar informações de séries pela API OMDb.
- Exibir título, número de temporadas e avaliação no OMDB.
- Buscar todas as temporadas e episódios de uma série.
- Filtrar episódios sem avaliação ("N/A") para exibir apenas dados relevantes.


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

package br.com.apolo.screenmatch;

import br.com.apolo.screenmatch.model.DadosSerie;
import br.com.apolo.screenmatch.service.ConsumoAPI;
import br.com.apolo.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();

        // lembrar de adicionar a chave API
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=api_key");

        System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}

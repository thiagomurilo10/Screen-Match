package br.com.apolo.screenmatch.repository;

import br.com.apolo.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}

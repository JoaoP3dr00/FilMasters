package com.gcs.FilMasters.application;


import com.gcs.FilMasters.application.persistence.GenreRepository;
import com.gcs.FilMasters.domain.Genre;
import com.gcs.FilMasters.domain.Movie;
import org.springframework.stereotype.Service;

@Service
public class CreateGenreUseCase {
    private final GenreRepository genreRepository;

    public CreateGenreUseCase(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    public Genre createMovie(String id, String nome, String descricao) {
        Genre genre = new Genre("1", "Ação", "Filmes com muita ação");

        return genreRepository.save(genre);
    }
}

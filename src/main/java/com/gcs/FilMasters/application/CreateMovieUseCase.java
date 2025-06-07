package com.gcs.FilMasters.application;

import com.gcs.FilMasters.domain.Genre;
import org.springframework.stereotype.Service;

import com.gcs.FilMasters.application.persistence.MovieRepository;
import com.gcs.FilMasters.domain.Movie;

@Service
public class CreateMovieUseCase {

    private final MovieRepository movieRepository;

    public CreateMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(String id, String nome, String descricao, int duracaoMinutos, String anoLancamento) {
        Genre genre = new Genre("1", "Ação", "Filmes com muita ação");

        Movie movie = new Movie(id, nome, descricao, duracaoMinutos, genre, anoLancamento);
        return movieRepository.save(movie);
    }
}

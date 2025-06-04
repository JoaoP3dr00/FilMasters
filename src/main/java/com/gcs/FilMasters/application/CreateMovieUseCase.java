package com.gcs.FilMasters.application;

import org.springframework.stereotype.Service;

import com.gcs.FilMasters.application.persistence.MovieRepository;
import com.gcs.FilMasters.domain.Movie;

@Service
public class CreateMovieUseCase {

    private final MovieRepository movieRepository;

    public CreateMovieUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie createMovie(String id, String nome, String descricao, int duracaoMinutos) {
        Movie movie = new Movie(id, nome, descricao, duracaoMinutos);
        return movieRepository.save(movie);
    }
}

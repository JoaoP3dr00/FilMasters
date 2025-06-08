package com.gcs.FilMasters.application;


import com.gcs.FilMasters.application.persistence.GenreRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateGenreUseCase {
    private final GenreRepository genreRepository;

    public CreateGenreUseCase(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }
}

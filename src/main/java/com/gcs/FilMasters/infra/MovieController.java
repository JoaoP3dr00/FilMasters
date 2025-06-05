package com.gcs.FilMasters.infra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gcs.FilMasters.domain.Movie;
import com.gcs.FilMasters.application.CreateMovieUseCase;;;




    @RestController
    @RequestMapping("/movies")
    public class MovieController {

        private final CreateMovieUseCase createMovieUseCase;

        @Autowired
        public MovieController(CreateMovieUseCase createMovieUseCase) {
            this.createMovieUseCase = createMovieUseCase;
        }

        @PostMapping
        public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
            Movie createdMovie = createMovieUseCase.createMovie(movie.getId(), movie.getNome(), movie.getDescricao(), movie.getDuracaoMinutos());
            return ResponseEntity.ok(createdMovie);
        }
    }

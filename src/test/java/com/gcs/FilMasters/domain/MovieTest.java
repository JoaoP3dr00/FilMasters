package com.gcs.FilMasters.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void instantiateNewMovieTest(){
        // Arrange
        final String id = "1";
        final String nome = "Godzilla";
        final String descricao = "Monstro japones.";
        final int duracaoMinutos = 120;

        // Act
        Movie movie = new Movie(id, nome, descricao, duracaoMinutos);

        // Assert
        Assertions.assertNotNull(movie);
        Assertions.assertNotNull(movie.getId());
        Assertions.assertNotNull(movie.getNome());
        Assertions.assertNotNull(movie.getDescricao());
        Assertions.assertEquals(id, movie.getId());
        Assertions.assertEquals(nome, movie.getNome());
        Assertions.assertEquals(descricao, movie.getDescricao());
        Assertions.assertEquals(duracaoMinutos, movie.getDuracaoMinutos());
    }
}

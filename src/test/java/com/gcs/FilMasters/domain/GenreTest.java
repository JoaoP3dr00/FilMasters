package com.gcs.FilMasters.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenreTest {

    @Test
    public void testConstructorAndGetters() {
        Genre genre = new Genre("1", "Ação", "Filmes com muita ação");

        assertEquals("1", genre.getId());
        assertEquals("Ação", genre.getNome());
        assertEquals("Filmes com muita ação", genre.getDescricao());
    }

    @Test
    public void testSetters() {
        Genre genre = new Genre();
        genre.setId("2");
        genre.setNome("Comédia");
        genre.setDescricao("Filmes para rir");

        assertEquals("2", genre.getId());
        assertEquals("Comédia", genre.getNome());
        assertEquals("Filmes para rir", genre.getDescricao());
    }
}

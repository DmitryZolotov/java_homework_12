package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldAddNoFilm() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilm() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

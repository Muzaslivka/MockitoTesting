package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AfishaManagerTest {

    AfishaManager afisha = new AfishaManager();

    @BeforeEach
    public void setup() {
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");
        afisha.addMovie("movie4");
        afisha.addMovie("movie5");
        afisha.addMovie("movie6");
        afisha.addMovie("movie7");
        afisha.addMovie("movie8");
        afisha.addMovie("movie9");
        afisha.addMovie("movie10");
        afisha.addMovie("movie11");
    }


    @Test
    public void shouldAddMovie() {

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10", "movie11"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLast10Reverse() {


        String[] expected = {"movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast5Reverse() {

        AfishaManager afisha = new AfishaManager();
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");
        afisha.addMovie("movie4");
        afisha.addMovie("movie5");


        String[] expected = {"movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast2Reverse() {
        AfishaManager afisha = new AfishaManager();
        afisha.addMovie("movie11");
        afisha.addMovie("movie12");

        String[] expected = {"movie12", "movie11"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast11Reverse() {
        AfishaManager afisha = new AfishaManager(11);
        afisha.addMovie("movie1");
        afisha.addMovie("movie2");
        afisha.addMovie("movie3");
        afisha.addMovie("movie4");
        afisha.addMovie("movie5");
        afisha.addMovie("movie6");
        afisha.addMovie("movie7");
        afisha.addMovie("movie8");
        afisha.addMovie("movie9");
        afisha.addMovie("movie10");
        afisha.addMovie("movie11");

        String[] expected = {"movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

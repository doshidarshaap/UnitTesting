package com.Sparta.dd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Given the age of viewer under 12,return film classification")
    void givenTheAgeOfViewerUnder12ReturnFilmClassification() {
        int age = 10;
        String expected = "U & PG films are available.";
        String answer = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the age of Viewer under 15,return film classification")
    void givenTheAgeOfViewerUnder15ReturnFilmClassification() {
        int age = 13;
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given the age of Viewer over 18,return film classification")
    void givenTheAgeOfViewerOver18ReturnFilmClassification() {
        int age = 22;
        String expected = "All films are available.";
        String answer = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expected, answer);
    }
}

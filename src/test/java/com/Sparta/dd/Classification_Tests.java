package com.Sparta.dd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Given the age of Viewer,return film classification")
    void givenTheAgeOfViewerReturnFilmClassification() {
        int age = 13;
        String expected = "U, PG & 12 films are available.";
        String answer = FilmClassifications.availableClassifications(age);
        Assertions.assertEquals(expected, answer);
        System.out.println(answer);
    }
}

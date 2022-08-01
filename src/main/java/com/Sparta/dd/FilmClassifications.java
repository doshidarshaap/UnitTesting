package com.Sparta.dd;

public class FilmClassifications {
    public static String availableClassifications(int ageOfViewer){
        String result;
        if(ageOfViewer > 4){
            if (ageOfViewer < 15) {
                result = "U, PG & 12 films are available.";
            } else if (ageOfViewer < 18) {
                result = "U, PG, 12 & 15 films are available.";
            } else {
                result = "All films are available.";
            }
            System.out.println(result);
            return result;
        } else{
            System.out.println("The age of the Viewer is not appropriate for film");
            return result="The age of the Viewer is not appropriate for film";
        }
    }
}

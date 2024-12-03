/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

import java.util.*;

public class GenreRecommendation extends Recommendation {

    private Map<String, List<String>> genreToFilms; // Pemetaan genre ke daftar film

    public GenreRecommendation(List<String> films, Map<String, List<String>> genreToFilms) {
        super(films);
        this.genreToFilms = genreToFilms;
    }

    public Map<String, List<String>> getGenreToFilms() {
        return genreToFilms;
    }

    public void setGenreToFilms(Map<String, List<String>> genreToFilms) {
        this.genreToFilms = genreToFilms;
    }

    @Override
    public void showRecommendations(String genre) {
        System.out.println("Rekomendasi Film untuk Genre " + genre + ":");
        if (genreToFilms.containsKey(genre)) {
            for (String film : genreToFilms.get(genre)) {
                System.out.println("- " + film);
            }
        } else {
            System.out.println("Tidak ada rekomendasi untuk genre ini.");
        }
    }
}

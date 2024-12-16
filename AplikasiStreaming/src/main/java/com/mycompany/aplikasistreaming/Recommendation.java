/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

import java.util.*;

public abstract class Recommendation {
    private List<String> films; // Menyimpan daftar film

    public Recommendation(List<String> films) {
        this.films = films;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    // Metode untuk menampilkan semua film
    public void showAllRecommendedFilms() {
        System.out.println("Rekomendasi Film yang Tersedia:");
        for (String film : films) {
            System.out.println("- " + film);
        }
    }

    // Abstrak untuk rekomendasi film berdasarkan genre
    public abstract void showRecommendations(String genre);
}
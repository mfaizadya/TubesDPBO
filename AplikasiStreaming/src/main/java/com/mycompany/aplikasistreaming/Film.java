/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
public abstract class Film {
    private String filmID;
    private String title;
    private String genre;
    private int releaseYear;
    private int duration;
    private double rating;
    private String posterURL;

    public Film(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL) {
        this.filmID = filmID;
        this.title = title; // Perbaikan penamaan
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
        this.posterURL = posterURL;
    }

    public String search(String keyword) {
        if (title.toLowerCase().contains(keyword.toLowerCase()) || genre.toLowerCase().contains(keyword.toLowerCase())) {
            return "Film Ditemukan : " + title;
        }
        return "Film tidak ditemukan";
    }

    // Abstract method
    public abstract void watch();

    public String getTitle() {
        return title;
    }
}
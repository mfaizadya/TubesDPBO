/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
public class Movie extends Film {
    private boolean isBoxOffice;

    public Movie(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, boolean isBoxOffice) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.isBoxOffice = isBoxOffice;
    }

    // Overridden method
    @Override
    public void watch() {
        System.out.println("Menonton Film: " + getTitle());
    }

    // Overloaded method
    public void watch(String title, boolean isHD, String language) {
        String quality = isHD ? "in HD" : "in SD";
        System.out.println("Menonton Film " + title + " " + quality + " dengan audio dalam bahasa " + language);
    }
}

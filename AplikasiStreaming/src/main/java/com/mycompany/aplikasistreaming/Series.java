/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
public class Series extends Film {
    private int numOfSeason;
    private int episodes;

    public Series(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, int numOfSeason, int episodes) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.numOfSeason = numOfSeason;
        this.episodes = episodes;
    }

    // Overridden method
    @Override
    public void watch() {
        System.out.println("Menonton Series: " + getTitle());
    }

    // Overloaded method
    public void watch(String title, int season, int episode) {
        System.out.println("Menonton Series " + title + " Season " + season + ", Episode " + episode);
    }
}

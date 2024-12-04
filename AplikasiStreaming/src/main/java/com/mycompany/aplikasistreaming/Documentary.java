/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
public class Documentary extends Film {
    private String subject;
    private String narrator;

    public Documentary(String filmID, String title, String genre, int releaseYear, int duration, double rating, String posterURL, String subject, String narrator) {
        super(filmID, title, genre, releaseYear, duration, rating, posterURL);
        this.subject = subject;
        this.narrator = narrator;
    }

    // Overridden method
    @Override
    public void watch() {
        System.out.println("Menonton Documentary: " + getTitle());
    }

    // Overloaded method
    public void watch(String title, String subject) {
        System.out.println("Menonton Documentary " + title + " tentang " + subject + " dengan narator " + narrator);
    }
}

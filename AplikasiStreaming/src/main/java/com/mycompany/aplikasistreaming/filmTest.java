/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
public class filmTest {
    public static void main(String[] args) {
        Series series = new Series("S001", "The Mandalorian", "Sci-Fi", 2019, 50, 8.5, "url_here", 3, 24);
        Documentary documentary = new Documentary("D001", "Planet Earth", "Nature", 2006, 90, 9.4, "url_here", "Wildlife", "David Attenborough");
        Movie movie = new Movie("M001", "Avengers: Endgame", "Action", 2019, 181, 8.4, "url_here", true);

        // Simulasi menonton film yang ada
        series.watch("The Mandalorian", 1, 1);
        documentary.watch("Planet Earth", "Wildlife");
        movie.watch("Avengers: Endgame", true, "English");

        // Simulasi menonton film yang tidak ada
        series.watch("", 1, 1);  // Exception: Film tidak ditemukan!
        documentary.watch("", "");  // Exception: Film atau subjek tidak valid!
        movie.watch("", true, "English");  // Exception: Film tidak ditemukan!
    }
}

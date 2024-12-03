/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasistreaming;

/**
 *
 * @author Faiz
 */
public class AplikasiStreaming {

    public static void main(String[] args) {
        
        // main Recommendation
        List<String> allFilms = Arrays.asList("Bullet Train", "Rush Hour", "Scream", "Friday The 13th");// daftar film

        // pemetaan genre ke film
        Map<String, List<String>> genreToFilms = new HashMap<>();
        genreToFilms.put("Action", Arrays.asList("Bullet Train", "Rush Hour"));
        genreToFilms.put("Horror", Arrays.asList("Scream", "Friday The 13th"));
        genreToFilms.put("Comedy", Arrays.asList("Bullet Train", "Rush Hour"));

        // membuat objek GenreRecommendation
        GenreRecommendation recommendation = new GenreRecommendation(allFilms, genreToFilms);

        // menampilkan semua film
        recommendation.showAllRecommendedFilms();

        // menampilkan rekomendasi berdasarkan genre
        recommendation.showRecommendations("Action");
        recommendation.showRecommendations("Horror");
        recommendation.showRecommendations("Comedy");
        recommendation.showRecommendations("Drama");
        
        // main CastToDevice
        CastToDevice castToDevice = new CastToDevice("TV");

        castToDevice.checkCastingStatus(); // cek status awal
        castToDevice.startCasting();       // memulai casting
        castToDevice.checkCastingStatus(); // cek status saat casting
        castToDevice.startCasting();       // coba mulai casting lagi
        castToDevice.stopCasting();        // hentikan casting
        castToDevice.checkCastingStatus(); // cek status setelah berhenti
        
    }
}

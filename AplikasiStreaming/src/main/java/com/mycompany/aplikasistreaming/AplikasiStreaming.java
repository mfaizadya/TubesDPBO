/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasistreaming;

import java.util.*;
/**
 *
 * @author Faiz
 */
public class AplikasiStreaming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        while (true) {
            System.out.println("===== APLIKASI STREAMING FILM =====");
            System.out.println("Selamat Datang!");
            System.out.println("Pilih menu berikut:");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Exit");
            System.out.println("===================================");
            System.out.print("Pilihan: ");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    try {
                        System.out.print("Masukkan email    : ");
                        String email = scanner.nextLine();
                        System.out.print("Masukkan username : ");
                        String username = scanner.nextLine();
                        System.out.print("Masukkan password : ");
                        String password = scanner.nextLine();

                        userManager.registerUser(email, username, password);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "2":
                    System.out.print("Masukkan email/username : ");
                    String identifier = scanner.nextLine();
                    System.out.print("Masukkan password       : ");
                    String password = scanner.nextLine();

                    userManager.loginUser(identifier, password);
                    break;

                case "3":
                    System.out.println("@ Terima kasih telah menggunakan aplikasi!");
                    scanner.close();
                    return;

                default:
                    System.out.println("[Error]: Silahkan masukkan nomor menu yang benar!");
                    break;
            }
        }

        // main Recommendation
        List<String> recFilms = Arrays.asList("Bullet Train", "Rush Hour", "Scream", "Friday The 13th");// daftar film

        // pemetaan genre ke film
        Map<String, List<String>> genreToFilms = new HashMap<>();
        genreToFilms.put("Action", Arrays.asList("Bullet Train", "Rush Hour"));
        genreToFilms.put("Horror", Arrays.asList("Scream", "Friday The 13th"));
        genreToFilms.put("Comedy", Arrays.asList("Bullet Train", "Rush Hour"));

        // membuat objek GenreRecommendation
        GenreRecommendation recommendation = new GenreRecommendation(recFilms, genreToFilms);

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

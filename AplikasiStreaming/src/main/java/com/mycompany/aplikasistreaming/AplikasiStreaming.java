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
        // Daftar film
        ArrayList<String> recFilms = new ArrayList<>();
        recFilms.add("Bullet Train");
        recFilms.add("Rush Hour");
        recFilms.add("Scream");
        recFilms.add("Friday The 13th");

        // Pemetaan genre ke film
        ArrayList<String> actionFilms = new ArrayList<>();
        actionFilms.add("Bullet Train");
        actionFilms.add("Rush Hour");
        ArrayList<String> horrorFilms = new ArrayList<>();
        horrorFilms.add("Scream");
        horrorFilms.add("Friday The 13th");
        ArrayList<String> comedyFilms = new ArrayList<>();
        comedyFilms.add("Bullet Train");
        comedyFilms.add("Rush Hour");
        
        HashMap<String, ArrayList<String>> genreToFilms = new HashMap<>();
        genreToFilms.put("Action", actionFilms);
        genreToFilms.put("Horror", horrorFilms);
        genreToFilms.put("Comedy", comedyFilms);

        // Membuat objek GenreRecommendation
        GenreRecommendation recommendation = new GenreRecommendation(recFilms, genreToFilms);

        // Menampilkan semua film
        recommendation.showAllRecommendedFilms();

        // Menampilkan rekomendasi berdasarkan genre
        recommendation.showRecommendations("Action");
        recommendation.showRecommendations("Horror");
        recommendation.showRecommendations("Comedy");
        recommendation.showRecommendations("Drama"); // Contoh untuk test case genre yang tidak ada
        
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

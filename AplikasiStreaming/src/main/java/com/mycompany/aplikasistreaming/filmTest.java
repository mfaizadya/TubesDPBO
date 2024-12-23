/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.film;

/**
 *
 * @author fikri
 */
import java.util.ArrayList;
import java.util.Scanner;

public class filmTest {
    public static void main(String[] args) {
        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(new Series("S001", "The Mandalorian", "Sci-Fi", 2019, 50, 8.5, "url_here", 3, 24));
        filmList.add(new Documentary("D001", "Planet Earth", "Nature", 2006, 90, 9.4, "url_here", "Wildlife", "David Attenborough"));
        filmList.add(new Movie("M001", "Avengers: Endgame", "Action", 2019, 181, 8.4, "url_here", true));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU FILM ===");
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Cari Film Berdasarkan Kata Kunci");
            System.out.println("3. Tonton Film");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Lihat daftar film
                    System.out.println("\nDaftar Film:");
                    for (Film film : filmList) {
                        System.out.println(film.getTitle() + " (" + film.getClass().getSimpleName() + ")");
                    }
                    break;

                case 2: // Cari film berdasarkan kata kunci
                    System.out.print("\nMasukkan kata kunci: ");
                    String keyword = scanner.nextLine();
                    boolean found = false;
                    for (Film film : filmList) {
                        String result = film.search(keyword);
                        if (!result.equals("Film tidak ditemukan")) {
                            System.out.println(result);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tidak ada film yang cocok dengan kata kunci.");
                    }
                    break;

                case 3: // Tonton film
                    System.out.print("\nMasukkan judul film yang ingin ditonton: ");
                    String title = scanner.nextLine();
                    boolean watched = false;
                    for (Film film : filmList) {
                        if (film.getTitle().equalsIgnoreCase(title)) {
                            film.watch();
                            watched = true;
                            break;
                        }
                    }
                    if (!watched) {
                        System.out.println("Film tidak ditemukan dalam daftar.");
                    }
                    break;

                case 4: // Keluar
                    running = false;
                    System.out.println("\nTerima kasih telah menggunakan aplikasi ini!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}

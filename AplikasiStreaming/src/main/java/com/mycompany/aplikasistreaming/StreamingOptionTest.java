/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.maven.streamingoption;

/**
 *
 * @author fathi
 */
import java.util.*;
public class StreamingOptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StreamingOption streamingOption = new StreamingOption();
        boolean running = true;

        while (running) {
            System.out.println("");
            System.out.println("Opsi Streaming");
            System.out.println("1. Ubah Kualitas " + "(Resolusi saat ini: " + streamingOption.getQuality() + ")");
            System.out.println("2. Ubah Audio " +  "(Format saat ini: " +  streamingOption.getAudio() + ")");
            System.out.println("3. Ubah Subtitle " +  "(Bahasa saat ini: " + streamingOption.getSubtitle() + ")");
            System.out.println("4. Keluar");
            System.out.println(" ");
            System.out.println("Masukkan angka: ");
            int pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Resolusi yang tersedia:");
                    List<String> resolution = Quality.getResolution();
                    for (int i = 0; i < resolution.size(); i++) {
                        System.out.println((i + 1) + ". " + resolution.get(i));
                    }
                    System.out.print("Pilih resolusi: ");
                    int pilihResolusi = scanner.nextInt();
                    String resolusiDipilih = Quality.applyResolution(pilihResolusi);
                    streamingOption.chooseQuality(resolusiDipilih);
                    break;

                case 2:
                    System.out.println("Available Audio Formats:");
                    List<String> audioFormat = Audio.getAudioFormat();
                    for (int i = 0; i < audioFormat.size(); i++) {
                        System.out.println((i + 1) + ". " + audioFormat.get(i));
                    }
                    System.out.print("Select audio format: ");
                    int pilihAudio = scanner.nextInt();
                    String audioDipilih = Audio.applyAudioFormat(pilihAudio);
                    streamingOption.chooseAudio(audioDipilih);
                    break;

                case 3:
                    System.out.println("Available Subtitle Languages:");
                    List<String> subtitle = Subtitle.getSubtitleLanguage();
                    for (int i = 0; i < subtitle.size(); i++) {
                        System.out.println((i + 1) + ". " + subtitle.get(i));
                    }
                    System.out.print("Select subtitle language: ");
                    int pilihSubtitle = scanner.nextInt();
                    String subtitleDipilih = Subtitle.applySubtitle(pilihSubtitle);
                    streamingOption.chooseSubtitle(subtitleDipilih);
                    break;

                case 4:
                    running = false;
                    System.out.println("Anda telah keluar");
                    break;

                default:
                    System.out.println("Invalid.");
            }
        }
        scanner.close();
    }
}

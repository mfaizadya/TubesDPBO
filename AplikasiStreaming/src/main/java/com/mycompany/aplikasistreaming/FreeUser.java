/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;
import java.util.ArrayList;

/**
 *
 * @author Faiz
 */
public class FreeUser extends User {
    private boolean adsEnabled;
    private int downloadLimit;

    // Constructor
    public FreeUser(String userID, String username, String password, String email, boolean adsEnabled, int downloadLimit) {
        super(userID, username, password, email);
        this.adsEnabled = adsEnabled;
        this.downloadLimit = downloadLimit;
    }

    // Getters and Setters
    public boolean isAdsEnabled() {
        return adsEnabled;
    }

    public void setAdsEnabled(boolean adsEnabled) {
        this.adsEnabled = adsEnabled;
    }

    public int getDownloadLimit() {
        return downloadLimit;
    }

    public void setDownloadLimit(int downloadLimit) {
        this.downloadLimit = downloadLimit;
    }
    
    public void viewAds(ArrayList<String> title) {
        if (adsEnabled) {
            System.out.println(getUsername() + " sedang menonton iklan: " + title);
        } else {
            System.out.println("Untuk user " + getUsername() + " telah di-nonaktifkan iklannya.");
        }
    }

    // Browse Catalog (Only free content)
    @Override
    public void browseCatalog(ArrayList<String> catalog) {
        System.out.println(getUsername() + "sedang mencari katalog di fitur gratis berikut: ");
        for (String content : catalog) {
            System.out.println("- " + content);
        }
    }
}

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
public class SubscribedUser extends User {
    private ArrayList<String> subscribedBenefits;
    private ArrayList<String> accesssubscribedContent;

    public SubscribedUser(String userID, String username, String password, String email, ArrayList<String> subscribedBenefits) {
        super(userID, username, password, email);
        this.subscribedBenefits = new ArrayList<>();
        
    }

    public ArrayList<String> getSubscribedBenefits() {
        return subscribedBenefits;
    }

    public void setSubscribedBenefits(ArrayList<String> subscribedBenefits) {
        this.subscribedBenefits = subscribedBenefits;
    }
    
    public ArrayList<String> getAccessSubscribedContent() {
        return accesssubscribedContent;
    }
    
    public void accessSubscribedContent(ArrayList<String> subscribedContent) {
        System.out.println(getUsername() + " sedang mengakses konten berlangganan berikut: ");
        if (subscribedContent.isEmpty()) {
            System.out.println("Tidak ada content premium yang tersedia");
        }else {
            for (String content : subscribedContent) {
                System.out.println("- " + content);
            }
        }
    }

    @Override
    public void browseCatalog(ArrayList<String> catalog) {
        System.out.println(getUsername() + " sedang mencari katalog di fitur berlangganan berikut: ");
        for (String content : catalog) {
            System.out.println(content);
        }
        System.out.println("Benefits yang tersedia: " + subscribedBenefits);
    }
}

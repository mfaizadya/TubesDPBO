/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

//MAIN SUBSCRIPTION

public class SubscriptionTest {
    public static void main(String[] args){
        Subscription standard = new StandardSub("Kaleb J ", "Standard", "01-02-2024", "1-03-2024", 99000, "720p", 2);
        standard.choosePlan();
        standard.price();
        ((StandardSub) standard).applyStandardFeatures();

        System.out.println();

        Subscription premium = new PremiumSub("SUB456", "Premium", "2024-01-01", "2024-12-31", 219000, "4K", 5);
        premium.choosePlan();
        premium.price();
        ((PremiumSub) premium).applyPremiumFeatures();
    }
    
}

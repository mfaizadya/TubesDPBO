/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasistreaming;

/**
 *
 * @author legion
 */
public class PremiumSub extends Subscription {
    private String  screenQuality;
    private int MAXdevice;
    
    public PremiumSub(String subscriptionID, String planType, String startDate, String endDate, double price, String screenQuality, int MAXdevice) {
        super(subscriptionID, planType, startDate, endDate, price);
        this.screenQuality = screenQuality;
        this.MAXdevice = MAXdevice;
    }

    @Override
    public void price(){
        System.out.println("HARGA: Rp. " + price);
    }
    
    public void applyPremiumFeatures(){
        System.out.println("Fitur Paket Premium: " );
        System.out.println("- Maksimum Resolusi Video " + screenQuality);
        System.out.println("- Maksimum jumlah device " + MAXdevice);
    }
    
    
}

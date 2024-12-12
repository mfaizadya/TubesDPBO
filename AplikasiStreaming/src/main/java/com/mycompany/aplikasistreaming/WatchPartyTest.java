/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package watchparty;

/**
 *
 * @author asus
 */
public class WatchPartyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WatchParty watchParty = new WatchParty("WP001", "Alice", 10, "2024-12-12 18:00");
        watchParty.createWatchParty();
        watchParty.joinParty("Bob");
        watchParty.endParty();

        
        PrivateWatchParty privateParty = new PrivateWatchParty("PWP001", "Charlie", 5, "2024-12-12 20:00", 3);
        privateParty.createWatchParty();
        privateParty.inviteUsers(2);
        privateParty.lockParty();
        privateParty.endParty();
    }
    
}

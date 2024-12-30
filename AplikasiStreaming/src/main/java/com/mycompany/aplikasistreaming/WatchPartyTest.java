package watchparty;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class WatchPartyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nSelect an option:");
                System.out.println("1. Create a Watch Party");
                System.out.println("2. Create a Private Watch Party");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        // Input data for WatchParty
                        System.out.println("\nEnter Watch Party details:");
                        System.out.print("Party ID: ");
                        String partyID = scanner.nextLine();
                        System.out.print("Host User: ");
                        String hostUser = scanner.nextLine();
                        System.out.print("Number of Participants: ");
                        int participants = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        System.out.print("Start Time: ");
                        String startTime = scanner.nextLine();

                        WatchParty watchParty = new WatchParty(partyID, hostUser, participants, startTime);
                        watchParty.createWatchParty();

                        System.out.print("Enter user to join the party: ");
                        String userJoining = scanner.nextLine();
                        watchParty.joinParty(userJoining);
                        watchParty.endParty();
                        break;

                    case 2:
                        // Input data for PrivateWatchParty
                        System.out.println("\nEnter Private Watch Party details:");
                        System.out.print("Party ID: ");
                        String privatePartyID = scanner.nextLine();
                        System.out.print("Host User: ");
                        String privateHostUser = scanner.nextLine();
                        System.out.print("Number of Participants: ");
                        int privateParticipants = scanner.nextInt();
                        System.out.print("Number of Invited Users: ");
                        int invitedUsers = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        System.out.print("Start Time: ");
                        String privateStartTime = scanner.nextLine();

                        PrivateWatchParty privateParty = new PrivateWatchParty(privatePartyID, privateHostUser, privateParticipants, privateStartTime, invitedUsers);
                        privateParty.createWatchParty();

                        System.out.print("Enter number of users to invite: ");
                        int usersToInvite = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        privateParty.inviteUsers(usersToInvite);
                        privateParty.lockParty();
                        privateParty.endParty();
                        break;

                    case 3:
                        System.out.println("Exiting... Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

import java.util.Scanner;
public class Music{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] songs = {"Song1", "Song2", "Song3"};
        boolean running = true;
        while (running) {
            System.out.println("\n=== Music Playlist Manager ===");
            System.out.println("1. Play all songs");
            System.out.println("2. Play song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nPlaying all songs:");
                    for (int i = 0; i < songs.length; i++) {
                        System.out.println("Playing: " + songs[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter song index (0 to " + (songs.length - 1) + "): ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < songs.length) {
                        System.out.println("Playing: " + songs[index]);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter song name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(search)) {
                            System.out.println("Found! Playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found in playlist.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Music Playlist Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}
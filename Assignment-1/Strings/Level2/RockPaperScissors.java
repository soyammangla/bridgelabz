import java.util.Scanner;

public class RockPaperScissors {
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return "user";
        return "computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int total) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User"; 
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / total) + "%";
        stats[1][0] = "Computer"; 
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / total) + "%";
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Player\tWins\tPercentage");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            else draws++;
            System.out.println("Game " + i + ": User = " + user + ", Computer = " + comp + ", Winner = " + winner);
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        System.out.println("\nFinal Results:");
        displayStats(stats);
        System.out.println("Draws: " + draws);
        sc.close();
    }
}

import java.util.Scanner;

public class RailwayReservationSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] trains = { "Express", "Superfast", "Local" };
    int[] fares = { 500, 800, 300 };
    int[] seats = { 3, 2, 4 };
    int[] waitingList = { 2, 2, 2 };

    System.out.println("Welcome to Railway Reservation System");
    System.out.println("Available Trains:");
    for (int i = 0; i < trains.length; i++) {
      System.out.println((i + 1) + ". " + trains[i] + " - Fare: Rs." + fares[i] + " - Seats: " + seats[i]);
    }

    int trainChoice;
    do {
      System.out.print("Select a train (1-" + trains.length + "): ");
      trainChoice = sc.nextInt();
    } while (trainChoice < 1 || trainChoice > trains.length);

    int selectedTrain = trainChoice - 1;
    int booked = 0, waiting = 0;

    System.out.print("Enter number of booking attempts: ");
    int attempts = sc.nextInt();

    int i = 0;
    do {
      System.out.println("\nBooking Attempt #" + (i + 1));
      System.out.print("Enter passenger name: ");
      String name = sc.next();

      if (seats[selectedTrain] > 0) {
        System.out
            .println("Seat booked for " + name + " on " + trains[selectedTrain] + ". Fare: Rs." + fares[selectedTrain]);
        seats[selectedTrain]--;
        booked++;
      } else if (waitingList[selectedTrain] > 0) {
        System.out.println("No seats available. " + name + " added to waiting list.");
        waitingList[selectedTrain]--;
        waiting++;
      } else {
        System.out.println("No seats or waiting list available for " + trains[selectedTrain] + ". Booking closed.");
        break;
      }

      i++;
    } while (i < attempts && (seats[selectedTrain] > 0 || waitingList[selectedTrain] > 0));

    System.out.println("\nBooking Summary for " + trains[selectedTrain] + ":");
    System.out.println("Seats booked: " + booked);
    System.out.println("Waiting list: " + waiting);
    System.out.println("Thank you for using Railway Reservation System!");
    sc.close();
  }
}
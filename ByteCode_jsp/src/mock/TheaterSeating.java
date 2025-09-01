package mock;
import java.util.Scanner;

public class TheaterSeating {
    private boolean[][] seats; // jagged array (each row has different seats)

    // Constructor - initialize rows with different seat counts
    public TheaterSeating(int[] seatsPerRow) {
        seats = new boolean[seatsPerRow.length][];
        for (int i = 0; i < seatsPerRow.length; i++) {
            seats[i] = new boolean[seatsPerRow[i]]; // all start as false (free)
        }
    }

    // Book a seat
    public boolean bookSeat(int row, int seat) {
        if (isValid(row, seat)) {
            if (!seats[row][seat]) {
                seats[row][seat] = true;
                System.out.println("Seat booked at Row " + row + ", Seat " + seat);
                return true;
            } else {
                System.out.println("Seat already booked!");
            }
        }
        return false;
    }

    // Cancel a booking
    public boolean cancelSeat(int row, int seat) {
        if (isValid(row, seat)) {
            if (seats[row][seat]) {
                seats[row][seat] = false;
                System.out.println("Booking cancelled at Row " + row + ", Seat " + seat);
                return true;
            } else {
                System.out.println("Seat is already free!");
            }
        }
        return false;
    }

    // Display seating arrangement
    public void displaySeats() {
        System.out.println("\nSeating Arrangement:");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print((seats[i][j] ? "[X]" : "[ ]") + " ");
            }
            System.out.println();
        }
    }

    // Check if seat position is valid
    private boolean isValid(int row, int seat) {
        if (row < 0 || row >= seats.length) {
            System.out.println("Invalid row number!");
            return false;
        }
        if (seat < 0 || seat >= seats[row].length) {
            System.out.println("Invalid seat number!");
            return false;
        }
        return true;
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: theater with 3 rows (5 seats, 7 seats, 4 seats)
        int[] rows = {5, 7, 4};
        TheaterSeating theater = new TheaterSeating(rows);

        while (true) {
            System.out.println("\n1. Book Seat  2. Cancel Seat  3. Show Seats  4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row and seat number to book: ");
                    theater.bookSeat(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter row and seat number to cancel: ");
                    theater.cancelSeat(sc.nextInt(), sc.nextInt());
                    break;
                case 3:
                    theater.displaySeats();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

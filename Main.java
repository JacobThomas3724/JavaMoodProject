import java.util.Scanner;

public class MoodTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] moodRatings = new int[7];

        // Input mood ratings for each day
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter your mood rating (1-5) for " + daysOfWeek[i] + ": ");
            int rating = scanner.nextInt();

            // Validate the input
            while (rating < 1 || rating > 5) {
                System.out.println("Invalid rating! Please enter a number between 1 and 5.");
                System.out.print("Enter your mood rating (1-5) for " + daysOfWeek[i] + ": ");
                rating = scanner.nextInt();
            }

            moodRatings[i] = rating;
        }

        // Calculate average mood rating
        int sum = 0;
        for (int rating : moodRatings) {
            sum += rating;
        }
        double averageRating = (double) sum / 7;

        System.out.println("Your average mood rating for the week is: " + averageRating);

        scanner.close();
    }
}

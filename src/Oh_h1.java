
import java.util.Scanner;

// This is the main function
public class Oh_h1 {

    // Getting s main_matrix from MatrixCondition and synchronise it
    public static char[][] matrix;

    public static int level;
    // main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the level
        System.out.print("Choose level: ");
        level = scanner.nextInt(); // Read the level input

        // Run the game with the selected level
        gameRunner(level);
    }

    public static void gameRunner(int level) {

        MatrixCondition.levelDecider(level);

        matrix = MatrixCondition.main_matrix;

        UnclickablePanel.defineUnclickable(matrix);

        PlayGround.playGround(matrix);

        while (true) {
            if (WinningCondition.winningCondition(matrix)) break;
        }


        PlayGround.freezeFrame();

        // Waiting 5000 sec
        try {
            Thread.sleep(5000);  // Sleep for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


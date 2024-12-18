
import java.util.ArrayList;
import java.util.List;

public class UnclickablePanel {
    private static final List<Integer> unclickablePanels = new ArrayList<>();

    // Method to add panels to the unclickable list
    public static void addUnclickable(int panel) {
        unclickablePanels.add(panel);
    }

    // Checking if a panel is clickable
    public static boolean isClickable(int panel) {
        return !unclickablePanels.contains(panel);
    }

    // defining all panels that can not be clicked
    public static void defineUnclickable(char[][] matrix) {
        // Create unclickable panels based on the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // Check if the panel should be unclickable
                if (matrix[i][j] == '0' || matrix[i][j] == '1') {
                    // Add the panel at (i, j) to the unclickable list
                    int panel = i * matrix[i].length + j; // Example of encoding coordinates
                    addUnclickable(panel);
                }
            }
        }
    }
}

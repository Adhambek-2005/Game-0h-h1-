

public class MatrixCondition {

    public static char[][] main_matrix; // the main matrix
    public static boolean gameContinuer = false;

    public static void levelDecider(int level) {
        switch (level) {
            case 4 -> main_matrix = Database.getRandomMatrix4();
            case 6 -> main_matrix = Database.getRandomMatrix6();
            case 8 -> main_matrix = Database.getRandomMatrix8();
            case 10 -> main_matrix = Database.getRandomMatrix10();
            default -> System.out.println("Error in finding level!"); // this is instead of 9, and any other possible errors
        }
        gameContinuer = true;
        System.out.println("This works");
    }




    public static void updatePosition(int position, char value) {
        int r = position / main_matrix.length;  // row
        int c = position % main_matrix.length;  // column
        main_matrix[r][c] = value;
        // System.out.println(i + "" + j + "  " + value + " "); // used for testing
    }
}

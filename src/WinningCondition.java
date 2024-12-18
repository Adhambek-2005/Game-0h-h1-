
public class WinningCondition {

    // checking if all panels are filled
    public static boolean isFilled(char[][] matrix) {
        // idiotic AI recommended
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                // checking for empty panel
                if (aChar == ' ') {
                    return false;
                }
            }
        }
        return true; // No empty spaces found
    }

    // checking if no three squares located near each other
    public static boolean isThreeLineProper(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i >= 2 && matrix[i][j] == matrix[i-1][j] && matrix[i][j] == matrix[i-2][j]) {
                    return false;
                }
                else if (j >= 2 && matrix[i][j] == matrix[i][j-1] && matrix[i][j] == matrix[i][j-2]) {
                    return false;
                }
            }
        }
        // System.out.println("This function is working!"); // checking if the function is working
        return true;
    }

    // checking for rows, if they have equal number of 0's and 1's
    public static boolean isRowProper(char[][] matrix) {
        for (char[] row : matrix) {
            int num_0s = 0;
            int num_1s = 0;

            for (char aChar : row) {
                if (aChar == '1') {
                    num_1s++;
                } else if (aChar == '0') {
                    num_0s++;
                }
            }

            if (num_0s != matrix.length / 2 || num_1s != matrix.length / 2) {
                return false;
            }
        }
        return true;
    }

    // checking for columns, if they have equal number of 0's and 1's
    public static boolean isColumnProper(char[][] matrix) {
        for (int col = 0; col < matrix.length; col++) { // Loop through 4 columns
            int num_0s = 0;
            int num_1s = 0;

            for (char[] chars : matrix) { // Loop through 4 rows
                if (chars[col] == '1') {
                    num_1s++;
                } else if (chars[col] == '0') {
                    num_0s++;
                }
            }

            if (num_0s != matrix.length / 2 || num_1s != matrix.length / 2) {
                return false;
            }
        }
        return true;
    }

    // checking if all rows are different
    public static boolean areRowsDifferent(char[][] matrix) {
        String[] rows = new String[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < matrix[i].length; j++) {
                row.append(matrix[i][j]).append(" ");
            }
            rows[i] = row.toString().trim(); // Trim trailing space
        }

        for (int i = 1; i < rows.length; i++) {
            if (rows[i].equals(rows[i - 1])) {
                return false;
            }
        }
        return true;
    }

    // checking if all rows columns different
    public static boolean areColumnsDifferent(char[][] matrix) {
        String[] columns = new String[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            StringBuilder column = new StringBuilder();
            for (char[] chars : matrix) {
                column.append(chars[j]).append(" ");
            }
            columns[j] = column.toString().trim(); // Trim trailing space
        }

        for (int j = 1; j < columns.length; j++) {
            if (columns[j].equals(columns[j - 1])) {
                return false;
            }
        }
        return true;
    }



    // checking if user win (main function)
    public static boolean winningCondition(char[][] matrix) {
        // returns true if all conditions are met
        return isFilled(matrix) && isRowProper(matrix) && isColumnProper(matrix) && isThreeLineProper(matrix) && areRowsDifferent(matrix) && areColumnsDifferent(matrix);
    }
}

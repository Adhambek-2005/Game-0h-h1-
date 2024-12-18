
import java.util.Random;

public class Database {
    public static char[][] matrix;

    // randomize game matrix
    public static Random random = new Random();
    public static int choice = random.nextInt(9) + 1;  // Randomly pick a number between 1 and 8

    // trying specific matrix
    public static char[][] getRandomMatrix4() {

        // choice = 9;
        // all possible games for 4x4 matrix
        final String matrix4_1 = "  0  1      11  ";
        final String matrix4_2 = "0 0   0      1  ";
        final String matrix4_3 = "  1     0  00   ";
        final String matrix4_4 = "  0  00  1     0";
        final String matrix4_5 = "11     01       ";
        final String matrix4_6 = " 1  0   0 0     ";
        final String matrix4_7 = "  11     0     1";
        final String matrix4_8 = "1   1  1     1 1";
        final String matrix4_9 = "  0  1     10  1"; // case which allows two similar rows && columns

        return switch (choice) {
            case 1 -> stringToMatrix(matrix4_1, 4);
            case 2 -> stringToMatrix(matrix4_2, 4);
            case 3 -> stringToMatrix(matrix4_3, 4);
            case 4 -> stringToMatrix(matrix4_4, 4);
            case 5 -> stringToMatrix(matrix4_5, 4);
            case 6 -> stringToMatrix(matrix4_6, 4);
            case 7 -> stringToMatrix(matrix4_7, 4);
            case 8 -> stringToMatrix(matrix4_8, 4);
            default -> stringToMatrix(matrix4_9, 4); // this is instead of 9, and any other possible errors
        };
    }

    // Get random matrix, 6x6, (done)
    public static char[][] getRandomMatrix6() {
        // all possible games for 4x4 matrix
        final String matrix6_1 = "   0    1 1 0     0  1    1   0 0 0 ";
        final String matrix6_2 = "  1   0  0  0   11    0001         1";
        final String matrix6_3 = "  0   1 0   0  0 1 0   1   11 1  0  ";
        final String matrix6_4 = "   1          1    0 0   0   0     0";
        final String matrix6_5 = "  1  0  1 1 0  0        0   01      ";
        final String matrix6_6 = "0   1   1 1   1    0  0 1       1   ";
        final String matrix6_7 = "              0 00    00  0    0 1  ";
        final String matrix6_8 = "      1      0 0   0      0 0 00  0 ";
        final String matrix6_9 = "    1       0   0 01 1   1    1    1";

        Random random = new Random();
        int choice = random.nextInt(9) + 1;  // Randomly pick a number between 1 and 8
        // choice = 1; // trying specific matrix

        return switch (choice) {
            case 1 -> stringToMatrix(matrix6_1, 6);
            case 2 -> stringToMatrix(matrix6_2, 6);
            case 3 -> stringToMatrix(matrix6_3, 6);
            case 4 -> stringToMatrix(matrix6_4, 6);
            case 5 -> stringToMatrix(matrix6_5, 6);
            case 6 -> stringToMatrix(matrix6_6, 6);
            case 7 -> stringToMatrix(matrix6_7, 6);
            case 8 -> stringToMatrix(matrix6_8, 6);
            default -> stringToMatrix(matrix6_9, 6); // this is instead of 9, and any other possible errors
        };
    }

    // Get random matrix, 8x8
    public static char[][] getRandomMatrix8() {
        // all possible games for 8x8 matrix
        final String matrix8_1 = "    11   1        0 0 0  1   1  00 1       1   00    1 0        ";
        final String matrix8_2 = "    0   0 0   10   01       1     0  0 0 1 11  1    0  0 010  10";
        final String matrix8_3 = "           1  0 0 0        1 1 1 0  0    01   1 0         0 0 11";
        final String matrix8_4 = "   1 00   0 1 1 1  0    11  0         1  0  1  0  0  0 1        ";
        final String matrix8_5 = "  0  1  1     00   1  0 0 0  0                  0   00 11       ";
        final String matrix8_6 = "    0 0  01   0  0 0        10 0       0 1 1          0 1      0";
        final String matrix8_7 = " 0 0    1     1   1 1  1 0        1 0       0   1  1  1    11  1";
        final String matrix8_8 = " 0  1     1    0 0 0  1       1         1 1  0  1     00  1 1   ";
        final String matrix8_9 = "          0 0  0 1  0  0  0         1   0 0        1 1  0    1  ";

        Random random = new Random();
        int choice = random.nextInt(9) + 1;  // Randomly pick a number between 1 and 8
        // choice = 1; // trying specific matrix

        return switch (choice) {
            case 1 -> stringToMatrix(matrix8_1, 8);
            case 2 -> stringToMatrix(matrix8_2, 8);
            case 3 -> stringToMatrix(matrix8_3, 8);
            case 4 -> stringToMatrix(matrix8_4, 8);
            case 5 -> stringToMatrix(matrix8_5, 8);
            case 6 -> stringToMatrix(matrix8_6, 8);
            case 7 -> stringToMatrix(matrix8_7, 8);
            case 8 -> stringToMatrix(matrix8_8, 8);
            default -> stringToMatrix(matrix8_9, 8); // this is instead of 9, and any other possible errors
        };
    }

    // Get random matrix, 10x10
    public static char[][] getRandomMatrix10() {
        // all possible games for 10x10 matrix
        final String matrix10_1 = "0  0 00         0 1   0 0   0 1    0  0  0 1 1  1     0    1     1 1  1     0  1  10   1   0 00  00 ";
        final String matrix10_2 = "  11    01           0  10       1  11 1  0    11   0     1 0    00    0      1     1  0    1   10 0";
        final String matrix10_3 = "     0 00  0            11    0  1      1  1 1 1 1    0  1   1 0           0 00   1 1      0 0     0";
        final String matrix10_4 = "  0 01  0  11                10          1    10        1  10       0  1   0 1   11     0   1      1";
        final String matrix10_5 = "     1      0 11 1  01      0     1     0 0  0 1     1      1     00   0 11           0   0     00  ";
        final String matrix10_6 = "    0 0  1   1 10  1 0 1        0    0 0            0 0 1         10    0      0   0  0 0 1  1   1  ";
        final String matrix10_7 = "1    001    1  1    0  0   0      0  00 1  011     01   0 11 0       1  0  0 0  0 11    111         ";
        final String matrix10_8 = "1    0      10     00  00  1 0     01    1 0   1  00         1 0   10 0   0  1    0   0      1 1 1 1";
        final String matrix10_9 = "11         00      1    1    1    1 1 1   11   0      1 1   1   1  1     1     1    1   01 1   0  0 ";

        Random random = new Random();
        int choice = random.nextInt(9) + 1;  // Randomly pick a number between 1 and 8
        // choice = 1; // trying specific matrix

        return switch (choice) {
            case 1 -> stringToMatrix(matrix10_1, 10);
            case 2 -> stringToMatrix(matrix10_2, 10);
            case 3 -> stringToMatrix(matrix10_3, 10);
            case 4 -> stringToMatrix(matrix10_4, 10);
            case 5 -> stringToMatrix(matrix10_5, 10);
            case 6 -> stringToMatrix(matrix10_6, 10);
            case 7 -> stringToMatrix(matrix10_7, 10);
            case 8 -> stringToMatrix(matrix10_8, 10);
            default -> stringToMatrix(matrix10_9, 10); // this is instead of 9, and any other possible errors
        };
    }


    // Converts String to Matrix,
    public static char[][] stringToMatrix(String input, int size_of_matrix) {
        matrix = new char[size_of_matrix][size_of_matrix];
        for (int i = 0; i < input.length(); i++) {
            matrix[i / size_of_matrix][i % size_of_matrix] = input.charAt(i);
        }
        return matrix;
    }
}

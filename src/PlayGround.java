import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayGround {
    private static JPanel gridPanel;
    private static JPanel[][] panelGrid;
    private static boolean isFrozen = false; // freezes panels after you successfully solve the entire game

    public static void playGround(char[][] matrix) {
        JFrame frame = new JFrame("0h h1 Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        int rows = matrix.length;
        int cols = matrix[0].length;
        panelGrid = new JPanel[rows][cols];
        gridPanel = new JPanel(new GridLayout(rows, cols, 5, 5));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JPanel cell = createCell(matrix, i, j);
                panelGrid[i][j] = cell;
                gridPanel.add(cell);
            }
        }

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JPanel createCell(char[][] matrix, int row, int col) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(50, 50));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Set initial color based on matrix value
        char value = matrix[row][col];
        switch (value) {
            case '1':
                panel.setBackground(Color.RED);
                break;
            case '0':
                panel.setBackground(Color.BLUE);
                break;
            default:
                panel.setBackground(Color.LIGHT_GRAY);
                break;
        }

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isFrozen) return; // Ignore clicks if frozen

                int position = row * matrix[0].length + col;
                if (UnclickablePanel.isClickable(position)) {
                    Color currentColor = panel.getBackground();
                    if (currentColor.equals(Color.LIGHT_GRAY)) {
                        panel.setBackground(Color.BLUE);
                        MatrixCondition.updatePosition(position, '0');
                    } else if (currentColor.equals(Color.BLUE)) {
                        panel.setBackground(Color.RED);
                        MatrixCondition.updatePosition(position, '1');
                    } else {
                        panel.setBackground(Color.LIGHT_GRAY);
                        MatrixCondition.updatePosition(position, ' ');
                    }
                }
            }
        });

        return panel;
    }

    public static void freezeFrame() {
        isFrozen = true;
    }
}

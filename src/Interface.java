import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class Interface {
    private static void showPlayMenu(JFrame currentFrame) {
        currentFrame.dispose(); // Close the current frame

        JFrame frame = new JFrame("Choose the level");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel playPanel = new JPanel();
        playPanel.setLayout(new GridLayout(2, 2, 10, 10));

        // levels button
        JButton level4 = new JButton("4x4");
        JButton level6 = new JButton("6x6");

        JButton level8 = new JButton("8x8");
        level8.setBackground(Color.BLUE);  // Set background color
        level8.setForeground(Color.WHITE); // Set text color
        level8.setFont(new Font("Arial", Font.BOLD, 16));  // Set font size and style
        level8.setPreferredSize(new Dimension(100, 50));
        level8.addActionListener(_ -> {
            System.exit(0);
            // Oh_h1.levelPutter(8);
            MatrixCondition.levelDecider(8);
        });

        JButton level10 = new JButton("10x10");

        level4.addActionListener(_ -> {
            System.exit(0);
            // Oh_h1.levelPutter(4);
            MatrixCondition.levelDecider(4);
        });
        level6.addActionListener(_ -> {
            System.exit(0);
            // Oh_h1.levelPutter(6);
            MatrixCondition.levelDecider(6);
        });

        level10.addActionListener(_ -> {
            System.exit(0);
            // Oh_h1.levelPutter(10);
            MatrixCondition.levelDecider(10);
        });

        // adding to frame
        playPanel.add(level4);
        playPanel.add(level6);
        playPanel.add(level8);
        playPanel.add(level10);

        frame.add(playPanel);
        frame.setVisible(true);
    }

    private static void showSettingsMenu(JFrame currentFrame) {
        currentFrame.dispose(); // Close the current frame

        JFrame settingsFrame = new JFrame("Settings");
        settingsFrame.setSize(300, 200);
        settingsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        settingsFrame.setLocationRelativeTo(null);

        JPanel settingPanel = new JPanel();
        settingPanel.setLayout(new GridLayout(2, 2, 10, 10));

        // Настройки
        JButton themeButton = new JButton("Theme");
        themeButton.addActionListener(_ -> JOptionPane.showMessageDialog(null, "dark, light"));

        JButton languageButton = new JButton("Language");
        languageButton.addActionListener(_ -> JOptionPane.showMessageDialog(null, "Rus, Eng"));

        settingPanel.add(themeButton);
        settingPanel.add(languageButton);

        settingsFrame.add(settingPanel);
        settingsFrame.setVisible(true);
    }

    // How to Play section
    private static void openRules(JFrame currentFrame) {
        currentFrame.dispose(); // Close the current frame

        try {
            // Ensure the Desktop API is supported on the current platform
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                // Use URI instead of URL for browse()
                desktop.browse(new URI("https://www.youtube.com"));
            } else {
                System.out.println("Desktop is not supported on this platform.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayingInterface() {
        JFrame frame = new JFrame("Main menu");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton playButton = new JButton("Play");
        playButton.addActionListener(_ -> showPlayMenu(frame)); // Pass current frame
        panel.add(playButton);

        JButton settingsButton = new JButton("Settings");
        settingsButton.addActionListener(_ -> showSettingsMenu(frame)); // Pass current frame
        panel.add(settingsButton);

        JButton rules = new JButton("How to play");
        rules.addActionListener(_ -> openRules(frame)); // Pass current frame
        panel.add(rules);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(_ -> System.exit(0));
        panel.add(exitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}

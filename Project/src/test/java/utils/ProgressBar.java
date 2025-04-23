package utils;

import javax.swing.*;
import java.awt.*;

public class ProgressBar {
    private JFrame frame;
    private JProgressBar progressBar;

    public ProgressBar(int total) {
        frame = new JFrame("Test Progress");
        progressBar = new JProgressBar(0, total);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressBar.setForeground(Color.GREEN);

        frame.setLayout(new BorderLayout());
        frame.add(progressBar, BorderLayout.CENTER);
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        System.out.println("Progress bar initialized"); // Debug print
    }

    public void update(int progress) {
        progressBar.setValue(progress);
        System.out.println("Progress updated to: " + progress); // Debug print
    }

    public void close() {
        frame.dispose();
        System.out.println("Progress bar closed"); // Debug print
    }
}

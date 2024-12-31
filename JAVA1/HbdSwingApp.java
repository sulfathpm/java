import javax.swing.*;
import java.awt.*;

public class HbdSwingApp extends JFrame {
    private Font font;
    private Image img;

    public HbdSwingApp() {
        // Set up the JFrame
        setTitle("Happy Birthday App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load font and image
        font = new Font("Times New Roman", Font.BOLD, 32);
        img = new ImageIcon("First.jpg").getImage(); // Ensure "First.jpg" is in the same directory

        // Custom JPanel to draw content
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Set font and draw text
                g.setFont(font);
                g.setColor(Color.CYAN);
                g.drawString("Happy Birthday", 50, 50);

                // Draw the image
                if (img != null) {
                    g.drawImage(img, 50, 100, this);
                } else {
                    g.drawString("Image not found", 50, 100);
                }
            }
        };

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create and display the JFrame
        SwingUtilities.invokeLater(() -> {
            HbdSwingApp app = new HbdSwingApp();
            app.setVisible(true);
        });
    }
}

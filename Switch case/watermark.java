import java.awt.*;
import javax.swing.*;

public class watermark extends JFrame {
    public watermark() {
        // Set the title of the window
        setTitle("Watermark");

        // Set the default close operation (closes the window when you click the X)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        setSize(800, 400);

        // Create a custom panel to display the watermark
        WatermarkPanel panel = new WatermarkPanel();
        add(panel);

        // Center the window on the screen
        setLocationRelativeTo(null);

        setAlwaysOnTop(true);
    }

    public static void main(String[] args) {
        // Create the watermark window and make it visible
        watermark watermark = new watermark();
        watermark.setVisible(true);
    }
}

// Custom panel class to draw the watermark text
class WatermarkPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the text you want to display
        String text1 = "Made by Abhinav Singh";
        String text2 = "Instagram: @67et98i9i59two2123022789031415";
        String text3 = "Best of luck for your exams or test!";

        // Set the font and color for the text
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.GRAY);

        // Draw the text on the panel
        g.drawString(text1, 50, 50);  // (x, y) position for text1
        g.drawString(text2, 50, 100); // (x, y) position for text2
        g.drawString(text3, 50, 150);
    }
}

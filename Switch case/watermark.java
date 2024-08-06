import java.awt.*;
import javax.swing.*;

public class watermark extends JFrame {
    public watermark() {
        setTitle("Watermark");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        add(new WatermarkPanel());
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        new Timer(3000, e -> setVisible(false)).start(); // Hide window after 3 seconds
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            watermark wm = new watermark();
            wm.setVisible(true);
        });
    }
}

class WatermarkPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.GRAY);
        g.drawString("Made by Abhinav Singh", 50, 50);
        g.drawString("Instagram: @67et98i9i59two2123022789031415", 50, 100);
        g.drawString("Best of luck for your exams or test!", 50, 150);
    }
}

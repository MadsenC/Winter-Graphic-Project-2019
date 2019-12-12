import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Main extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Madsen Cooper - Winter Project");
        Canvas canvas = new Main();
        canvas.setSize(1000, 650);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Expo.setColor(g, 67, 209, 190);
        Expo.fillCircle(g, 500, 312, 300);
        Globe.drawSnow(g);
        Globe.drawMountain(g);
        Globe.drawHills(g);
        Globe.drawHouse(g);
        Globe.drawTrees(g);
        Globe.drawSun(g);
        Globe.drawGlobe(g);
    }
}
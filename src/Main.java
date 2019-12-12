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
        Expo.delay(500);
        Globe.drawSnow(g);
        Expo.delay(500);
        Globe.drawMountain(g);
        Expo.delay(500);
        Globe.drawHills(g);
        Expo.delay(500);
        Globe.drawHouse(g);
        Expo.delay(500);
        Globe.drawTrees(g);
        Expo.delay(500);
        Globe.drawSun(g);
        Expo.delay(500);
        Globe.drawGlobe(g);
    }
}
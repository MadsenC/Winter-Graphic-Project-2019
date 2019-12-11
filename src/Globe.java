import java.awt.*;

public class Globe {
        public static void drawSnow(Graphics g) {
            Expo.setColor(g, Expo.white);
            for (int a = 1; a <= 200; a++) {
                int x = Expo.random(200, 800);
                int y = Expo.random(50, 575);
                Expo.fillCircle(g, x, y, 3);
            }
        }

        public static void drawMountain(Graphics g) {
            Expo.setColor(g, 175, 219, 219);
            Expo.fillPolygon(g, 250, 425, 300, 300, 350, 425);
            Expo.fillPolygon(g, 300, 450, 400, 225, 500, 450);
            Expo.fillPolygon(g, 425, 450, 500, 275, 575, 450);
            Expo.setColor(g, Expo.white);
            Expo.fillPolygon(g, 288, 325, 300, 300, 311, 325);
            Expo.fillPolygon(g, 375, 275, 400, 225, 425, 275);
            Expo.fillPolygon(g, 475, 325, 500, 275, 525, 325);
        }

        public static void drawHills(Graphics g) {
            Expo.setColor(g, 245, 237, 237);
            Expo.fillArc(g, 625, 525, 250, 100, 270, 90);
            Expo.setColor(g, 235, 221, 221);
            Expo.fillArc(g, 300, 500, 300, 80, 270, 90);
            Expo.setColor(g, Expo.white);
            Expo.fillArc(g, 475, 775, 500, 300, 260, 100);
        }

        public static void drawHouse(Graphics g) {
            Expo.setColor(g, Expo.black);
            Expo.fillRectangle(g, 425, 400, 432, 360);
            Expo.setColor(g, Expo.white);
            Expo.setColor(g, 216, 77, 77);
            Expo.fillRectangle(g, 325, 500, 475, 425);
            Expo.fillPolygon(g, 325, 425, 400, 350, 475, 425);
            Expo.setColor(g, Expo.bronze);
            Expo.fillRectangle(g, 325, 494, 475, 500);
            Expo.setColor(g, 222, 181, 46);
            Expo.fillRectangle(g, 350, 494, 375, 425);
            Expo.fillRectangle(g, 400, 432, 450, 462);
            Expo.fillRectangle(g, 387, 387, 412, 412);
            Expo.setColor(g, Expo.black);
            Expo.drawLine(g, 362, 494, 362, 437);
            Expo.drawLine(g, 350, 437, 375, 437);
            Expo.drawLine(g, 350, 462, 375, 462);
            Expo.drawLine(g, 425, 432, 425, 462);
            Expo.drawLine(g, 400, 448, 450, 448);
            Expo.drawLine(g, 400, 387, 400, 412);
            Expo.drawLine(g, 387, 400, 412, 400);
            Expo.setColor(g, Expo.bronze);
            Expo.fillRectangle(g, 350, 425, 375, 422);
            Expo.fillRectangle(g, 395, 432, 400, 462);
            Expo.fillRectangle(g, 450, 432, 455, 462);
            Expo.fillRectangle(g, 382, 387, 387, 412);
            Expo.fillRectangle(g, 412, 387, 417, 412);
            Expo.setColor(g, Expo.white);
            Expo.fillRectangle(g, 350, 422, 375, 419);
            Expo.fillRectangle(g, 395, 429, 455, 432);
            Expo.fillRectangle(g, 382, 384, 417, 387);
        }

        public static void drawTrees(Graphics g) {
            Expo.setColor(g, Expo.brown);
            Expo.fillRectangle(g, 625, 435, 630, 400);
            Expo.fillRectangle(g, 700, 435, 705, 400);
            Expo.setColor(g, Expo.white);
            Expo.fillOval(g, 628, 375, 25, 35);
            Expo.fillOval(g, 702, 360, 40, 50);
        }

        public static void drawSun(Graphics g) {
            Expo.setColor(g, Expo.lightYellow);
            Expo.fillCircle(g, 615, 85, 30);
            Expo.setColor(g, Expo.white);
            Expo.fillOval(g, 550, 100, 30, 30);
            Expo.fillOval(g, 575, 100, 30, 25);
        }

        public static void drawGlobe(Graphics g) {
            int r = 300;
            for (int k = 1; k <= 400; k++) {
                Expo.drawCircle(g, 500, 312, r);
                r++;
            }
            Expo.setColor(g, Expo.black);
            Expo.drawString(g, "Made by Madsen Cooper", 25, 25);
            Expo.drawString(g, "Winter Globe - 50 Points", 25, 50);
        }
}

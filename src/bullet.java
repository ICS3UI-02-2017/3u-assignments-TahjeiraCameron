/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Game;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author camet2651
 */
class bullet {

    public int speed;
    public int x;
    public int y;
    Rectangle bullet = new Rectangle(x, y, 5, 5);
    public boolean intersection;
    public int xInt;

    public bullet(int bulletX, int bulletY, int bulletSpeed) {//create bullet at inputed location with speed
        x = bulletX;
        y = bulletY;
        speed = bulletSpeed;
        bullet.x = x;
        bullet.y = y;
    }

    public void bulletDraw(Graphics g, int playerX, int bulletY) {// draw bullet at correct location
        bullet.y = bulletY;
        g.fillRect(playerX, bullet.y, bullet.width, bullet.height);
    }

    public void shoot(int speed) {// move bullet down at inputed speed
        y = y + speed;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
}

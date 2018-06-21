/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 *
 * @author Tahjeira
 */
class birds {

    public int speed;
    public int x;
    public int y;
    public int width;
    public int height;
    Rectangle bird = new Rectangle(x, y, width, height);
    Random rand = new Random();

    public birds(int birdX, int birdY, int birdWidth, int birdHeight, int birdSpeed) {//create bird at specific location with a speed
        x = birdX;
        y = birdY;
        width = birdWidth;
        height = birdHeight;
        speed = birdSpeed;
        bird.x = x;
        bird.y = y;
        bird.width = width;
        bird.height = height;

    }

    public void drawBird(Graphics g, int birdX, int birdY, int birdH, int birdW) {// draw bird at correct location
        g.setColor(Color.yellow);
        bird.y = birdY;
        g.fillRect(birdX, bird.y, birdW, birdH);
    }

    public void move(int speed) {//move bird across screen and up and down at random heights
        x = x + speed;
        y = y + rand.nextInt(5 + 1 + 5) - 5;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

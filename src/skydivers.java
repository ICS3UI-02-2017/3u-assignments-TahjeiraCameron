/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Tahjeira
 */
class skydivers {

    public int speed;
    public int x;
    public int y;
    public int width;
    public int height;
    Rectangle skyDiver = new Rectangle(x, y, width, height);

    public skydivers(int skyX, int skyY, int skyWidth, int skyHeight, int skySpeed) {//create skydiver at inputed location
        x = skyX;
        y = skyY;
        width = skyWidth;
        height = skyHeight;
        speed = skySpeed;
        skyDiver.x = x;
        skyDiver.y = y;
        skyDiver.width = width;
        skyDiver.height = height;
    }

    public void drawDiver(Graphics g, int diverX, int diverY, int diverWidth, int diverHeight) {// draw diver at correct location
        g.setColor(Color.green);
        skyDiver.x = diverX;
        g.fillRect(diverX, skyDiver.y, diverWidth, diverHeight);
    }

    public void move(int speed) {//move skydiver across screen
        x = x - speed;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}

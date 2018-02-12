/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * First Assignment 
 * @author camet2651
 */

public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Create  a City for the Robot
        City nyc = new City();
        
        //create wallS
        new Wall(nyc, 1, 1, Direction.WEST); 
        new Wall(nyc, 1, 2, Direction.EAST); 
        new Wall(nyc, 2, 2, Direction.EAST); 
        new Wall(nyc, 2, 1, Direction.WEST); 
        new Wall(nyc, 1, 1, Direction.NORTH);
        new Wall(nyc, 1, 2, Direction.NORTH);
        new Wall(nyc, 2, 2, Direction.SOUTH);
        new Wall(nyc, 2, 1, Direction.SOUTH);
       //Put a robot in nyc
        RobotSE srbw = new RobotSE(nyc, 0, 2, Direction.WEST);
       //Move Robot around wall
        srbw.move(2);
        srbw.turnLeft();
        srbw.move(3);
        srbw.turnLeft();
        srbw.move(3);
        srbw.turnLeft();
        srbw.move(3);
        srbw.turnLeft();
        srbw.move(1);
          }
}

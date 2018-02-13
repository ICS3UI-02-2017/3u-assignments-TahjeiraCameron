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

public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
            //Create  a City for the Robot
        City nyc = new City();
        
        //create wallS
        new Wall(nyc, 1, 1, Direction.WEST); 
        new Wall(nyc, 1, 2, Direction.EAST); 
        new Wall(nyc, 2, 1, Direction.WEST); 
        new Wall(nyc, 1, 1, Direction.NORTH);
        new Wall(nyc, 1, 2, Direction.NORTH);
        new Wall(nyc, 1, 2, Direction.SOUTH);
        new Wall(nyc, 2, 1, Direction.SOUTH);
       //Put a robot in nyc
        RobotSE srbw = new RobotSE(nyc, 1, 2, Direction.SOUTH);
       
        //put newspaper down
        new Thing(nyc , 2, 2); 
        
        //srbw goes to newspaper
        srbw.turnRight();
        srbw.move(1);
        srbw.turnLeft();
        srbw.move(1);
        srbw.turnLeft();
        srbw.move(1);
       
        //srbw picks up news paper
        srbw.pickThing();
        
        //srbw returns to bed
         srbw.turnLeft(2);
        srbw.move(1);
        srbw.turnRight();
        srbw.move(1);
        srbw.turnRight();
        srbw.move(1);
        srbw.turnRight();
       
          }
}

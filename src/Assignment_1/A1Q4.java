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
 * Last
 * @author camet2651
 */

public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
            //Create  a City for the Robot
        City nyc = new City();
        
        //create first "step"
        new Wall(nyc, 3, 2, Direction.WEST); 
        new Wall(nyc, 3, 2, Direction.NORTH); 
        
        //create upwards section
        new Wall (nyc, 1,3, Direction.WEST);
        new Wall (nyc,2,3, Direction.WEST);
        
        //Create top and side
         new Wall (nyc, 1,3, Direction.NORTH);
        new Wall (nyc, 1,3, Direction.EAST);
        
        //Final across and down section
        new Wall (nyc, 2,4, Direction.NORTH);
        new Wall (nyc, 2,4, Direction.EAST);
        new Wall (nyc,3,4, Direction.EAST);
        
       //Put a robot in nyc
        RobotSE srbw = new RobotSE(nyc, 3, 0, Direction.EAST);
       
        //put flag down
        new Thing(nyc , 3, 1); 
        
        //Moving to and picking up flag
        srbw.move();
        srbw.pickThing();
        
        //climb mountain
        srbw.turnLeft();
        srbw.move();
        srbw.turnRight();
        srbw.move(1);
        srbw.turnLeft();
        srbw.move(2);
        srbw.turnRight();
        srbw.move(1);
        
        //drop flag
        srbw.putThing();
        
        //go down mountain
        srbw.move();
        srbw.turnRight();
        srbw.move();
        srbw.turnLeft();
        srbw.move(1);
        srbw.turnRight();
        srbw.move(2);
        srbw.turnLeft();

       
          }
}

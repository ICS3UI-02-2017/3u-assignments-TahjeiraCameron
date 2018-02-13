/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning  how to use the robots
 * @author camet2651
 */

public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Create  a City for the Robot
        City nyc = new City();
        
        //create wall
        Wall green = new Wall(nyc, 2, 5, Direction.WEST); 
        
        //create thing
        new Thing(nyc, 2, 4);
   
  
        //Put a robot in nyc
        RobotSE srbw = new RobotSE(nyc, 2, 3, Direction.EAST);
 
         //Set colour of robot and wall
        srbw.setColor(Color.MAGENTA);
        green.setColor(Color.GREEN);
        
         //Put a name on srbw
        srbw.setLabel("call me a diva");
        
        //move the robot forward one space
        srbw.move();
        
        //Pick up thing
        srbw.pickThing();
        
        //turn the robot to the right
        srbw.turnRight();
         
        //move robot n nuber of spaces
        srbw.move(2);
 
         
        //put thing down
        srbw.putThing();
        
        //move 
        srbw.move(2);
        
        
        
          }
}

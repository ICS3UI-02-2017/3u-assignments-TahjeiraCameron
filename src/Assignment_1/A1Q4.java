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
        new Wall(nyc, 0, 1, Direction.WEST); 
        new Wall(nyc, 1, 1, Direction.WEST); 
        new Wall(nyc, 1,1,Direction.SOUTH);
        
       //Put a robot on left side
        RobotSE srbw = new RobotSE(nyc, 0, 0, Direction.SOUTH);
       
        //Put a robot on right side
        RobotSE brsw = new RobotSE(nyc, 0, 1, Direction.SOUTH);
       
   //move both robots down
        srbw.move(1);
        brsw.move(1);
        brsw.turnLeft();
   //tunr both robots
        srbw.turnLeft();
        
        
        
       
          }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

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
              
   //Put a robot on left side
        RobotSE srbw = new RobotSE(nyc, 0, 0, Direction.EAST);
        
        //Building big square
        new Wall(nyc, 2, 2, Direction.NORTH); 
        new Wall(nyc, 2, 3, Direction.NORTH); 
        new Wall(nyc, 2, 2, Direction.WEST); 
        new Wall(nyc, 3, 2, Direction.WEST); 
        new Wall(nyc, 3, 2, Direction.SOUTH); 
        new Wall(nyc, 3, 3, Direction.SOUTH); 
        new Wall(nyc, 3, 3, Direction.EAST); 
        new Wall(nyc, 2, 3, Direction.EAST);
        
        //Building left square
        new Wall(nyc, 1, 1, Direction.NORTH); 
        new Wall(nyc, 1, 1, Direction.SOUTH); 
        new Wall(nyc, 1, 1, Direction.EAST); 
        new Wall(nyc, 1, 1, Direction.WEST);
       
        //Building right square
        new Wall(nyc, 1, 4, Direction.NORTH); 
        new Wall(nyc, 1, 4, Direction.SOUTH); 
        new Wall(nyc, 1, 4, Direction.EAST); 
        new Wall(nyc, 1, 4, Direction.WEST);
 
        //Building bottom left square
        new Wall(nyc, 4, 1, Direction.NORTH); 
        new Wall(nyc, 4, 1, Direction.SOUTH); 
        new Wall(nyc, 4, 1, Direction.EAST); 
        new Wall(nyc, 4, 1, Direction.WEST);
        
        //Building bottom right square
        new Wall(nyc, 4, 4, Direction.NORTH); 
        new Wall(nyc, 4, 4, Direction.SOUTH); 
        new Wall(nyc, 4, 4, Direction.EAST); 
        new Wall(nyc, 4, 4, Direction.WEST);
        
       while (srbw.frontIsClear()){
           srbw.move();
       
       }
           
       }
           
          }
}

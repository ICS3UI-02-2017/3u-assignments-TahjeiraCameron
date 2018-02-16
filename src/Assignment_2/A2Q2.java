/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author camet2651
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
     City nyc = new City();
      
     // create srbw
     RobotSE srbw = new RobotSE(nyc, 1 , 1, Direction.EAST);
     
     //create finish line
     new Thing(nyc, 1,9);
     
     //create "track"
     new Wall(nyc, 1, 1, Direction.SOUTH); 
     new Wall(nyc, 1, 2, Direction.SOUTH); 
     new Wall(nyc, 1, 3, Direction.SOUTH); 
     new Wall(nyc, 1, 4, Direction.SOUTH); 
     new Wall(nyc, 1, 5, Direction.SOUTH); 
     new Wall(nyc, 1, 6, Direction.SOUTH); 
     new Wall(nyc, 1, 7, Direction.SOUTH); 
     new Wall(nyc, 1, 8, Direction.SOUTH); 
     new Wall(nyc, 1, 9, Direction.SOUTH); 
    
     //create hurdles
     new Wall(nyc, 1, 1, Direction.EAST); 
     new Wall(nyc, 1, 2, Direction.EAST); 
     new Wall(nyc, 1, 4, Direction.EAST); 
     new Wall(nyc, 1, 7, Direction.EAST); 
    
        while (!srbw.canPickThing()){
          //while front is clear move forward until meeting hurdle
         if(srbw.frontIsClear()) {
             srbw.move();
         
         }else{ 
          srbw.turnLeft();
          srbw.move();
          srbw.turnRight();
          srbw.move();
          srbw.turnRight();
          srbw.move();
          srbw.turnLeft();
            
      }
      }
    }
}

    
     

         
    


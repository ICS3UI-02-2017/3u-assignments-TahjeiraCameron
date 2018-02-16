package Assignment_2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahjeira
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // create a new city called nyc
        City nyc = new City();
        
        // create a robot
         RobotSE srbw = new RobotSE(nyc, 10, 20, Direction.SOUTH);
     
        //when srbw is NOT avenue 0
          while (srbw.getAvenue() != 0 ) 
          {
         //check if srbw is facing west so he can orient himself in the proper direction to move acorss to 0     
          if (! srbw.isFacingWest()) 
           {
         //if hes not turn left until he is facing west
               srbw.turnLeft();
           }  
         //once he is facing west or if he already was
            else 
           {
         //move until he is on avenue 0 and the original while statement is false
               srbw.move();
           }
        }
        
        //when srbw is NOT on street 0
          while (srbw.getStreet() != 0 ) 
          {
         //check if srbw is facing north so he can orient himself in the proper direction to move upwards     
           if (! srbw.isFacingNorth()) 
           {
         //if hes not turn right until he is facing north
               srbw.turnRight();
           }  
         //once he is facing north or if he already was
            else 
           {
         //move until he is on street 0 and the original while statement is false
               srbw.move();
           }
        }
    }
}
//Should it work for negative coordinates as well?

    
    


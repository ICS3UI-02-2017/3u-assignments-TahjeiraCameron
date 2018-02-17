package Assignment_2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tahjeira
 */
public class A2challenge {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // create a new city called nyc
        City nyc = new City();
        
        // create a robot
         RobotSE srbw = new RobotSE(nyc,  0, 1, Direction.SOUTH);
     
         //creating left sidewalk and bottom
            new Wall(nyc, 0, 0, Direction.EAST);
            new Wall(nyc, 1, 0, Direction.EAST);
            new Wall(nyc, 2, 0, Direction.EAST);
            new Wall(nyc, 3, 0, Direction.EAST);
            new Wall(nyc, 4, 0, Direction.EAST);
            new Wall(nyc, 5, 0, Direction.EAST);
            new Wall(nyc, 6, 0, Direction.EAST);
            new Wall(nyc, 7, 0, Direction.EAST);
            new Wall(nyc, 8, 0, Direction.EAST);
            new Wall(nyc, 9, 0, Direction.EAST);
            new Wall(nyc, 9, 1, Direction.SOUTH);
          
          //creating right parts of sidewalk
            new Wall(nyc, 0, 1, Direction.EAST);
            new Wall(nyc, 3, 1, Direction.EAST);
            new Wall(nyc, 5, 1, Direction.EAST);
            new Wall(nyc, 6, 1, Direction.EAST);
            new Wall(nyc, 9, 1, Direction.EAST);
            
            //Creating bottom of first driveway
            new Wall(nyc, 2, 2, Direction.SOUTH);
            new Wall(nyc, 2, 3, Direction.SOUTH);
            new Wall(nyc, 2, 4, Direction.SOUTH);
            new Wall(nyc, 2, 5, Direction.SOUTH);
            
            //creeating top of first driveway
            new Wall(nyc, 1, 2, Direction.NORTH);
            new Wall(nyc, 1, 3, Direction.NORTH);
            new Wall(nyc, 1, 4, Direction.NORTH);
            new Wall(nyc, 1, 5, Direction.NORTH);
            
            //Creating end of first driveway
            new Wall(nyc, 1, 5, Direction.EAST);
            new Wall(nyc, 2, 5, Direction.EAST);
                        
            //Creating top of second driveway
            new Wall(nyc, 4, 2, Direction.NORTH);
            new Wall(nyc, 4, 3, Direction.NORTH);
            new Wall(nyc, 4, 4, Direction.NORTH);
            
            //create bottom of second driveway
            new Wall(nyc, 4, 2, Direction.SOUTH);
            new Wall(nyc, 4, 3, Direction.SOUTH);
            new Wall(nyc, 4, 4, Direction.SOUTH);
            
            //creating end of second driveway
             new Wall(nyc, 4, 4, Direction.EAST);
            
             //Creating bottom of third driveway
            new Wall(nyc, 8, 2, Direction.SOUTH);
            new Wall(nyc, 8, 3, Direction.SOUTH);
            new Wall(nyc, 8, 4, Direction.SOUTH);
            new Wall(nyc, 8, 5, Direction.SOUTH);
            new Wall(nyc, 8, 6, Direction.SOUTH);
            
            //creeating top of third driveway
            new Wall(nyc, 7, 2, Direction.NORTH);
            new Wall(nyc, 7, 3, Direction.NORTH);
            new Wall(nyc, 7, 4, Direction.NORTH);
            new Wall(nyc, 7, 5, Direction.NORTH);
            new Wall(nyc, 7, 6, Direction.NORTH);
            
            //Creating end of third driveway
            new Wall(nyc, 7, 6, Direction.EAST);
            new Wall(nyc, 8, 6, Direction.EAST);
            
            //creating snow on sidewalk              
            new Thing(nyc, 1,1);
            new Thing(nyc, 2,1);
            new Thing(nyc, 4,1);
            new Thing(nyc, 7,1);
            
            //creating snow on first driveway
            new Thing(nyc, 1,2);
            new Thing(nyc, 1,3);
            new Thing(nyc, 1,4);
            new Thing(nyc, 2,3);
            new Thing(nyc, 2,5);  
            
            //creating snow on second driveway   
            new Thing(nyc, 4,2);
            new Thing(nyc, 4,3);
            
            //creating snow on third driveway
            new Thing(nyc, 7,2);
            new Thing(nyc, 7,6);
            new Thing(nyc, 8,2);
            new Thing(nyc, 8,2);
            new Thing(nyc, 8,4); 
            
           
      //checking for sidewalk
      srbw.move();
    
    while (srbw.getCity() == nyc){
        //on sidewalk
      while (srbw.getAvenue()==1) 
      {
         while (!srbw.isFacingEast()){
          srbw.turnLeft();
         }
         if (srbw.frontIsClear()) {
             srbw.move();
         }
         else if(!srbw.frontIsClear()){
             while (!srbw.isFacingNorth()){
             srbw.turnLeft();
         }
       }
      }     
      while (srbw.frontIsClear()) {
          if (srbw.canPickThing()){
              srbw.pickThing();
          }
          srbw.move();
      }
      while (! srbw.frontIsClear()) {
          while (!srbw.isFacingWest()){
              srbw.turnLeft();
          }   
        }    
      }                 
    }    
}
  
   

    









    
    


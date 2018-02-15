/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Tahjeira
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // create a new city called nyc
        City nyc = new City();
        
        // create a robot
         RobotSE maria = new RobotSE(nyc, 0, 1, Direction.WEST);
        // create a second robot named srbw
        RobotSE srbw = new RobotSE(nyc, 3, 3, Direction.EAST);
        
        // place a label on maria
        maria.setLabel("M");
        
         // place a label on maria
        srbw.setLabel("S");
        
        // create walls
        new Wall(nyc, 2, 3, Direction.NORTH);
        new Wall(nyc, 3, 3, Direction.EAST);
        new Wall(nyc, 2, 3, Direction.EAST);
        new Wall(nyc, 2, 3, Direction.WEST);
        new Wall(nyc, 3, 3, Direction.SOUTH);
        
        //create expensive items
        new Thing(nyc, 0,0);
        new Thing(nyc, 1, 0);
        new Thing(nyc, 1, 1);
        new Thing(nyc, 1, 2);
        new Thing(nyc, 2, 2);

       //turn srbw
       srbw.turnLeft(2);
       
       //Move maria and srbw to each of their first items and pick it up
       maria.move(1);
       maria.pickThing();
       srbw.move(1);
       srbw.turnRight();
       srbw.move();
       srbw.pickThing();
       
       //they both move to and pick up the next item
       maria.turnLeft();
       maria.move(1);
       maria.pickThing();
       srbw.move();
       srbw.pickThing();
       
      //maria picks up final item and faces srbw and srbw turns to maria  
      maria.turnLeft();
      maria.move(1);
      maria.pickThing();
      srbw.turnLeft();
       
       
    }
    
}

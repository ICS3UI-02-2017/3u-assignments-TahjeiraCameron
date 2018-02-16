/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author camet2651
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
     City nyc = new City();
      
     // create srbw
     RobotSE srbw = new RobotSE(nyc, 1 , 1, Direction.EAST);
     
     //create things
     new Thing(nyc, 1,2);
     new Thing(nyc, 1,3);
     new Thing(nyc, 1,4);
     new Thing(nyc, 1,5);
     new Thing(nyc, 1,6);
     new Thing(nyc, 1,7);
     new Thing(nyc, 1,8);
     new Thing(nyc, 1,9);
     new Thing(nyc, 1,10);
     new Thing(nyc, 1,11);
     
     //pick up stuff if he hasn't picked up seven items yet, stopping at 7
     while(srbw.countThingsInBackpack()!= 7){
         srbw.move();
         srbw.pickThing();
    //if his backpack has 7 things move to the end of the row
    if(srbw.countThingsInBackpack() == 7){
        srbw.move(4);
    }
   
    }
     }
}
         
    


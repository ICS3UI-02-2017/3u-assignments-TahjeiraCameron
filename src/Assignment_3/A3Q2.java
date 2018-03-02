/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author camet2651
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              City nyc = new City();
        RobotSE srbw = new RobotSE(nyc, 1, 0, Direction.EAST);
        nyc.showThingCounts(true);
       
        //placing 10 things
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        new Thing(nyc,1,0);
        
        //counted while loop
        int numberOfThings = 10;
        
        //srbw picks things and moves them over until there are no longer 10 things(counter reaches 10)
        while (numberOfThings > 0) {
           srbw.pickThing();
           srbw.move();
           srbw.putThing();
           srbw.turnAround();
           srbw.move();
           srbw.turnAround();
           numberOfThings = numberOfThings- 1;
        }
        //SRBW MOVES OVER TO NEW PILE
        srbw.move();
    }
}

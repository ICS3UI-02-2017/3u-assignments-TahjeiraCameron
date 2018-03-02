/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author camet2651
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City nyc = new City();
        RobotSE srbw = new RobotSE(nyc, 1, 1, Direction.EAST, 20);

        //counted while loop

        int numberOfMovesTwo = 0;
        
        //srbw goes around the square until the counter has run out
        for (int numberOfMoves = 0; numberOfMoves < 4; numberOfMoves++) {
            
            //srbw does one row of planting
            while (numberOfMovesTwo < 4) {
                srbw.putThing();
                srbw.move();
                numberOfMovesTwo = numberOfMovesTwo + 1;
            }
            //srbw goes to the next row and resets counter
            srbw.putThing();
            srbw.turnAround();
            srbw.move(4);
            srbw.turnLeft();
            srbw.move();
            srbw.turnLeft();
            numberOfMovesTwo = 0;
        }
    }
}

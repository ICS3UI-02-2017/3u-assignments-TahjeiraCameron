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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City nyc = new City();
        RobotSE srbw = new RobotSE(nyc, 0, 2, Direction.WEST);
        
        //building square       
        new Wall(nyc, 1, 1, Direction.WEST); 
        new Wall(nyc, 1, 2, Direction.EAST); 
        new Wall(nyc, 2, 2, Direction.EAST); 
        new Wall(nyc, 2, 1, Direction.WEST); 
        new Wall(nyc, 1, 1, Direction.NORTH);
        new Wall(nyc, 1, 2, Direction.NORTH);
        new Wall(nyc, 2, 2, Direction.SOUTH);
        new Wall(nyc, 2, 1, Direction.SOUTH);
        
        //counted while loop
        int numberOfMoves = 2;
        
        //srbw goes around the square until the counter has run out
        while (numberOfMoves > 0) {
            srbw.move(2);
            srbw.turnLeft();
            srbw.move(3);
            srbw.turnLeft();
            srbw.move(3);
            srbw.turnLeft();
            srbw.move(3);
            srbw.turnLeft();
            srbw.move();
            numberOfMoves = numberOfMoves - 1;
        }
    }
}

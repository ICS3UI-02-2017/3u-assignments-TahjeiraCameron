/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 *
 * @author Tahjeira
 */
public class A2Q4 {

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

        srbw.move();
        while (srbw == srbw) {//make srbw run forever
            srbw.turnRight();
            if (srbw.frontIsClear()) {//
                srbw.move();
                while (!srbw.frontIsClear()) {
                    srbw.turnRight();
                    if (srbw.frontIsClear()) {
                        srbw.turnRight();
                        srbw.move();
                    }
                }
            }
            if (!srbw.frontIsClear()) {//if srbw turns right and theres a wall that means he is following the right path and can move
                srbw.turnLeft();
                srbw.move();
            }
        }
    }
}

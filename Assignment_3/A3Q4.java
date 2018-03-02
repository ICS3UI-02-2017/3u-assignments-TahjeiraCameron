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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City nyc = new City();
        RobotSE srbw = new RobotSE(nyc, 3, 3, Direction.SOUTH);

        //creating first square
        new Wall(nyc, 1, 1, Direction.WEST);
        new Wall(nyc, 2, 1, Direction.WEST);
        new Wall(nyc, 1, 1, Direction.NORTH);
        new Wall(nyc, 1, 2, Direction.NORTH);
        new Wall(nyc, 2, 2, Direction.EAST);
        new Wall(nyc, 1, 2, Direction.EAST);
        new Wall(nyc, 2, 1, Direction.SOUTH);
        new Wall(nyc, 2, 2, Direction.SOUTH);

        //creating second square
        new Wall(nyc, 1, 4, Direction.WEST);
        new Wall(nyc, 2, 4, Direction.WEST);
        new Wall(nyc, 1, 4, Direction.NORTH);
        new Wall(nyc, 1, 5, Direction.NORTH);
        new Wall(nyc, 2, 5, Direction.EAST);
        new Wall(nyc, 1, 5, Direction.EAST);
        new Wall(nyc, 2, 5, Direction.SOUTH);
        new Wall(nyc, 2, 4, Direction.SOUTH);

        //creating third square
        new Wall(nyc, 4, 1, Direction.WEST);
        new Wall(nyc, 5, 1, Direction.WEST);
        new Wall(nyc, 4, 1, Direction.NORTH);
        new Wall(nyc, 4, 2, Direction.NORTH);
        new Wall(nyc, 4, 2, Direction.EAST);
        new Wall(nyc, 5, 2, Direction.EAST);
        new Wall(nyc, 5, 1, Direction.SOUTH);
        new Wall(nyc, 5, 2, Direction.SOUTH);

        //creating fourth square
        new Wall(nyc, 4, 4, Direction.WEST);
        new Wall(nyc, 5, 4, Direction.WEST);
        new Wall(nyc, 4, 4, Direction.NORTH);
        new Wall(nyc, 4, 5, Direction.NORTH);
        new Wall(nyc, 4, 5, Direction.EAST);
        new Wall(nyc, 5, 5, Direction.EAST);
        new Wall(nyc, 5, 4, Direction.SOUTH);
        new Wall(nyc, 5, 5, Direction.SOUTH);

       
        for (int count = 0; count < 4; count++) {//srbw repeats actions 4 time
            //srbw moves around one square
            for (int block = 0; block < 3; block++) {
                srbw.move(3);
                srbw.turnLeft();
            }
            //srbw moves over to next square 
            srbw.move(3);
        }
    }
}

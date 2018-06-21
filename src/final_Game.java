package Assignment_Game;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author Tahjeira
 */
public class final_Game extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1200;
    static final int HEIGHT = 1000;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    //fonts
    Font levelFont = new Font("arial", Font.BOLD, 36);
    Font timerFont = new Font("calibri", Font.BOLD, 26);
    Font gameOverFont = new Font("Lucida Console", Font.PLAIN, 100);
    Font titleFont = new Font(Font.MONOSPACED, Font.BOLD, 95);
    Font startGameFont = new Font("Lucida Console", Font.PLAIN, 60);
    Font instruction = new Font("Lucida Console", Font.ITALIC, 20);
    //colours
    Color sky = new Color(135, 204, 255);
    //mouse coordinates
    int mouseX = 0;
    int mouseY = 0;
    // create Random number
    Random rand = new Random();
    //create ground and boolean to create it
    Rectangle ground = new Rectangle(0, 850, WIDTH, 150);
    boolean drawGround = false;
    //starting and ending game
    boolean gameOver = false;// only draw ending screen when player dies
    boolean startGame = true;//start player on starting screen
    // interactive game over  boxes
    Rectangle yesBox = new Rectangle(490, 530, 100, 100);
    Rectangle noBox = new Rectangle(680, 530, 100, 100);
    //player coordinates, player,and player speed
    Rectangle player = new Rectangle(600, 100, 40, 40);
    boolean moveLeft = false;
    boolean moveRight = false;
    int speed = 7;
    int parachuteSpeed = speed / 2;
    //create parachute at player poistion
    int parachuteY = player.y;
    Rectangle parachute = new Rectangle(player.x - 6, parachuteY, 60, 10);
    int parachuteTime = 0;
    int wait = 0;
    int timeLeft = 10;
    boolean penalty = false;
    //moving parachute variables
    boolean parachuteClosed = true;
    boolean parachuteOpen = false;
    //create 9 cloud bottom rectangles and top rectangles
    boolean drawCloud = true;
    boolean cloudsGenerated = false;
    Rectangle[] cloudsTop = new Rectangle[9];
    Rectangle[] cloudsBottom = new Rectangle[9];
    Rectangle topCloud = new Rectangle(10, 50, 70, 50);
    Rectangle bottomCloud = new Rectangle(20, 30, 110, 50);
    //randomly generate cloud position
    int cloudX = rand.nextInt((850 - 700)) + 700;
    int cloudY = rand.nextInt((850 - 700)) + 700;
    int cloudWidth = rand.nextInt((100 - 30)) + 30;
    int minX = 30;
    int minY = 0;
    int maxX = 310;
    int maxY = 240;
    int[] random = new int[9];
    int numberOfClouds = rand.nextInt(10);
    //create boolean to shoot and generate bullets when needed 
    boolean bulletShoot = false;
    boolean bulletGen = false;
    //create arraylist for bullets. birds, and skydivers
    List<bullet> firedBullets = new ArrayList<>();
    List<birds> birdsFlying = new ArrayList<>();
    List<skydivers> skyDivers = new ArrayList<>();
    //set speed of bullet, skydivers, and birds relative to player
    int bulletSpeed = speed + 3;
    int skyDiverSpeed = speed;
    int birdSpeed = speed + 1;
    int randomBirdSize;
    //create points and level
    int points = 0;
    int level = 0;
    //create false rectangle for enemies to intersect with player
    Rectangle fakeSkyDiver = new Rectangle(0, 0, 0, 0);
    Rectangle fakeBird = new Rectangle(0, 0, 0, 0);

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public final_Game() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);
        preSetup();

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        //set background
        g.setColor(sky);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //starting screen
        if (startGame) {
            g.setColor(Color.red);
            g.setFont(titleFont);
            g.drawString("Welcome to Sky Diver", 0, 190);
            g.setFont(startGameFont);
            g.setColor(Color.white);
            g.drawString("Press S to start the game", 110, 300);
            //tell user instructions
            g.setFont(instruction);
            g.drawString("Press 1 to open your parachute and slow down", 110, 350);
            g.drawString("Press 2 to close your parachute ", 110, 400);
            g.drawString("Press spacebar to shoot bullets", 110, 450);
            g.drawString("Avoid hitting the skydivers with bullets or touching them", 110, 500);
            g.drawString("Try to shoot the birds but avoid touching them", 110, 550);
            //draw example skydiver and bird with label
            g.setColor(Color.GREEN);
            g.fillRect(900, 475, 35, 35);
            g.drawString("Skydiver", 950, 500);
            g.setColor(Color.YELLOW);
            g.fillRect(900, 525, 25, 25);
            g.drawString("Bird", 950, 550);

        }
        //playing screen
        if (startGame == false) {
            //draw current level and points
            g.setColor(Color.BLACK);
            g.setFont(levelFont);
            g.drawString("Level", WIDTH / 2 - 32, 50);
            g.drawString("" + level, WIDTH / 2, 90);
            g.drawString("Score", 70, 50);
            g.drawString("" + points, 100, 100);
            //draw bullets, birds, and skydivers that are currently active
            for (int i = 0; i < firedBullets.size(); i++) {
                bullet bullet = firedBullets.get(i);
                bullet.bulletDraw(g, bullet.x + player.width / 2, bullet.y + player.height);
            }
            for (int i = 0; i < birdsFlying.size(); i++) {
                birds bird = birdsFlying.get(i);
                bird.drawBird(g, bird.x, bird.y, bird.width, bird.height);
            }
            for (int i = 0; i < skyDivers.size(); i++) {
                skydivers skyDiver = skyDivers.get(i);
                skyDiver.drawDiver(g, skyDiver.x, skyDiver.y, skyDiver.width, skyDiver.height);
            }
            //draw player
            g.setColor(Color.black);
            g.fillRect(player.x, player.y, player.width, player.height);
            if (parachuteOpen) {
                //draw parachute when open
                g.setColor(Color.RED);
                g.fillRect(player.x - 7, player.y, parachute.width, parachute.height);
                //tell user time left on parachute
                g.setColor(Color.BLACK);
                g.setFont(timerFont);
                g.drawString("Your parachute can stay open for " + timeLeft + " seconds", 10, 950);
            }
            //if clouds should be on screen, draw them
            if (drawCloud) {
                g.setColor(Color.LIGHT_GRAY);
                if (!cloudsGenerated) {
                    cloudGenerator();
                }
                //draw random number of clouds in their assigned grid space, only draw circles ontop of the rectangles generated below
                for (int i = 0; i < numberOfClouds; i++) {
                    g.fillOval((cloudsTop[random[i]].x - 20), (cloudsTop[random[i]].y + 30), 50, 50);
                    g.fillOval(cloudsTop[random[i]].x, cloudsTop[random[i]].y, 70, 70);
                    g.fillOval((cloudsTop[random[i]].x + 40), (cloudsTop[random[i]].y + 30), 50, 50);
                }
                for (int i = 0; i < numberOfClouds; i++) {// if player hits cloud turn screen white
                    if (player.intersects(cloudsTop[random[i]]) || player.intersects(cloudsBottom[random[i]])) {
                        g.setColor(Color.WHITE);
                        g.fillRect(0, 0, WIDTH, HEIGHT);
                    }
                }
            }
            if (drawGround) {//if player has been hit draw dying screen
                g.setColor(sky);//draw over current screen
                g.fillRect(0, 0, WIDTH, HEIGHT);
                g.setColor(Color.black);
                g.fillRect(player.x, player.y, player.width, player.height);
                g.setColor(Color.green);
                g.fillRect(ground.x, ground.y, ground.width, ground.height);
            }
            if (gameOver) {//draw game over screen with options to restart or quit
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, WIDTH, HEIGHT);
                g.setColor(Color.red);
                g.setFont(gameOverFont);
                g.drawString("GAME OVER", 370, 190);
                g.setColor(Color.white);
                g.drawString("PLAY AGAIN?", 300, 400);
                g.drawString("YES", 250, 600);
                g.drawString("NO", 860, 600);
                g.fillRect(yesBox.x, yesBox.y, yesBox.width, yesBox.height);
                g.fillRect(noBox.x, noBox.y, noBox.width, noBox.height);
                if (yesBox.contains(mouseX, mouseY)) {
                    gameOver = false;
                    reset();
                }
                if (noBox.contains(mouseX, mouseY)) {
                    System.exit(0);
                }
            }
        }
    }

    // GAME DRAWING ENDS HERE
// This method is used to do any pre-setup you might need to do
// This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void gameLoop() {
        if (!startGame || gameOver) {
            movePlayer();
            moveEnemies();
            shootBullet();
            intersection();
            removeObjects();
            checkPlayerLocation();
        }
    }

    private void cloudGenerator() {
        minX = 30;
        minY = 0;
        maxX = 310;
        maxY = 240;
        for (int i = 0; i < 9; i++) {//generate all clouds 
            cloudX = rand.nextInt(maxX - minX) + minX;
            cloudY = rand.nextInt((maxY - minY)) + minY;
            cloudsTop[i] = new Rectangle(cloudX, cloudY, 70, 50);
            cloudsBottom[i] = new Rectangle(cloudX + 10, cloudY - 20, 110, 50);
            //seperate each cloud into a "grid" by moving random number generator range
            minX = maxX + 153;
            maxX = minX + 270;
            if (i == 2 || i == 5) {
                minY = maxY + 130;
                maxY = minY + 200;
                minX = 0;
                maxX = 290;
            }
        }
        cloudsGenerated = true;

    }

    private void movePlayer() {
        //move player down    
        if (drawGround) {
            parachuteClosed = true;
            parachuteOpen = false;
        }
        if (parachuteClosed) {
            bulletSpeed = speed + 3;

            if (drawGround) {//if player has been hit make them fall to the ground faster at their current position
                player.y = player.y + (speed + 5);
                moveLeft = false;
                moveRight = false;
            }
            player.y = player.y + speed;
            if (moveLeft) {
                player.x = player.x - speed;
            }
            if (moveRight) {
                player.x = player.x + speed;
            }
            if (penalty == false) {
                parachuteTime = 0;
            }
            if (wait != 0) {
                wait--;
                if (wait == 0) {
                    parachuteTime = 0;
                }
            }
        }
        //slow down player when parachute opens
        if (parachuteOpen) {
            //set enemy and bullet speed relative to parachute speed
            bulletSpeed = parachuteSpeed + 3;

            player.y = player.y + parachuteSpeed;
            //if player presses left or right key move accordingly
            if (moveLeft) {
                player.x = player.x - parachuteSpeed;
            }
            if (moveRight) {
                player.x = player.x + parachuteSpeed;
            }
            //check how long parachute has been used for
            parachuteTime++;
            //close parachute once time is up and set a reset timer
            if (parachuteTime % 20 == 0) {
                timeLeft--;
            }
            if (parachuteTime == 200 || timeLeft == 0) {
                parachuteOpen = false;
                parachuteClosed = true;
                penalty = true;
                wait = 80;
                timeLeft = 10;
            }
        }
    }

    private void moveEnemies() {
        for (int i = 0; i < birdsFlying.size(); i++) {//go through each bird and move them
            birds bird = birdsFlying.get(i);
            bird.move(birdSpeed);
        }
        for (int i = 0; i < skyDivers.size(); i++) {// go through each skydiver and move them
            skydivers skyDiver = skyDivers.get(i);
            skyDiver.move(skyDiverSpeed);
        }

    }

    private void shootBullet() {
        if (bulletShoot) {//if spacebar has been pressed
            for (int i = 0; i < firedBullets.size(); i++) {//go through all active bullets including newly created one and shoot them
                bullet activeBullet = firedBullets.get(i);
                activeBullet.shoot(bulletSpeed);
            }
        }
    }

    private void intersection() {
        for (int i = 0; i < birdsFlying.size(); i++) {//go through all active birds
            birds birdCurrent = birdsFlying.get(i);
            fakeBird = new Rectangle(birdCurrent.x, birdCurrent.y, birdCurrent.width, birdCurrent.height);//create rectangle object at bird position for each bird
            if (player.intersects(fakeBird)) {// check to see if player hits bird, if they do draw ground
                drawGround = true;
            }
            for (int j = 0; j < firedBullets.size(); j++) {// go through active bullets
                bullet bulletCurrent = firedBullets.get(j);
                Rectangle fakeBullet = new Rectangle(bulletCurrent.x, bulletCurrent.y, 5, 5);// create rectangle object at bullet position
                if (fakeBullet.intersects(fakeBird)) {// if player shoots bird increase points and remove bird and bullet
                    birdsFlying.remove(i);
                    firedBullets.remove(j);
                    points++;
                }
            }
        }

        for (int i = 0; i < skyDivers.size(); i++) {
            {// go through active skyDivers
                skydivers skyDiverCurrent = skyDivers.get(i);
                fakeSkyDiver = new Rectangle(skyDiverCurrent.x, skyDiverCurrent.y, skyDiverCurrent.width, skyDiverCurrent.height);//// create rectangle object at current skydiver position
                if (player.intersects(fakeSkyDiver)) {// if player hits sky diver draw ground 
                    drawGround = true;
                }
                for (int j = 0; j < firedBullets.size(); j++) {// go through all active bullets and make rectangle at its position
                    bullet bulletCurrent = firedBullets.get(j);
                    Rectangle fakeBullet = new Rectangle(bulletCurrent.x, bulletCurrent.y, 5, 5);
                    if (fakeBullet.intersects(fakeSkyDiver)) {//if bullet hits skydiver draw ground and remove skydiver and bullet
                        skyDivers.remove(i);
                        firedBullets.remove(j);
                        drawGround = true;
                    }
                }

            }
            if (drawGround) {// if player has hit bird or skydiver 
                if (player.intersects(ground)) {// if player hits ground end game
                    gameOver = true;
                }
            }
        }
    }

    private void checkPlayerLocation() {
        //when player falls of screen bring them back and increase level
        if (player.y > 1000) {
            player.y = 0;
            level++;
            nextLevel();
        }
        if (player.x > 1200) {//if player goes off right screen put them back at left side
            player.x = -2;
        }
        if (player.x < 0) {//if player goes off left side of screen bring them back on right side
            player.x = WIDTH - player.width;
        }
    }

    private void nextLevel() {
        cloudsGenerated = false;//regenerate clouds every level
        numberOfClouds = rand.nextInt(10);
        for (int i = 0; i < numberOfClouds; i++) {
            random[i] = rand.nextInt(6);
        }
        drawCloud = true;
        for (int i = 0; i < rand.nextInt((8 - 2)) + 2; i++) {
            randomBirdSize = rand.nextInt((50 - 20)) + 20;
            System.out.println(randomBirdSize);
            birdsFlying.add(new birds(0, rand.nextInt((1100 - 20)) + 20, randomBirdSize, randomBirdSize, 4));
        }
        for (int i = 0; i < rand.nextInt((5 - 1)) + 1; i++) {
            skyDivers.add(new skydivers(1200, rand.nextInt((1200 - 50)) + 50, 35, 35, skyDiverSpeed));
        }
        if (level % 5 == 0 && level != 0) //increase speed of player, bullets, and enemies  every 5th level
        {
            bulletSpeed = speed + 3;
            skyDiverSpeed = speed;
            birdSpeed = speed + 1;
            speed = speed + 2;
        }
    }

    private void reset() {
        //reset all variables to starting state/generate new state and empty any array lists
        level = 0;
        speed = 7;
        parachuteSpeed = (speed / 2);
        parachuteTime = 0;
        wait = 0;
        timeLeft = 10;
        penalty = false;
        player.x = 600;
        player.y = 100;
        drawGround = false;
        mouseX = 0;
        mouseY = 0;
        numberOfClouds = rand.nextInt(10);
        bulletSpeed = speed + 3;
        skyDiverSpeed = speed;
        birdSpeed = speed + 1;
        for (int i = 0; i < numberOfClouds; i++) {
            random[i] = rand.nextInt(6);
        }
        drawCloud = true;
        for (int i = 0; i < firedBullets.size(); i++) {
            firedBullets.remove(i);
        }
        for (int i = 0; i < birdsFlying.size(); i++) {
            birdsFlying.remove(i);
        }
        for (int i = 0; i < skyDivers.size(); i++) {
            skyDivers.remove(i);
        }
        if (!skyDivers.isEmpty() || !firedBullets.isEmpty() || !birdsFlying.isEmpty()) {//make sure all array lists are empty
            reset();
        }
        points = 0;
    }

    private void removeObjects() {
        for (int i = 0; i < firedBullets.size(); i++) {//remove bullet when off screen
            if (firedBullets.get(i).y > 1200) {
                firedBullets.remove(i);
            }
        }
        for (int i = 0; i < birdsFlying.size(); i++) {//remove bird when off screen
            if (birdsFlying.get(i).x > 1300) {
                birdsFlying.remove(i);
            }
        }
        for (int i = 0; i < skyDivers.size(); i++) {//remove skyDiver when off screen
            if (skyDivers.get(i).x < 0) {
                skyDivers.remove(i);
            }
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
            if (gameOver) {//get position of mouse when needed i.e start and end screen
                mouseX = e.getX();
                mouseY = e.getY();
            }
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

// Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_S) {//create and fire bullet when space is pressed
                startGame = false;
            }
            if (keyCode == KeyEvent.VK_1) {//if parachute is available open it 
                if (wait == 0) {
                    parachuteOpen = true;
                    parachuteClosed = false;
                }
            }
            if (keyCode == KeyEvent.VK_2) {//close parachute when 2 is pressed
                parachuteOpen = false;
                parachuteClosed = true;
            }
            //move corresponding direction to key pressed down
            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft = true;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                moveRight = true;
            }
            if (keyCode == KeyEvent.VK_SPACE) {//create and fire bullet when space is pressed
                firedBullets.add(new bullet(player.x, player.y, 10));
                bulletShoot = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            //only move in either direction when key is pressed down
            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft = false;
            }
            if (keyCode == KeyEvent.VK_RIGHT) {
                moveRight = false;
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        final_Game game = new final_Game();
    }
}

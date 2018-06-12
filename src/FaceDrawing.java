package Assignment_8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author camet2651
 */
public class FaceDrawing extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
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
    Color peach = new Color(250, 221, 197);
    Color brown = new Color(139, 69, 19);
    Color blue = new Color(25, 25, 112);
    //animation variables
    int eyebrow2Y = 220;
    int eyebrow1Y = 220;
    int tooth1Y = 287;
    int tooth2Y = 304;
    int mouthW = 40;
    int mouthH = 30;
    Color tooth2 = new Color(255, 255, 255);
    int eye1H = 2;
    int eye2H = 2;
    int eye1Y = 245;
    int eye2Y = 245;
    int eyeball1X = 385;
    int eyeball2X = 420;
    int eyeball1Y = 245;
    int eyeball2Y = 245;
    int ear1Y = 220;
    int ear2Y = 220;
    boolean up = true;
    boolean down = false;
    Color eyeball = new Color(255, 255, 255);
    Color green = new Color(80, 200, 100);
    Color white = new Color(255, 255, 255);
    boolean eyesOpen = false;
    int tooth1X = 405;
    int tooth2X = 405;
    boolean clicked = false;
    boolean pressed = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FaceDrawing() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

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
        Graphics2D g2d = (Graphics2D) g;

        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //background
        g.setColor(blue);
        g.fillRect(0, 0, 800, 600);

        //face
        g.setColor(peach);
        g.fillOval(300, 100, 225, 260);

        //ears
        g.fillOval(280, ear1Y, 30, 40);
        g.fillOval(515, ear2Y, 30, 40);

        //chin
        g.fillOval(360, 230, 100, 140);

        //mouth
        g.setColor(Color.pink);
        g.fillOval(390, 285, mouthW, mouthH);

        //teeth
        g.setColor(Color.WHITE);
        g.fillRect(tooth1X, tooth1Y, 10, 10);
        g.setColor(tooth2);
        g.fillRect(tooth2X, tooth2Y, 10, 10);

        //glasses
        //earpiece1
        g2d.rotate(Math.toRadians(-10));
        g.setColor(Color.BLACK);
        g.fillRect(395, 320, 45, 5);
        g2d.rotate(Math.toRadians(10));
        //nose piece
        g.setColor(Color.BLACK);
        g.fillRect(400, 245, 20, 4);
        //lenses
        g.setColor(Color.WHITE);
        g.fillRoundRect(370, 235, 35, 25, 9, 5);
        g.fillRoundRect(410, 235, 35, 25, 9, 5);

        //nose
        g.setColor(Color.BLACK);
        g.fillOval(400, 270, 10, 10);
        g.fillOval(415, 270, 10, 10);

        //eyebrows
        g.setColor(brown);
        g.fillRect(380, eyebrow1Y, 25, 5);
        g.fillRect(415, eyebrow2Y, 25, 5);

        //eyes
        g.setColor(Color.BLACK);
        g.fillRect(380, eye1Y, 20, eye1H);
        g.fillRect(418, eye2Y, 20, eye2H);
        g.setColor(Color.WHITE);
        //eyeballs
        g.setColor(eyeball);
        g.fillOval(eyeball1X, eyeball1Y, 10, 12);
        g.fillOval(eyeball2X, eyeball2Y, 10, 12);

        //instructions
        g.drawString("O --> opens eyes", 30, 100);
        g.drawString("C --> closes eyes", 30, 150);
        g.drawString("Moving mouse --> eyes follow", 30, 200);
        g.drawString("Up arrow --> raises right eyebrow", 30, 250);
        g.drawString("Down arrow --> lowers right eyebrow", 30, 300);
        g.drawString("W --> raises left eyebrow", 30, 350);
        g.drawString("S --> lowers left eyebrow", 30, 400);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        if (up) {
            ear1Y--;
            ear2Y--;
            if (ear1Y == 190) {
                down = true;
                up = false;
            }
        }

        if (down) {
            ear1Y++;
            ear2Y++;
            if (ear1Y == 250) {
                down = false;
                up = true;

            }
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            System.out.println("wheel");
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            int mouseX = e.getX();
            int mouseY = e.getY();

            if (eyesOpen == true) {
                //top left
                if (mouseX <= 385) {
                    System.out.println("385");
                }
                if (mouseX >= 390) {
                    System.out.println("390");
                }
                if (mouseX <= 385 && mouseY <= 245 && mouseY > 207) {
                    eyeball1X = 380;
                    eyeball1Y = 240;
                    eyeball2X = 417;
                    eyeball2Y = 240;
                }
                //bottom left
                if (mouseX <= 385 && mouseY >= 257) {
                    eyeball1X = 380;
                    eyeball1Y = 245;
                    eyeball2X = 417;
                    eyeball2Y = 245;
                }
                //top middle
                if (mouseX >= 390 && mouseX <= 410 && mouseY > 207) {
                    eyeball1X = 385;
                    eyeball1Y = 240;
                    eyeball2X = 420;
                    eyeball2Y = 240;
                }
                //bottom middle
                if (mouseX >= 390 && mouseX <= 410 && mouseY >= 267) {
                    eyeball1X = 385;
                    eyeball1Y = 245;
                    eyeball2X = 420;
                    eyeball2Y = 245;
                }
                //top right
                if (mouseX > 410 && mouseY <= 245 && mouseY > 207) {
                    eyeball1X = 390;
                    eyeball1Y = 240;
                    eyeball2X = 425;
                    eyeball2Y = 240;
                }
                //bottom right
                if (mouseX > 410 && mouseY >= 257) {
                    eyeball1X = 390;
                    eyeball1Y = 245;
                    eyeball2X = 425;
                    eyeball2Y = 245;
                }

            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            //right eyebrow moves up
            if (keyCode == KeyEvent.VK_UP && eyebrow2Y > 190) {
                eyebrow2Y--;
            }
            //left eyebrow up
            if (keyCode == KeyEvent.VK_W && eyebrow1Y > 190) {
                eyebrow1Y--;
            }
            //right eyebrow down
            if (keyCode == KeyEvent.VK_DOWN && eyebrow2Y < 220) {
                eyebrow2Y = eyebrow2Y++;
            }
            //left eyebrow down
            if (keyCode == KeyEvent.VK_S && eyebrow1Y < 220) {
                eyebrow1Y++;
            }

            //open eyes
            if (keyCode == KeyEvent.VK_O && eyesOpen == false) {
                eye1H = eye1H + 13;
                eye1Y = eye1Y - 4;
                eye2H = eye2H + 13;
                eye2Y = eye2Y - 4;
                eyeball = green;
                eyesOpen = true;
            }

            if (keyCode == KeyEvent.VK_C && eyesOpen == true) {
                eye1H = eye1H - 13;
                eye1Y = eye1Y + 4;
                eye2H = eye2H - 13;
                eye2Y = eye2Y + 4;
                eyeball = white;
                eyesOpen = false;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FaceDrawing game = new FaceDrawing();
    }
}

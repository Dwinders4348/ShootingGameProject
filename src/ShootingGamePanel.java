import javax.swing.*;
import java.awt.*;
import java.util.Random;


/**
 * @author Damion Winders
 * This is the panel and
 * logic for my game, Blitz
 */
public class ShootingGamePanel extends JPanel {

    //fields------------------------------
    int WIDTH = 1000;
    int HEIGHT = 1000;
   
    //Size of player's ship
    int SHIP_WIDTH = 35;
    int SHIP_HEIGHT = 35;
   
    //Coordinate of ship's starting postion
    int shipX = 500;
    int shipY = 400;
   
    //Random class for determining where
    //a bit (avoidable object) appears 
    Random rand = new Random();
    Random randSet = new Random();
    int set = 1;
   
    //Sets position for first bit
    int bitX = 500;
    int bitY = -1;

    //Counts number of bits dodged 
    int score = 0;

    //sets bit speed
    int bitSpeed = 1;
    int delay = 500;
    int increment = 1;

    //determines whether the player has been hit
    boolean hit = false;
    
   
   
    //constructor---------------------------
    public ShootingGamePanel(){
        setSize(WIDTH, HEIGHT);
        
    }
       

    //methods--------------------------------
    public void end(){

        hit = true;
        repaint();
        System.out.println("Score: " + score);
        System.out.println("Game Over\nRestart app to try again");
        

    }


    /**
     * Runs the program
     * @throws InterruptedException
     */
    public void run() throws InterruptedException {
       
        

        //Loops during run
        //selects next bit start location
        //Moves bit across the screen
        //delays bit for a halfsecond at 100 Y coord 
        while(true){
            
            //ends loop if player is hit
            if(hit){
                break;
            }

            //selects a number to determine if 
            //bit comes from above or beside player
            if(bitX <= 1 || bitY >= 999){
                set = randSet.nextInt(2);
            }

            //sets bit to come vertically
            //selects next bit location
            if(set == 0) {
                
                if(bitY >= 999 || bitX <= 1){
                    bitX = rand.nextInt(200) + 400;
                    bitY = 0;
                    score++;

                }
                
                //moves y value of bit
                bitY += increment;

                //checks to see if ship makes contact with bit
                //if true, triggers end method
                if(bitY > shipY && bitY < shipY + SHIP_HEIGHT && bitX < shipX + SHIP_WIDTH && bitX > shipX){
                    end();
                }

                //Delays bit for a moment
                //duration depends on score
                if(bitY == 100){
                    try{
                            Thread.sleep(delay);
                        } catch(InterruptedException e) {
                            ;
                        } 
                }

                //Adds delay for animation
                //indirectly changes bit speed
                try{
                    Thread.sleep(bitSpeed);
                } catch(InterruptedException e) {
                    ;
                } 
                repaint();
            }

            //sets bit to come horizontally
            //selects next bit location
            if(set == 1){
                if(bitX <= 1 || bitY >= 999){
                    bitX = 1000;
                    bitY = rand.nextInt(200) + 330;
                    score++;
                }
                
            //delays bit for a moment
            //duration depends on score
            if(bitX < 1100){
                if(bitX == 900) {
                    try{
                            Thread.sleep(delay);
                        } catch(InterruptedException e) {
                            ;
                        } 
                }
               
            }

            //moves bit x axis
            bitX -= increment;

            //checks to see if ship makes contact with bit
            //if true, triggers end method
            if(bitY > shipY && bitY < shipY + SHIP_HEIGHT && bitX < shipX + SHIP_WIDTH && bitX > shipX){
                end();
            }

            try{
                Thread.sleep(bitSpeed);
            } catch(InterruptedException e) {
                ; 
            } 
                repaint();
            }
            


        }


       
    
        

       
       
       
       
       
       
       
    }
    /*
     * Draws player and bits
     * sets background color
     * changes background color 
     * depending on score
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            
        //Set background color 
        //and bit speed
        //depending on score
        if(score < 10){
            bitSpeed = 2;
            setBackground(Color.BLUE);
        } else if (score < 15){
            bitSpeed = 1;
            setBackground(Color.DARK_GRAY); 
        } else {
            bitSpeed = 1;
            delay = 50;
            increment = 5;
            setBackground(Color.BLACK);
        }
        if(hit){
            setBackground(Color.RED);
            
        }
            g.setColor(Color.WHITE);
            g.fillOval(shipX, shipY, (SHIP_WIDTH), (SHIP_HEIGHT));
            g.drawRect(403, 325, 200, 200);  
            g.fillRect(bitX, bitY, 10, 10);
    }
   
        
   
}

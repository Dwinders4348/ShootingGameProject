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
    int SHIP_WIDTH = 20;
    int SHIP_HEIGHT = 25;
   
    //Coordinate of ship's starting postion
    int shipX = 500;
    int shipY = 400;
   
    //Random class for determining where
    //a bit (avoidable object) appears 
    Random rand = new Random();
    Random randSet = new Random();
   
    //Sets position for first bit
    int bitX = 500;
    int bitY = -1;

    //Counts number of bits dodged 
    int score = 0;

    //sets bit speed
    int bitSpeed = 1;
    
   
   
    //constructor---------------------------
    public ShootingGamePanel(){
        setSize(WIDTH, HEIGHT);
        
    }
       

    //methods--------------------------------
    public void end(){


    }


    /**
     * Runs the program
     * @throws InterruptedException
     */
    public void run() throws InterruptedException {
       
        

        //Loops during run
        //selects next bit location
        //Moves bit across the screen
        //delays bit for a halfsecond at 100 Y coord 
        while(true){
            int set = randSet.nextInt(2);
            if(set == 0){

                if(bitY > 999){
                    bitX = rand.nextInt(200) + 400;
                    bitY = -1;
                    score++;

                }


                if(bitY < 1000){
                    if(bitY == 100){
                        try{
                                Thread.sleep(500);
                            } catch(InterruptedException e) {
                                ;
                            } 
                    }
                    bitY++;
                }
            


                try{
                Thread.sleep(bitSpeed);
                } catch(InterruptedException e) {
                    ;
                } 
                repaint();
            }

            if(set == 1){
                bitX = 1001;
                bitY = rand.nextInt(200) + 400;
                score++;

                
                if(bitX < 1100){
                    if(bitX == 900) {
                        try{
                                Thread.sleep(500);
                            } catch(InterruptedException e) {
                                ;
                            } 
                    }
                    bitX--;
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
     *          * sets background color
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
        } else{
            bitSpeed = 1;
            setBackground(Color.BLACK);
        }
        g.setColor(Color.WHITE);
        g.drawLine(shipX, shipY, (shipX + SHIP_WIDTH), (shipY + SHIP_HEIGHT));
        g.drawLine((shipX), (shipY), (shipX - SHIP_WIDTH), shipY + SHIP_HEIGHT);
        g.drawLine((shipX - SHIP_WIDTH), (shipY + SHIP_HEIGHT), (shipX + SHIP_WIDTH), shipY + SHIP_HEIGHT);
        g.drawRect(400, 325, 200, 200);  
        g.fillRect(bitX, bitY, 10, 10);

            
            



            

        }
   
        
   
}

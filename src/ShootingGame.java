import javax.swing.*;
import java.awt.*;
public class ShootingGame {

    public static void main(String[] args) {
   
        //Top level frame
        //Set size, title, and closing operation
        JFrame frame = new JFrame("Replace this title");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        ShootingGamePanel panel = new ShootingGamePanel();
       
       
        //Add listeners for mouse and/or keyboard inputs
        //panel.add(mListener);
       
       
        frame.add(panel);
        frame.setVisible(true);
       
        //try {
          //  frame.run();
        //} catch (interruptedException e) {;}
       
        /*Save high score to a file named HighScores, check if score is highest score by
         *readingHighScores file.
        */
       
       
           
    }


}
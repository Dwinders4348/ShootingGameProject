import javax.swing.*;
/**
 * @Author Damion Winders
 * Creates JPanel for Bits Blitz game
 */
public class ShootingGame {




/**
 * Creates frame and panel
 * assigns listeners
 * adds everything to proper
 * container
 * @param args
 */
public static void main(String[] args) {
   
  //Top level frame
  //Set size, title, and closing operation
  JFrame frame = new JFrame("Bit Blitz");
  frame.setSize(1000, 800);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
  //creates panel and sets it focusable
  ShootingGamePanel panel = new ShootingGamePanel();
  panel.setFocusable(true);
  panel.requestFocusInWindow();

  //creates a listener for the panel
  myKeyListener kListener = new myKeyListener(panel);
      
  //Add listener for keyboard inputs
  panel.addKeyListener(kListener);

  //add panel to frame
  frame.add(panel);
  frame.setVisible(true);


  //Runs application and catches exception
  try {
    panel.run();
  } catch (InterruptedException e) {;}
       
  /*Save high score to a file named HighScores, check if score is highest score by
  *readingHighScores file.
  */
       
       
           
    }


}
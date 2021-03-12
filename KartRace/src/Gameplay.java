import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.*;

public class Gameplay extends JPanel implements KeyListener, ActionListener
   {
   //variables for the game
   private boolean play = false;
   private Timer timer;
   private ImageIcon raceTrack;
   private int delay = 1000/30;
   private Kart kart;
         //Game constructor
       public Gameplay() 
       {
       raceTrack = new ImageIcon( getClass().getResource("racetrack" + ".PNG" ) );

         kart = new Kart();
         addKeyListener(this);   
         setFocusable(true);
         setFocusTraversalKeysEnabled(false);
         timer = new Timer(delay, this);
         timer.start();
         add(kart);
        
        
  
         
       }
 
         public void paintComponent( Graphics g )
   {
      super.paintComponent( g ); // call superclass paintComponent
 
      raceTrack.paintIcon( this, g, 0, 0);
      //This line of code below is to test if the array is populated
   //  kart.kartArray()[kart.getImageInt()].paintIcon(this, g, kart.getX(),getY());
     
   } //end of paintComponent 
   
    public void actionPerformed(ActionEvent e)
     {
         //ActionListener
                  repaint();
     }
    
  
     
   public void keyPressed(KeyEvent e) 
   {
      switch(e.getKeyCode()) 
      {
         case KeyEvent.VK_UP:
            kart.addVelocity();
            break;
         case KeyEvent.VK_DOWN:
            kart.subVelocity();
            break;
         case KeyEvent.VK_LEFT:
            kart.leftTurn();
         
            break;
         case KeyEvent.VK_RIGHT:
            kart.rightTurn();
            break;
      }
       
   }
     public void keyTyped(KeyEvent e)
     {
      //KeyListener
     }

     public void keyReleased(KeyEvent e)
     {
      //KeyListiner
     }

 }
   
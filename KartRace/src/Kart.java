import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;



public class Kart extends JPanel implements ActionListener
{
   public static int image=0;
   public int x=0, y=0, velocity, width, height;
   private int maxspeed = 3;
   public ImageIcon kartImages[];
   private Timer timer;
   
   //CONSTRUCTOR
   public Kart()
   {
      timer = new Timer(1000/30, this);
      timer.start();
      velocity = 0;
      kartImages = new ImageIcon[ 16 ];
         for ( int count = 0; count < kartImages.length; count++ )
         {
            kartImages[ count ] = new ImageIcon( getClass().getResource("Car/Car" + (count+1) + ".PNG" ) );
            width = kartImages[ count ].getIconWidth(); // get icon width
            height = kartImages[ count ].getIconHeight(); // get icon height
         }
         
   }
 //  Paint component, THIS PAINTS THE CAR
     //  public void paintComponent( Graphics g )
  // {
 //   super.paintComponent( g );
     // kartImages[ image ].paintIcon(this, g, x, y);
      // call superclass paintComponent
   // } //end of paintComponent 
   

   //METHODS THAT GET AND SET VALUES
   //Get x value of Kart
   public int getImageInt()
   {
   return image;
   }
   public ImageIcon[] kartArray()
   {
    return kartImages;
   }
   public int getX()
   {
      return this.x;
   }
   public int getY()
   {
   return this.y;
   }
   //Selects specific image that should be displayed
   public void selectImage(int img)
   {
      this.image = img;
   }
   //speed up the kart
   public void addVelocity()
   {
      if(velocity < 3)
         this.velocity = this.velocity + 1;
   }//End of addVelocity method
   
   //slow down
   public void subVelocity()
   {
      if(this.velocity > 0)
         this.velocity = this.velocity - 1;
   }//end of subVelocity Method
   
   //turm kart left method
   public void leftTurn()
   {
      if(this.image == 0 || this.image < 0)
      {
         this.image = 15;
      }else
      {
         this.image = this.image - 1;
      }  
   }//end of left turn method
   
   //turn kart righ tmethod
   public void rightTurn()
   {
      if(this.image == 15 || this.image > 15)
      {
         this.image = 0;
      }else
      {
         this.image = this.image + 1;
      } 
   
   }//end of rightturn method


 public void actionPerformed( ActionEvent actionEvent )
   {
      if(this.y < 90){
         velocity = 0;
         this.y = 91;}
      
      if(this.y > 550){
         velocity = 0;
         y = 549;}
      if(this.x < 30){
         velocity = 0;
         this.x = 31;}
      if(this.x > 759){
         velocity = 0;
         x=758;}
      
      if(image == 0){
         this.y = y - 2 * velocity;}
      
      if(image == 1){
         this.x = x+1*velocity;
         this.y = y - 2 * velocity;}
     
      if(image == 2){
         this.x = x+2*velocity;
         this.y = y - 2 * velocity;}
    
      if(image == 3){
         this.x = x+2*velocity;
         this.y = y - 1* velocity;}
   
      if(image == 14){
         this.x = x-2*velocity;
         this.y = y-2* velocity;}
   
      if(image == 15){
         this.x = x-1*velocity;
         this.y = y-2* velocity;}
     
   
      if(image == 4){
         this.x = x+2*velocity;}
     
      if(image == 5){
         this.x = x+2*velocity;
         this.y = y+1 * velocity;}
    
      if(image == 6){
         this.x = x+2*velocity;
         this.y = y + 2* velocity;}
   
      if(image == 7){
         this.x = x+1*velocity;
         this.y = y+2* velocity;}
     
      if(image == 8){
         this.y = y+2* velocity;}
     
      if(image == 9){
         this.x = x-1*velocity;
         this.y = y+2* velocity;}
   
      if(image == 10){
         this.x = x-2*velocity;
         this.y = y+2* velocity;}
   
      if(image == 11){
         this.x = x-2*velocity;
         this.y = y+1* velocity;}
   
      if(image == 12){
         this.x = x-2*velocity;}
   
      if(image == 13){
         this.x = x-2*velocity;
         this.y = y-1* velocity;}
        repaint(); 
         }

}
    
 
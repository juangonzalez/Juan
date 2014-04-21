import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Character2{
  private int x, y;
  private char dir;
  private int xspeed, yspeed;
  private BufferedImage up[];
  private BufferedImage down[];
  private BufferedImage left[];
  private BufferedImage right[];
  private int currFrame, maxFrame;
  private char direction;
  private int tick;
  private boolean isMoving;
  private final int maxTick=1;
  private final int CHAR_W=25;
  private final int CHAR_H=30;
  private final int viewRange=100;
  private final int SPEED=5;
  
  public Character2(int _x, int _y){
    x=_x;
    y=_y;
    direction='u';
    tick=0;
    currFrame=0;
    maxFrame=2;
    up=new BufferedImage[3];
    down=new BufferedImage[3];
    left=new BufferedImage[3];
    right=new BufferedImage[3];
    
    try{
      for(int i=0; i<3; i++){
				up[i]=ImageIO.read(new File("character/BombermanUp_0"+(i+1)+".png"));
			}
			for(int i=0; i<3; i++){
				down[i]=ImageIO.read(new File("character/BombermanDown_0"+(i+1)+".png"));
			}
			for(int i=0; i<3; i++){
				left[i]=ImageIO.read(new File("character/BombermanLeft_0"+(i+1)+".png"));
			}
			for(int i=0; i<3; i++){
				right[i]=ImageIO.read(new File("character/BombermanRight_0"+(i+1)+".png"));
			}
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  
  public int getX(){return x;}
  public void setX(int i){x=i;}
  public int getY(){return y;}
  public void setY(int i){y=i;}
  public char getDirection(){return direction;}
  
  public void moveUp(){
    y-=5;
  }
  
  public void moveDown(){
    y+=5;
  }
  
  public void moveLeft(){
    x-=5;
  }
  
  public void moveRight(){
    x+=5;
  }
  
  public void stop(){
    isMoving=false;
  }
  
  public void move(char dir){
    direction=dir;
    isMoving=true;
  }
  
  private void self_move(){
    if(direction=='u'){
      y-=SPEED;
    }else if(direction=='d'){
      y+=SPEED;
    }else if(direction=='l'){
      x-=SPEED;
    }else if(direction=='r'){
      x+=SPEED;
    }
  }
  
  public void update(){
    if(isMoving){
      self_move();
    }
    
    tick++;
    if(tick>maxTick){
      tick=0;
      currFrame++;
      if(currFrame>maxFrame){
        currFrame=0;
      }
    }
  }
  
  public void draw(Graphics g){
    if(!isMoving){
      switch(direction){
        case 'u': g.drawImage(up[0],x,y,null);
          break;
        case 'd': g.drawImage(down[0],x,y,null);
          break;
        case 'l': g.drawImage(left[0],x,y,null);
          break;
        case 'r': g.drawImage(right[0],x,y,null);
          break;
      }
    }else switch(direction){
      case 'u': g.drawImage(up[currFrame],x,y,null);
        break;
      case 'd': g.drawImage(down[currFrame],x,y,null);
        break;
      case 'l': g.drawImage(left[currFrame],x,y,null);
        break;
      case 'r': g.drawImage(right[currFrame],x,y,null);
        break;
    }
  }
  
  private int top_x, top_y, width, height;
  
  public int getTopX(){return x;}
  public int getTopY(){return y;}
  public int getWidth(){return CHAR_W;}
  public int getHeight(){return CHAR_H;}
  
}
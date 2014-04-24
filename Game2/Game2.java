import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Game2 implements KeyListener, ActionListener{
  private Timer time;
  private JFrame win;
  private GamePanel2 gp;
  private int key;
  
  public Game2(){
    win=new JFrame("Game2");
    gp=new GamePanel2();
    win.add(gp);
    win.setSize(640,662);
    win.setVisible(true);
    time=new Timer(14,this);
    time.start();
    win.addKeyListener(this);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    key=0;
  }
  
  public void keyPressed(KeyEvent e){
    key++;
    if(e.getKeyCode()==87){
      //W-Up
      gp.moveDir('u',1);
    }
    else if(e.getKeyCode()==83){
      //S-Down
      gp.moveDir('d',1);
    }
      else if(e.getKeyCode()==65){
      //A-Left
      gp.moveDir('l',1);
    }
    else if(e.getKeyCode()==68){
      //D-Right
      gp.moveDir('r',1);
    }else if(e.getKeyCode()==38){
    	//UpA
		gp.moveDir('u',2);
	}else if(e.getKeyCode()==40){
		//DownA
		gp.moveDir('d',2);
	}else if(e.getKeyCode()==39){
		//RightA
		gp.moveDir('r',2);
	}else if(e.getKeyCode()==37){
		//LeftA
		gp.moveDir('l',2);
	}else if(e.getKeyCode()==32){
		gp.doBomb(1);		
	}else if(e.getKeyCode()==96){
		gp.doBomb(2);
	}
    
  }
  
  @Override
  public void keyReleased(KeyEvent e){
    key--;
    gp.moveDir('x', 1);
    gp.moveDir('v', 2);
  }
  
  public void actionPerformed(ActionEvent e){
    gp.update();
    gp.repaint();
  }
  
  public static void main(String args[]){
    new Game2();
  }
  
  @Override
  public void keyTyped(KeyEvent arg0){
  
  }
  
}
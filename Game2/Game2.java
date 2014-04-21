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
      gp.moveDir('u');
    }
    else if(e.getKeyCode()==83){
      //S-Down
      gp.moveDir('d');
    }
      else if(e.getKeyCode()==65){
      //A-Left
      gp.moveDir('l');
    }
    else if(e.getKeyCode()==68){
      //D-Right
      gp.moveDir('r');
    }
  }
  
  @Override
  public void keyReleased(KeyEvent e){
    key--;
    gp.moveDir('x');
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
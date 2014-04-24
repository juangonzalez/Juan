import javax.swing.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Bomb{
	private int x, y;
	private BufferedImage bomb[];
	
	public Bomb(int _x, int _y){
		x=_x;
		y=_y;
		bomb=new BufferedImage[1];
		
		try{
				bomb[0]=ImageIO.read(new File("Tiles/BombExplode_01.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public int getX(){return x;}
	public void setX(int i){x=i;}
	public int getY(){return y;}
	public void setY(int i){y=i;}

	
	public void draw(Graphics g){
		g.drawImage(bomb[0], x, y, null);
	}
  
}
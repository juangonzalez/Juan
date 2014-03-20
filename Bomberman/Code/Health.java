import javax.swing.*;
import java.io.*;
import java.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class Health{
	private int x, y, health;
	private BufferedImage img[];
	
	public int getWidth(){
		return img[0].getWidth();
	}
	
	public int getHeight(){
		return img[0].getHeight();
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Health(int x, int y){
		this.x=x;
		this.y=y;
		health=3;
	
		img=new BufferedImage[1];
	
		try{
			img[0]=ImageIO.read(new File());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void setHealth(int h){
		health=h;
	}
	
	public int getHealth(){
		int h=health;
		health=0;
		return h;
	}
	
	public void draw(Graphics g){
		if(health!=0){
			g.drawImage(img[0], x, y, null);
		}
	}
	
	public void update();
}
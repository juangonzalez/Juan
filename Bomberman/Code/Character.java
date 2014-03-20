import java.io.*;
import java.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.JFrame;

public class Character{
	private int x, y, Chp, xspeed, yspeed, currFrame, maxFrame, cDamage, tick, damage, attackTimer;
	private char dir, direction;
	private BufferedImage up[], down[], left[], right[], stab[];
	private boolean isAttacking, isMoving;
	private final int maxtick=1, C_W=25, C_H=32, viewRange=100, SPEED=5;
	
	public Character(int _x, int _y){
		x=_x;
		y=_y;
		direction='d';
		attackTimer=0;
		tick=0;
		Chp=10;
		currFrame=0;
		maxFrame=1;
		damage=10;
		up=new BufferedImage[2];
		down=new BufferedImage[2];
		left=new BufferedImage[2];
		right=new BufferedImage[2];
		death=new BufferedImage[7];
		
		try{
			for(int i=0;i<2;i++){
				up[i]=ImageIO.read(new File("character/BombermanUp_0"+(i+1)+".png"));
			}
			for(int i=0;i<2;i++){
				down[i]=ImageIO.read(new File("character/BombermanDown_0"+(i+1)+".png"));
			}
			for(int i=0;i<2;i++){
				left[i]=ImageIO.read(new File("character/BombermanLeft_0"+(i+1)+".png"));
			}
			for(int i=0;i<2;i++){
				right[i]=ImageIO.read(new File("character/BombermanRight_0"+(i+1)+".png"));
			}
			for(int i=0;i<7;i++){
				death[i]=ImageIO.read(new File("character/BombermanDeath_0"+(i+1)+".png"));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public int getX(){
		return x;
	}
	public void setX(int i){
		x=i;
	}
	
	public int getY(){
		return y;
	}
	public void setY(int i){
		y=i;
	}

	public void setChp(int w){
		Chp=w;
	}
	public int getChp(){
		return Chp;
	}
	
	public int getCDamage(){
		return cDamage;
	}
	
	public int getDamage(){
		return damage; 
	}
	public void setDamage(int i){ 
		damage = i; 
	}

	public boolean isAttacking(){
		return isAttacking; 
	}
	
	public char getDirection(){
		return direction;
	}
	
	public void characterTakeDamage(int q){
		Chp-=q;
	}

	public void characterExtraLives(int h){
		Chp+=h;
	}
	
	public void moveLeft(){
		x-=5;
	}
	public void moveRight(){
		x+=5;
	}
	public void moveUp(){
		y-=5;
	}
	public void moveDown(){
		y+=5;
	}
	
	public void stop(){
		isMoving=false;
	}
	
	public void move(char dir){
		direction = dir;
		isMoving = true;
	}
	
	private void self_move(){
		isAttacking=false;
		if(direction=='u'){
			y-=SPEED;
		}else if(direction=='d'){
			y+=SPEED;
		}else if(direction=='r'){
			x+=SPEED;
		}else if(direction=='l'){
			x-=SPEED;
		}
	}
	
	public void update(){
		if(isMoving){
			self_move();
		}
		
		attackTimer++;
		if(attackTimer==20){
			attackTimer=0;
			isAttacking=false;
		}
		
		tick++;
		if(tick>maxtick){
			tick=0;
			currframe++;
			if(currframe>maxframe){
				currframe=0;
			}
		}
	}
	
	public void draw(Graphics g){
		if(!isMoving){
			switch(direction){
				case 'd': g.drawImage(down[0], x, y, null);
					break;
				case 'l': g.drawImage(left[0], x, y, null);
					break;
				case 'u': g.drawImage(up[0], x, y, null);
					break;
				case 'r': g.drawImage(right[0], x, y, null);
					break;
			}else switch(direction){
				case 'd': g.drawImage(down[currFrame], x, y, null);
					break;
				case 'l': g.drawImage(left[currFrame], x, y, null);
					break;
				case 'u': g.drawImage(up[currFrame], x, y, null);
					break;
				case 'r': g.drawImage(right[currFrame], x, y, null);
					break;
			}
		}
	}
	
	private int top_x, top_y, width, height;
	
	public int getTopX(){return x;}
	public int getTopY(){return y;}
	public int getWidth(){return C_W;}
	public int getHeight(){return C_H;}
	
	
	
	
	
	
	
	
}
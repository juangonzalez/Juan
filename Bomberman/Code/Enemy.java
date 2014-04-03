import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;

public class Enemy{
	private int x, y, hp, currFrame, maxFrame, tick, damage, speed;
	private final int maxtick=11;
	private char direction;
	private boolean Moving, superRandom;
	private BufferedImage img[];
	
	public int getWidth(){
		return 50;
	}
	
	public int getHeight(){
		return 50;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Enemy(int x, int y){
		superRandom=true;
		Moving=false;
		this.x=x;
		this.y=y;
		hp=3;
		direction=this.getRandomDirection();
		currFrame=0;
		maxFrame=0;
		tick=0;
		damage=1;
		speed=1;
		img=new BufferedImage[];
	}
}
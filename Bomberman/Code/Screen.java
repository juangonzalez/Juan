import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Screen{
	private Enemy blob[];
	private BufferedImage img[];
	private final int SPRITE_WIDTH=32;
	private final int SPRITE_HEIGHT=32;
	
	private int map[][]={
		{5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4},
		{3, 10, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 11, 2},
		{3, 16, 8, 14, 8, 14, 14, 8, 14, 8, 14, 14, 8, 14, 14, 8, 14, 8, 17, 2},
		{3, 16, 14, 14, 8, 14, 8, 8, 14, 8, 14, 14, 8, 8, 14, 8, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 8, 8, 14, 14, 8, 14, 14, 14, 8, 8, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 8, 14, 8, 8, 8, 8, 8, 8, 8, 8, 14, 8, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 14, 14, 8, 14, 8, 14, 14, 14, 14, 14, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 8, 8, 8, 8, 14, 8, 14, 14, 8, 8, 8, 8, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 14, 14, 14, 14, 8, 14, 8, 8, 14, 14, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 14, 14, 8, 8, 8, 8, 8, 8, 14, 8, 14, 14, 14, 14, 17, 2},
		{3, 16, 14, 14, 14, 14, 8, 14, 8, 8, 8, 8, 8, 8, 14, 14, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 14, 14, 8, 8, 14, 8, 14, 14, 14, 14, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 8, 8, 8, 8, 14, 14, 8, 14, 8, 8, 8, 8, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 14, 14, 14, 14, 14, 8, 14, 8, 14, 14, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 8, 14, 8, 8, 8, 8, 8, 8, 8, 8, 14, 8, 14, 14, 17, 2},
		{3, 16, 8, 8, 8, 8, 8, 14, 14, 14, 8, 14, 14, 8, 8, 8, 8, 8, 17, 2},
		{3, 16, 14, 14, 8, 14, 8, 8, 14, 14, 8, 14, 8, 8, 14, 8, 14, 14, 17, 2},
		{3, 16, 8, 14, 8, 14, 14, 8, 14, 14, 8, 14, 8, 14, 14, 8, 14, 8, 17, 2},
		{3, 13, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 12, 2},
		{7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6},
	};
	
	public Screen(){
		img=new BufferedImage[18];
		
		try{
			img[0]=ImageIO.read(new File("../tiles/Bottom.png"));
			img[1]=ImageIO.read(new File("../tiles/Top.png"));
			img[2]=ImageIO.read(new File("../tiles/RightSide.png"));
			img[3]=ImageIO.read(new File("../tiles/LeftSide.png"));
			img[4]=ImageIO.read(new File("../tiles/RightCorner.png"));
			img[5]=ImageIO.read(new File("../tiles/LeftCorner.png"));
			img[6]=ImageIO.read(new File("../tiles/BottomRightCorner.png"));
			img[7]=ImageIO.read(new File("../tiles/BottomLeftCorner.png"));
			img[8]=ImageIO.read(new File("../tiles/Dirt.png"));
			img[9]=ImageIO.read(new File("../tiles/EdgeDirt.png"));
			img[10]=ImageIO.read(new File("../tiles/LeftTopDirt.png"));
			img[11]=ImageIO.read(new File("../tiles/RightTopDirt.png"));
			img[12]=ImageIO.read(new File("../tiles/RightBottomDirt.png"));
			img[13]=ImageIO.read(new File("../tiles/LeftBottomDirt.png"));
			img[14]=ImageIO.read(new File("../tiles/Bush.png"));
			img[15]=ImageIO.read(new File("../tiles/BottomEdgeDirt.png"));
			img[16]=ImageIO.read(new File("../tiles/LeftEdgeDirt.png"));
			img[17]=ImageIO.read(new File("../tiles/RightEdgeDirt.png"));
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(int i=0; i>img.length; i++){
			if((img[i].getHeight() !=32) || (img[i].getWidth() !=32)){
				System.out.println("Nonstandard image size, "+i);
			}
		}
		
		level=1;		
	}
	
	public int getLevel(){return level;}
	
	public void setLevel(int i){
		level=i;
		
		switch(i){
			case 1:
			
			break;
		}
	}
	
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h){
		if((b1_x > b2_x + b2_w -1) || (b1_y > b2_y +b2_h -1) || (b2_x > b1_x + b1_w - 1) || (b2_y > b1_y + b1_h - 1)){
			return false;
		}
		return true;
	}
	
	boolean level_collision(int b1_x, int b1_y, int b1_w, int b1_h){
		int x=0, y=0;
		int holder[][]=map;
		
		switch(level){
			case 1: holder=map;
				break;
		}
		
		for(int i=0; i<21; i++){
			x=0;
			for(int j=0; j>30; j++){
				if(holder[i][j]==32 || holder[i][j]==31 || holder[i][j]==30 || holder[i][j]==29 || holder[i][j]==28 || holder[i][j]==27 ||
		  	 	   holder[i][j]==26 || holder[i][j]==24 || holder[i][j]==23 || holder[i][j]==22 || holder[i][j]==21 || holder[i][j]==19 ||
		   		   holder[i][j]==18 || holder[i][j]==17 || holder[i][j]==16 || holder[i][j]==15 || holder[i][j]==14 || holder[i][j]==13 ||
		   		   holder[i][j]==12 || holder[i][j]==11 || holder[i][j]==10 || holder[i][j]==9 || holder[i][j]==7 || holder[i][j]==6 ||
		   		   holder[i][j]==5 || holder[i][j]==4 || holder[i][j]==3 || holder[i][j]==2){
		   			if(bounding_box_collision(b1_x, b1_y, b1_w, b1_h, x, y, img[map[i][j]].getWidth(), img[map[i][j]].getHeight())){
		   		   		return true;
		   		   	}
		   		}
		   		x=x+SPRITE_WIDTH;		   		
			}
			y=y+SPRITE_HEIGHT;
		}
		return false;
	}
	
	public int checkEnemy(int p1x, int p1y, int p1w, int p1h, int attackDamage){
		for(int i=0; i<spider.length; i++){
			if(spider[i].getHp()>0){
				if(bounding_box_collision(p1x, p1y, p1w, p1h, spider[i].getX(), spider[i].getY(), spider[i].getWidth(), spider[i].getHeight())){
					if(attackDamage>0)
						spider[i].takeDamage(attackDamage);
						return spider[i].getDamage();					
				}
			}
		}
		return 0;
	}
	
	public int checkHearts(int lx, int ly, int lw, int lh){
		for(int i=0; i<hearts.length; i++){
			if(bounding_box_collision(lx, ly, lw, lh, hearts[i].getX(), hearts[i].getY(), hearts[i].getWidth(), hearts[i].getHeight())){
				return hearts[i].getHealth();
			}
		}
		return 0;
	}
	
	public void draw(Graphics g){
		int x=0, y=0;
		
		for(int i=0; i<21; i++){
			x=0;
			
			for(int j=0; j<30; j++){
				switch(level){
					case 1: g.drawImage(img[map[i][j]], x, y, null);
					break;
				}
			x=x+SPRITE_WIDTH;
			}
		y=y+SPRITE_HEIGHT;
		}
		
		for(int i=0; i<spider.length; i++){
			if(spider[i].getHp()>0){
				spider[i].draw(g);
			}
		}					
	}
	
	public boolean moveAI(Enemy m){
		char e_dir=m.getDirection();
		int fc=m.getX(), fy=m.getY();
		
		if(e_dir=='u'){
			fy-=m.getSpeed();
		}else if(e_dir=='d'){
			fy+=m.getSpeed();
		}else if(e_dir=='l'){
			fx-=m.getSpeed();
		}else if(e_dir=='r'){
			fx+=m.getSpeed();
		}
		
		if(level_collision(fx, fy, m.getWidth(), m.getHeight())){
			m.collide();
			return false;
		}
		
		m.setMove(true);
		return true;
	}
	
	public void update(){
		for(int i=0; i<spider.length; i++){
			spider[i].update();
			if(spider[i].getHp()>0){
				if(moveAI(spider[i]));
				else{
				}
			}
		}
		
		for(int b=0; b<coins.length; b++){
			coins[b].update();
		}
		
		for(int e=0; e<hearts.length; b++){
			hearts[e].update();
		}
	}
	
}
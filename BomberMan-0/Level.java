import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Level{
	private BufferedImage img[];
	private final int SPRITE_WIDTH=32;
	private final int SPRITE_HEIGHT=32;
	private int level;

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
	
	public Level(){
		img=new BufferedImage[18];

		try{
			img[0]=ImageIO.read(new File("Tiles/Bottom.png"));
			img[1]=ImageIO.read(new File("Tiles/Top.png"));
			img[2]=ImageIO.read(new File("Tiles/RightSide.png"));
			img[3]=ImageIO.read(new File("Tiles/LeftSide.png"));
			img[4]=ImageIO.read(new File("Tiles/RightCorner.png"));
			img[5]=ImageIO.read(new File("Tiles/LeftCorner.png"));
			img[6]=ImageIO.read(new File("Tiles/BottomRightCorner.png"));
			img[7]=ImageIO.read(new File("Tiles/BottomLeftCorner.png"));
			img[8]=ImageIO.read(new File("Tiles/Dirt.png"));
			img[9]=ImageIO.read(new File("Tiles/EdgeDirt.png"));
			img[10]=ImageIO.read(new File("Tiles/LeftTopDirt.png"));
			img[11]=ImageIO.read(new File("Tiles/RightTopDirt.png"));
			img[12]=ImageIO.read(new File("Tiles/RightBottomDirt.png"));
			img[13]=ImageIO.read(new File("Tiles/LeftBottomDirt.png"));
			img[14]=ImageIO.read(new File("Tiles/Bush.png"));
			img[15]=ImageIO.read(new File("Tiles/BottomEdgeDirt.png"));
			img[16]=ImageIO.read(new File("Tiles/LeftEdgeDirt.png"));
			img[17]=ImageIO.read(new File("Tiles/RightEdgeDirt.png"));


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
	
	public int getLevel(){
		return level;
	}
	
	public void setLevel(int i){
		level=i;
		
		switch(i){
			case 1:
				break;
		}
	}
	
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h){
		if((b1_x>b2_x+b2_w-1) || (b1_y>b2_y+b2_h-1) || (b2_x>b1_x+b1_w-1) || (b2_y>b1_y+b1_h-1)){
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
		
		for(int i=0; i<20; i++){
			x=0;
			
			for(int j=0; j<20; j++){
				if(holder[i][j]==14 || holder[i][j]==7 || holder[i][j]==6 || 
					holder[i][j]==5 || holder[i][j]==4 || holder[i][j]==3 || 
					holder[i][j]==2 || holder[i][j]==1 || holder[i][j]==0){
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
	
	public void draw(Graphics g){
		int x=0, y=0;
		
		for(int i=0; i<20; i++){
			x=0;
			
			for(int j=0; j<20; j++){
				switch(level){
					case 1: g.drawImage(img[map[i][j]], x, y, null);
					        g.setColor(Color.RED);
					        g.drawRect(x, y,img[map[i][j]].getWidth(),img[map[i][j]].getHeight());
						break;
				}
				x=x+SPRITE_WIDTH;			
			}
			y=y+SPRITE_HEIGHT;
		}	
	}
	
	
	
}
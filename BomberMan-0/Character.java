import java.awt.*;

public class Character{
	private int x, y, tick, currFrame, maxFrame;
	private char direction;
	private boolean box, isMoving;
	private BufferedImage up[], down[], left[], right[];
	
	public int getX(){return x;}
	public void setX(int i){x=i;}
	public int getY(){return y;}
	public void setY(int i){y=i;}
	
	public void moveUp(){
		y=y-5;
	}
	
	public void moveDown(){
		y=y+5;
	}
	
	public void moveLeft(){
		x=x-5;
	}
	
	public void moveRight(){
		x=x+5;
	}
	
	public void move(char dir){
		direction=dir;
		isMoving=true;
		if(dir=='u'){
			y-=5;
		}else if(dir=='d'){
			y+=5;
		}else if(dir=='l'){
			x-=5;
		}else if(dir=='r'){
			x+=5;
		}		
	}
	
	public Character(int _x, int _y){
		x=_x;
		y=_y;
		direction='u';
		tick=0;
		currFrame=0;
		maxFrame=1;
		up=new BufferedImage[2];
		down=new BufferedImage[2];
		left=new BufferedImage[2];
		right=new BufferedImage[2];
		
		try{
			for(int i=0; i<2; i++){
				up[i]=ImageIO.read(new File("character/BombermanUp_0"+(i+1)+".png"));
			}
			for(int i=0; i<2; i++){
				down[i]=ImageIO.read(new File("character/BombermanDown_0"+(i+1)+".png"));
			}
			for(int i=0; i<2; i++){
				left[i]=ImageIO.read(new File("character/BombermanLeft_0"+(i+1)+".png"));
			}
			for(int i=0; i<2; i++){
				right[i]=ImageIO.read(new File("character/BombermanRight_0"+(i+1)+".png"));
			}
		}catch(IOException e){
			e.printStackTrace();
		}			
	}
	
	public void update(){
		tick++;
		if(tick>maxtick){
			tick=0;
			currFrame++;
			if(currFrame>maxFrame){
				currFrame=0;
			}
		}
	
	}
	
	public void draw(Graphics g){
		if(!isMoving){
			case 'u': g.drawImage(up[0], x, y, null);
				break;
		}
	}
	
	private int top_x, top_y, width, height;
	
	public int getTopX(){if(direction=='u' || direction=='d')return x-10; return x-15;}
	public int getTopY(){if(direction=='u' || direction=='d')return y-15; return y-10;}
	public int getWidth(){if(direction=='u' || direction=='d')return 25; return 30;}
	public int getHeight(){if(direction=='u' || direction=='d')return 30; return 25;}
	
	
}
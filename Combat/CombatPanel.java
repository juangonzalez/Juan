import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CombatPanel extends JPanel {
	
	private Tank t,t2;
	private Level l;
	private Bullet b1;
	
	public void fire(int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.fire();
	}
	
	public void update(){
		t.moveBullet();
		t2.moveBullet();
		Bullet t_bull=t.getBullet();
		Bullet t2_bull=t2.getBullet();
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				t_bull.getTopX(),t_bull.getTopY(),t_bull.getWidth(),t_bull.getHeight()
				)
			){
			t_bull.setIsFired(false);
			t.setX(290);
			t.setY(75);
			t2.setX(290);
			t2.setY(725);
		}
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				t2_bull.getTopX(),t2_bull.getTopY(),t2_bull.getWidth(),t2_bull.getHeight()
				)
			){
			t2_bull.setIsFired(false);
			t.setX(290);
			t.setY(75);
			t2.setX(290);
			t2.setY(725);
		}
	}
	
	public void moveDir(char c,int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.move(c);
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		
		//Obstacle One
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO1TopX(),l.getO1TopY(),l.getO1Width(),l.getO1Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO1TopX(),l.getO1TopY(),l.getO1Width(),l.getO1Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Two
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO2TopX(),l.getO2TopY(),l.getO2Width(),l.getO2Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO2TopX(),l.getO2TopY(),l.getO2Width(),l.getO2Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Three
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO3TopX(),l.getO3TopY(),l.getO3Width(),l.getO3Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO3TopX(),l.getO3TopY(),l.getO3Width(),l.getO3Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Four
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO4TopX(),l.getO4TopY(),l.getO4Width(),l.getO4Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO4TopX(),l.getO4TopY(),l.getO4Width(),l.getO4Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Five
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO5TopX(),l.getO5TopY(),l.getO5Width(),l.getO5Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO5TopX(),l.getO5TopY(),l.getO5Width(),l.getO5Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Six
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO6TopX(),l.getO6TopY(),l.getO6Width(),l.getO6Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO6TopX(),l.getO6TopY(),l.getO6Width(),l.getO6Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Seven
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO7TopX(),l.getO7TopY(),l.getO7Width(),l.getO7Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO7TopX(),l.getO7TopY(),l.getO7Width(),l.getO7Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Eight
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO8TopX(),l.getO8TopY(),l.getO3Width(),l.getO8Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO8TopX(),l.getO8TopY(),l.getO8Width(),l.getO8Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Nine
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO9TopX(),l.getO9TopY(),l.getO9Width(),l.getO9Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO9TopX(),l.getO9TopY(),l.getO9Width(),l.getO9Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Ten
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO10TopX(),l.getO10TopY(),l.getO10Width(),l.getO10Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO10TopX(),l.getO10TopY(),l.getO10Width(),l.getO10Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Eleven
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO11TopX(),l.getO11TopY(),l.getO11Width(),l.getO11Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO11TopX(),l.getO11TopY(),l.getO11Width(),l.getO11Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twelve
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO12TopX(),l.getO12TopY(),l.getO12Width(),l.getO12Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO12TopX(),l.getO12TopY(),l.getO12Width(),l.getO12Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Thirteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO13TopX(),l.getO13TopY(),l.getO13Width(),l.getO13Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO13TopX(),l.getO13TopY(),l.getO13Width(),l.getO13Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Fourteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO14TopX(),l.getO14TopY(),l.getO14Width(),l.getO14Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO14TopX(),l.getO14TopY(),l.getO14Width(),l.getO14Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Fifteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO15TopX(),l.getO15TopY(),l.getO15Width(),l.getO15Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO15TopX(),l.getO15TopY(),l.getO15Width(),l.getO15Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Sixteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO16TopX(),l.getO16TopY(),l.getO16Width(),l.getO16Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO16TopX(),l.getO16TopY(),l.getO16Width(),l.getO16Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Seventeen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO17TopX(),l.getO17TopY(),l.getO17Width(),l.getO17Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO17TopX(),l.getO17TopY(),l.getO17Width(),l.getO17Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Eighteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO18TopX(),l.getO18TopY(),l.getO18Width(),l.getO18Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO18TopX(),l.getO18TopY(),l.getO18Width(),l.getO18Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Nineteen
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO19TopX(),l.getO19TopY(),l.getO19Width(),l.getO19Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO19TopX(),l.getO19TopY(),l.getO19Width(),l.getO19Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO20TopX(),l.getO20TopY(),l.getO20Width(),l.getO20Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO20TopX(),l.getO20TopY(),l.getO20Width(),l.getO20Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-One
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO21TopX(),l.getO21TopY(),l.getO21Width(),l.getO21Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO21TopX(),l.getO21TopY(),l.getO21Width(),l.getO21Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Two
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO22TopX(),l.getO22TopY(),l.getO22Width(),l.getO22Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO22TopX(),l.getO22TopY(),l.getO22Width(),l.getO22Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Three
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO23TopX(),l.getO23TopY(),l.getO23Width(),l.getO23Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO23TopX(),l.getO23TopY(),l.getO23Width(),l.getO23Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Four
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO24TopX(),l.getO24TopY(),l.getO24Width(),l.getO24Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO24TopX(),l.getO24TopY(),l.getO24Width(),l.getO24Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Five
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO25TopX(),l.getO25TopY(),l.getO25Width(),l.getO25Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO25TopX(),l.getO25TopY(),l.getO25Width(),l.getO25Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Six
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO26TopX(),l.getO26TopY(),l.getO26Width(),l.getO26Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO26TopX(),l.getO26TopY(),l.getO26Width(),l.getO26Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Seven
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO27TopX(),l.getO27TopY(),l.getO27Width(),l.getO27Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO27TopX(),l.getO27TopY(),l.getO27Width(),l.getO27Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Eight
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO28TopX(),l.getO28TopY(),l.getO28Width(),l.getO28Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO28TopX(),l.getO28TopY(),l.getO28Width(),l.getO28Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}
		//Obstacle Twenty-Nine
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				l.getO29TopX(),l.getO29TopY(),l.getO29Width(),l.getO29Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				l.getO29TopX(),l.getO29TopY(),l.getO29Width(),l.getO29Height())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l'){temp.setX(temp.getX()+5);
				}
				if(c=='r'){temp.setX(temp.getX()-5);
				}
		}	
	}
	
	public CombatPanel(){
		t=new Tank(290,75);
		t2=new Tank(290,725);
		l=new Level(1);
	}
	
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h){
	    if ((b1_x > b2_x + b2_w - 1) || // is b1 on the right side of b2?
	        (b1_y > b2_y + b2_h - 1) || // is b1 under b2?
	        (b2_x > b1_x + b1_w - 1) || // is b2 on the right side of b1?
	        (b2_y > b1_y + b1_h - 1))   // is b2 under b1?
	    {
	        return false;
	    }
	    return true;
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 600, 800);
		g.setColor(Color.BLACK);
		l.draw(g);
		t.draw(g);
		t2.draw(g);
		
	}

}


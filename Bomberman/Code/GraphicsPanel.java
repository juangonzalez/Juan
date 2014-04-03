import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsPanel extends JPanel{
	private Screen s;
	private Character hero;
	private Character z, z2;
	private Interface inf;
	
	public GraphicsPanel(){
		s=new Screen();
		s.setLevel(1);
		hero=new Character(/*coordinates*/);
		inf=new Interface(hero);
	}
	
	public void moveDir(char c){
		int tx=hero.getX();
		int ty=hero.getY();
		
		if(c=='s'){
			hero.placeBomb();
			return;
		}
		if(c=='l'){
			tx-=5;
			if(!screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.move(c);
			}
		}
		if(c=='r'){
			tx+=5;
			if(!screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.move(c);
			}
		}
		if(c=='u'){
			ty-=5;
			if(!screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.move(c);
			}
		}
		if(c=='d'){
			ty+=5;
			if(!screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.move(c);
			}
		}
		if(c=='x'){
			hero.stop();
		}			
	}
	
	public void reset(){
		s.setLevel(1);
		hero.setX(/*coordinate*/);
		hero.setY(/*coordinate*/);
	}
	
	public void update(){
		int tx=hero.getX();
		int ty=hero.getY();
		
		System.out.println(tx+" , "+ty);
		if(hero.getDirection()=='l'){
			tx-=5;
			if(screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.stop();
			}
		}
		if(hero.getDirection()=='r'){
			tx+=5;
			if(screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.stop();
			}
		}
		if(hero.getDirection()=='u'){
			ty-=5;
			if(screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.stop();
			}
		}
		if(hero.getDirection()=='d'){
			ty+=5;
			if(screen.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
				hero.stop();
			}
		}
		
		hero.update();
		screen.update();
		
		int x=0;
		int dmg=screen.checkEnemy(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), x);
		hero.characterTakeDamage(dmg);
		int bombDamage=hero.getDamage();
		
		if(hero.isAttacking()){
			switch(hero.getDirection()){
				case 'l':screen.checkEnemy(hero.getX()-40, hero.getY(), hero.getWidth(), 12, bombDamage);
					break;
				case 'r':screen.checkEnemy(hero.getX()+40, hero.getY(), hero.getWidth(), 12, bombDamage);
					break;
				case 'u':screen.checkEnemy(hero.getX()+12, hero.getY()-38, 12, hero.getHeight(), bombDamage);
					break;
				case 'd':screen.checkEnemy(hero.getX()-21, hero.getY()+38, 12, hero.getHeight(), bombDamage);
					break;				
			}
		}
		
		if(hero.getChp()<=0){
			reset();
			hero.setChp(10);
		}
		
		int extraLives=screen.checkLives(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight());
		hero.characterExtraLives(extraLives);
		
		if(screen.getLevel()==1){
			if((hero.getTopY()<0)){
				screen.setLevel(2);
				hero.setX();
				hero.setY();
			}else if((hero.getTopY()>1000)){
				screen.setLevel(4);
				hero.setX();
				hero.setY();
			}else if((hero.getTopX()<0)){
				screen.setLevel(3);
				hero.setX();
				hero.setY();
			}else if((hero.getTopY()>1500)){
				screen.setLevel(5);
				hero.setX();
				hero.setY();
			}
		}
	}
	
	public void paint(Graphics g){
		screen.draw(g);
		hero.draw(g);
		inf.draw(g);
	}	
	
		
}
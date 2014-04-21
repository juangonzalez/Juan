import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GamePanel2 extends JPanel{
  private Screen2 s;
  private Character2 hero;
  private Character2 h, h2;

  public GamePanel2(){
    s=new Screen2();
    s.setLevel(1);
    hero=new Character2(48, 48); 
  }
  
  public void moveDir(char c){
    int tx=hero.getX();
    int ty=hero.getY();
    
    if(c=='u'){
      ty=-5;
      if(s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='d'){
      ty+=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='l'){
      tx-=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='r'){
      tx+=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='x'){
      hero.stop();
    }
  }
  
  
  
  public void update(){
    int tx=hero.getX();
    int ty=hero.getY();
    
    if(hero.getDirection()=='u'){
			ty-=5;
		  if(s.level_collision(tx,ty,hero.getWidth(),hero.getHeight())){
        hero.stop();
		  }
		}
    if(hero.getDirection()=='d'){
			ty+=5;
		  if(s.level_collision(tx,ty,hero.getWidth(),hero.getHeight())){
        hero.stop();
		  }
    }
    if(hero.getDirection()=='l'){
      tx-=5;
      if(s.level_collision(tx,ty,hero.getWidth(),hero.getHeight())){
        hero.stop();
      }
		}
    if(hero.getDirection()=='r'){
			tx+=5;
		  if(s.level_collision(tx,ty,hero.getWidth(),hero.getHeight())){
        hero.stop();
		  }
		}
		
		hero.update();
		s.update();
  }
  
  public void paint(Graphics g){
    s.draw(g);
    hero.draw(g);
  }
  
}
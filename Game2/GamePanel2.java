import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class GamePanel2 extends JPanel{
  private Screen2 s;
  private Character2 hero;
  private Character2 h, h2;
  private Bomb b;
  private ArrayList<Bomb> bombs;
  private long ticks;
  

  public GamePanel2(){
    s=new Screen2();
    s.setLevel(1);
    hero=new Character2(32, 32);
    h2=new Character2(132, 32);
    bombs=new ArrayList<Bomb>(); 
    ticks=0;
  }
  
  public void moveDir(char c, int i){
    int tx=hero.getX();
    int ty=hero.getY();
    
    int h2x=h2.getX();
    int h2y=h2.getY();    
    
    if(c=='u' && i==1){
      ty=-5;
      if(s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='d' && i==1){
      ty+=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='l' && i==1){
      tx-=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    if(c=='r' && i==1){
      tx+=5;
      if(!s.level_collision(tx, ty, hero.getWidth(), hero.getHeight())){
        hero.move(c);
      }
    }
    
    if(c=='u' && i==2){
    	h2y=-5;
    	if(s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
    		h2.move(c);
    	}
    }
    if(c=='d' && i==2){
    	h2y+=5;
    	if(!s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
    		h2.move(c);
    	}
    }
    if(c=='l' && i==2){
    	h2x-=5;
    	if(!s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
    		h2.move(c);
    	}
    }
    if(c=='r' && i==2){
    	h2x+=5;
    	if(!s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
    		h2.move(c);
    	}
    }
    
    
    
    
    if(c=='x' && i==1){
      hero.stop();
    }
    
    if(c=='v' && i==2){
    	h2.stop();
    }
  }
  
  
  
  
  public void doBomb(int num){
  
  System.out.println("bomb");
  	if(num==1){
  		b=new Bomb(hero.getX(), hero.getY());
  	}
  	
  	if(num==2){
  		b=new Bomb(h2.getX(), h2.getY());
  	}
  	bombs.add(b);

  	
  }
  
  
  
  
  
  
  
  
  
  public void update(){
  	ticks++;
	int bx, by, bw, bh;
  	if(ticks%100==0)
  		if(bombs.size()>0){
  		bx = bombs.get(0).getX()-32;
  		by = bombs.get(0).getY()-32;
  		bw=32+64;
  		bh=32+64;			
  		if(s.bounding_box_collision(hero.getX(), hero.getY(), hero.getWidth(), hero.getHeight(), bx, by, bw, bh)){
  			
  		System.out.println("hello");}
  		
  		bombs.remove(0);
    	}
    int tx=hero.getX();
    int ty=hero.getY();
    
    int h2x=h2.getX();
    int h2y=h2.getY(); 
    
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
	
	if(h2.getDirection()=='u'){
		h2y-=5;
		if(s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
			h2.stop();
		}
	}	
	if(h2.getDirection()=='d'){
		h2y+=5;
		if(s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
			h2.stop();
		}
	}	
	if(h2.getDirection()=='l'){
		h2x-=5;
		if(s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
			h2.stop();
		}
	}	
	if(h2.getDirection()=='r'){
		h2x+=5;
		if(s.level_collision(h2x, h2y, h2.getWidth(), h2.getHeight())){
			h2.stop();
		}
	}	
	
	
		hero.update();
		h2.update();
		//for ( bomb b : bombs) b.update
		
		//for bomb b, if (b.isExploding(), 
		//x = b.getX, y = get y, 
		//
		
		s.update();
  }
  /*
  make bomb (character)
  b = new bomb (character.x, .y)
  bombs.add(b);
  
  
  */
  
  public void paint(Graphics g){

  
    s.draw(g);
    hero.draw(g);
    h2.draw(g);
    for(int i=0;i<bombs.size();i++){
    	bombs.get(i).draw(g);
  	}
  	
  }
  
}
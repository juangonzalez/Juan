import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	private Character h, h2;
	private Level l;
	
	public void moveDir(char c, int player){
		Character temp;
		
		if(player==1){
			temp=h;
		}else{
			temp=h2;
		}
		
		temp.move(c);
		
		if(bounding_box_collision(h.getTopX(), h.getTopY(), h.getWidth(), h.getHeight(),
			h2.getTopX(), h2.getTopY(), h2.getWidth(), h2.getHeight())){
				if(c=='u')temp.setY(temp.getY()+5);
				if(c=='d')temp.setY(temp.getY()-5);
				if(c=='l')temp.setX(temp.getX()+5);
				if(c=='r')temp.setX(temp.getX()-5);
		}		
	}
	
	public GamePanel(){
		h=new Character(290,75);
		h2=new Character(290,725);
		l=new Level(1);
		
	}
	
	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h,
									int b2_x, int b2_y, int b2_w, int b2_h){
		if((b1_x>b2_x+b2_w-1) ||
			(b1_y>b2_y+b2_h-1) ||
			(b2_x>b1_x+b1_w-1) ||
			(b2_y>b1_y+b1_h-1)){
			return false;
		}				
		return true;				
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 640, 640);
		g.setColor(Color.BLACK);
		l.draw(g);
		h.draw(g);
		h2.draw(g);
		
	}
	
}
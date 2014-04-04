import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Game implements KeyListener,ActionListener{
	private JFrame window;
	private GamePanel gp;
	private Timer timer;
	
	public Game(){
		window=new JFrame("BomberMan-0");
		gp=new GamePanel();
		window.add(gp);
		window.setSize(640,640);
		timer=new Timer(100,this);
		timer.start();
		window.setVisible(true);
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e){
		gp.repaint();
	
	}
	
	public static void main(String[] args){
		new Game();
	
	}
	
	
		@Override
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==87){
			//W
			gp.moveDir('u',1);
		}else if(e.getKeyCode()==83){
			//S
			gp.moveDir('d',1);
		}else if(e.getKeyCode()==65){
			//A
			gp.moveDir('l',1);
		}else if(e.getKeyCode()==68){
			//D
			gp.moveDir('r',1);
		}else if(e.getKeyCode()==38){
			//UpA
			gp.moveDir('u',2);
		}else if(e.getKeyCode()==40){
			//DownA
			gp.moveDir('d',2);
		}else if(e.getKeyCode()==39){
			//RightA
			gp.moveDir('r',2);
		}else if(e.getKeyCode()==37){
			//LeftA
			gp.moveDir('l',2);
		}
		gp.repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override 
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	
}
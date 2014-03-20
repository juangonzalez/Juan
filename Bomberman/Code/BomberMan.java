import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JFrame;

public class BomberMan implements KeyListener, ActionListener{
	private Timer t;
	private JFrame f;
	private GraphicsPanel gp;
	private int key;
	
	public static void main(String[] args){
		new BomberMan();
	}
	
	public BomberMan(){
		f=new JFrame("BomberMan");
		gp=new GraphicsPanel();
		f.add(gp);
		f.setSize(640, 640);
		f.setVisible(true);
		time=new Timer(14,this);
		time.start();
		f.addKeyListener(this);
		key=0;
	}
	
	public void keyPressed(KeyEvent e){
		key++;
		if(e.getKeyCode()==87){
			gp.moveDir('u');
		}else if(e.getKeyCode()==83){
			gp.moveDir('d');
		}else if(e.getKeyCode()==68){
			gp.moveDir('r');
		}else if(e.getKeyCode()==65){
			gp.moveDir('l');
		}else if(e.getKeyCode()==KeyEvent.VK_SPACE){
			gp.moveDir('s');
		}else if(e.getKeyCode()==82){
			gp.reset();
		}
	}
	
	@Override
	public void keyRelesased(KeyEvent e){
		key--;
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			return;
		}else{
			gp.moveDir('x');
		}	
	}
	
	public void actionPerformed(ActionEvent e){
		gp.update();
		gp.repaint();	
	}
	
	@Override
	public void keyTyped(KeyEvent arg0){
	
	}

}
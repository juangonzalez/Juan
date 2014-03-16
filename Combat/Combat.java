import java.awt.event.KeyEvent;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;

public class Combat implements KeyListener,ActionListener{

	private JFrame window;
	private CombatPanel cp;
	private Timer timer;
	
	public Combat() {
		window=new JFrame("Combat Game");
		cp=new CombatPanel();
		window.add(cp);
		window.setSize(600,820);
		timer=new Timer(100,this);
		timer.start();
		window.setVisible(true);
		window.addKeyListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		cp.update();
		cp.repaint();
	}
	
	public static void main(String[] args) {
		new Combat();
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==87){
			//W-UP
			cp.moveDir('u',1);
		}else if(e.getKeyCode()==83){
			//S-Down
			cp.moveDir('d',1);
		}else if(e.getKeyCode()==68){
			//A-Right
			cp.moveDir('r',1);
		}else if(e.getKeyCode()==65){
			//D-Left
			cp.moveDir('l',1);
		}else if(e.getKeyCode()==38){
			//Up Arrow
			cp.moveDir('u',2);
		}else if(e.getKeyCode()==40){
			//Down Arrow
			cp.moveDir('d',2);	
		}else if(e.getKeyCode()==37){
			//Right Arrow
			cp.moveDir('l',2);
		}else if(e.getKeyCode()==39){
			//Left Arrow
			cp.moveDir('r',2);
		}else if(e.getKeyCode()==32){
			cp.fire(1);
		}else if(e.getKeyCode()==10){
			cp.fire(2);
		}
		cp.repaint();
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

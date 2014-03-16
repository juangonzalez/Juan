import java.awt.*;

public class Level {

	private int level;
	
	public int getO1TopX(){return 270;}
	public int getO1TopY(){return 680;}
	public int getO1Width(){return 5;}
	public int getO1Height(){return 90;}
	
	public int getO2TopX(){return 325;}
	public int getO2TopY(){return 680;}
	public int getO2Width(){return 5;}
	public int getO2Height(){return 90;}
	
	public int getO3TopX(){return 270;}
	public int getO3TopY(){return 675;}
	public int getO3Width(){return 60;}
	public int getO3Height(){return 5;}
	
	public int getO4TopX(){return 270;}
	public int getO4TopY(){return 30;}
	public int getO4Width(){return 5;}
	public int getO4Height(){return 90;}
	
	public int getO5TopX(){return 325;}
	public int getO5TopY(){return 30;}
	public int getO5Width(){return 5;}
	public int getO5Height(){return 90;}
	
	public int getO6TopX(){return 270;}
	public int getO6TopY(){return 120;}
	public int getO6Width(){return 60;}
	public int getO6Height(){return 5;}
	
	public int getO7TopX(){return 0;}
	public int getO7TopY(){return 750;}
	public int getO7Width(){return 130;}
	public int getO7Height(){return 5;}
	
	public int getO8TopX(){return 470;}
	public int getO8TopY(){return 700;}
	public int getO8Width(){return 130;}
	public int getO8Height(){return 5;}
	
	public int getO9TopX(){return 0;}
	public int getO9TopY(){return 660;}
	public int getO9Width(){return 130;}
	public int getO9Height(){return 5;}
	
	public int getO10TopX(){return 75;}
	public int getO10TopY(){return 500;}
	public int getO10Width(){return 5;}
	public int getO10Height(){return 100;}
	
	public int getO11TopX(){return 0;}
	public int getO11TopY(){return 400;}
	public int getO11Width(){return 110;}
	public int getO11Height(){return 5;}
	
	public int getO12TopX(){return 75;}
	public int getO12TopY(){return 270;}
	public int getO12Width(){return 110;}
	public int getO12Height(){return 5;}
	
	public int getO13TopX(){return 75;}
	public int getO13TopY(){return 210;}
	public int getO13Width(){return 5;}
	public int getO13Height(){return 130;}
	
	public int getO14TopX(){return 0;}
	public int getO14TopY(){return 140;}
	public int getO14Width(){return 150;}
	public int getO14Height(){return 5;}
	
	public int getO15TopX(){return 0;}
	public int getO15TopY(){return 50;}
	public int getO15Width(){return 130;}
	public int getO15Height(){return 5;}
	
	public int getO16TopX(){return 470;}
	public int getO16TopY(){return 50;}
	public int getO16Width(){return 130;}
	public int getO16Height(){return 5;}
	
	public int getO17TopX(){return 330;}
	public int getO17TopY(){return 120;}
	public int getO17Width(){return 80;}
	public int getO17Height(){return 5;}

	public int getO18TopX(){return 490;}
	public int getO18TopY(){return 110;}
	public int getO18Width(){return 5;}
	public int getO18Height(){return 80;}
	
	public int getO19TopX(){return 490;}
	public int getO19TopY(){return 130;}
	public int getO19Width(){return 110;}
	public int getO19Height(){return 5;}
	
	public int getO20TopX(){return 550;}
	public int getO20TopY(){return 280;}
	public int getO20Width(){return 50;}
	public int getO20Height(){return 5;}
	
	public int getO21TopX(){return 400;}
	public int getO21TopY(){return 280;}
	public int getO21Width(){return 100;}
	public int getO21Height(){return 5;}
	
	public int getO22TopX(){return 400;}
	public int getO22TopY(){return 280;}
	public int getO22Width(){return 5;}
	public int getO22Height(){return 50;}
	
	public int getO23TopX(){return 400;}
	public int getO23TopY(){return 380;}
	public int getO23Width(){return 5;}
	public int getO23Height(){return 50;}
	
	public int getO24TopX(){return 400;}
	public int getO24TopY(){return 430;}
	public int getO24Width(){return 50;}
	public int getO24Height(){return 5;}
	
	public int getO25TopX(){return 500;}
	public int getO25TopY(){return 430;}
	public int getO25Width(){return 100;}
	public int getO25Height(){return 5;}
	
	public int getO26TopX(){return 400;}
	public int getO26TopY(){return 430;}
	public int getO26Width(){return 5;}
	public int getO26Height(){return 50;}
	
	public int getO27TopX(){return 400;}
	public int getO27TopY(){return 530;}
	public int getO27Width(){return 5;}
	public int getO27Height(){return 50;}
	
	public int getO28TopX(){return 400;}
	public int getO28TopY(){return 580;}
	public int getO28Width(){return 100;}
	public int getO28Height(){return 5;}
	
	public int getO29TopX(){return 550;}
	public int getO29TopY(){return 580;}
	public int getO29Width(){return 50;}
	public int getO29Height(){return 5;}
	
		public Level(int i) {
		
			level=i;
			
			// TODO Auto-generated constructor stub
		}
		
		public void draw(Graphics g){
			
			//left side
			g.setColor(Color.BLACK);
			g.fillRect(270,680,5,90);
			
			//right side
			g.setColor(Color.BLACK);
			g.fillRect(325,680,5,90);
			
			//top side
			g.setColor(Color.BLACK);
			g.fillRect(270,675,60,5);
			
			//left side two
			g.setColor(Color.BLACK);
			g.fillRect(270,30,5,90);
			
			//right side two
			g.setColor(Color.BLACK);
			g.fillRect(325,30,5,90);
			
			//top side two
			g.setColor(Color.BLACK);
			g.fillRect(270,120,60,5);
			
			
			//obstacles
			g.setColor(Color.BLACK);
			g.fillRect(0,750,130,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(470,700,130,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(0,660,130,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(75,500,5,100);
			
			g.setColor(Color.BLACK);
			g.fillRect(0,400,110,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(75,270,110,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(75,210,5,130);
			
			g.setColor(Color.BLACK);
			g.fillRect(0,140,150,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(0,50,130,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(470,50,130,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(330,120,80,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(490,110,5,80);
			
			g.setColor(Color.BLACK);
			g.fillRect(490,130,110,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(550,280,50,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,280,100,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,280,5,50);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,380,5,50);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,430,50,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(500,430,100,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,430,5,50);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,530,5,50);
			
			g.setColor(Color.BLACK);
			g.fillRect(400,580,100,5);
			
			g.setColor(Color.BLACK);
			g.fillRect(550,580,50,5);
			
			
			
		}
}
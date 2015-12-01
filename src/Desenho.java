
import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Desenho {

	JFrame j = new JFrame();
	
	public void janela_canvas(){
		
		
		j.setLocationRelativeTo(null);
		j.setBackground(Color.cyan);
		j.setSize(300, 350);
		j.setVisible(true);
		j.setTitle("Marca");
		j.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
		j.add(new desenharCanvas());
		
	}
		
	
	public class desenharCanvas extends Canvas{

		public void paint(Graphics g){
			g.drawLine(150, 0, 0, 300);
			g.drawLine(0, 300, 300, 100);
			g.drawLine(300, 100, 0, 100);
	        g.drawLine(0, 100, 300, 300);
	        g.drawLine(300, 300, 150, 0);
		}	
			
	}
	
}

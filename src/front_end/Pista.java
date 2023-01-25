package front_end;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Corrida_sapos.Sapos;
import Corrida_sapos.Sapo2;
import Corrida_sapos.Sapo3;
import Corrida_sapos.Sapo4;
import Corrida_sapos.Sapo5;

public class Pista {
	public BufferedImage ImagemFundo;
	public Color cor = new Color(243, 102, 88);
	public Color corBorda = new Color(171, 193, 69);
	
	public Pista(JLabel label) {
		label.setIcon(fundo());
	}
	
	public ImageIcon fundo() {
	
		ImagemFundo = new BufferedImage(1200, 265, BufferedImage.TYPE_INT_ARGB);
		Graphics graphics = ImagemFundo.createGraphics();
		graphics.setColor(cor);
	    
		
		//pintando a pista
		graphics.fillRect(10, 50, 1179, 100);
		
		graphics.setColor(corBorda);
		
		//pintando a grama
		graphics.fillRect(10, 10, 1179, 40);
		graphics.fillRect(10, 150, 1179, 40);
		
		graphics.setColor(Color.WHITE);
		//drawLine(10, 50, 1187, 50);
		//dividindo as trilhas de corrida
		graphics.drawLine(10, 70, 1187, 70);
		graphics.drawLine(10, 90, 1187, 90);
		graphics.drawLine(10, 110, 1187, 110);
		graphics.drawLine(10, 130, 1187, 130);
		//graphics.drawLine(10, 150, 1187, 150);
		
		//construção da linha de chegada
		graphics.setColor(Color.BLACK);
		graphics.fillRect(1179, 50, 10, 10);
		graphics.fillRect(1179, 70, 10, 10);
		graphics.fillRect(1179, 90, 10, 10);
		graphics.fillRect(1179, 110, 10, 10);
		graphics.fillRect(1179, 130, 10, 10);
		
		graphics.fillRect(1169, 60, 10, 10);
		graphics.fillRect(1169, 80, 10, 10);
		graphics.fillRect(1169, 100, 10, 10);
		graphics.fillRect(1169, 120, 10, 10);
		graphics.fillRect(1169, 140, 10, 10);
		
		
		graphics.setColor(Color.WHITE);
		graphics.fillRect(1179, 60, 10, 10);
		graphics.fillRect(1179, 80, 10, 10);
		graphics.fillRect(1179, 100, 10, 10);
		graphics.fillRect(1179, 120, 10, 10);
		graphics.fillRect(1179, 140, 10, 10);
		
		graphics.fillRect(1169, 50, 10, 10);
		graphics.fillRect(1169, 70, 10, 10);
		graphics.fillRect(1169, 90, 10, 10);
		graphics.fillRect(1169, 110, 10, 10);
		graphics.fillRect(1169, 130, 10, 10);
		
		Sapos s1 = new Sapos(1);
		Sapo2 s2 = new Sapo2(1);
		Sapo3 s3 = new Sapo3(1);
		Sapo4 s4 = new Sapo4(1);
		Sapo5 s5 = new Sapo5(1);
		new Thread(s1).start();
		new Thread(s2).start();
		new Thread(s3).start();
		new Thread(s4).start();
		new Thread(s5).start();
		
		return new ImageIcon(ImagemFundo);
	}
}

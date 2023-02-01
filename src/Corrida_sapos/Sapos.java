package Corrida_sapos;
import java.util.Random;

import javax.swing.JLabel;





public class Sapos extends Thread{
	private int salto;
	private JLabel frog; 
	public int distanciaMax;
	private String nome;

	public Sapos(int salto, JLabel frog, String nome) {
		super();
		this.frog = frog;
		this.salto = salto;
		this.nome = nome;
	}

	
	public void run() {
		MvFrog();
		
	}


	public void MvFrog() {
		while(distanciaMax <= 1160) {
			GerarInfo();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
					//TODO Auto-generated catch block
				e.printStackTrace();
			}
			salto = new Random().nextInt(2);
			frog.setLocation(frog.getX()+salto, frog.getY());
			distanciaMax += salto;
		}
	}
	public void GerarInfo() {
		System.out.println("Nome : " + nome + "\nSalto: " + salto + "\nDistancia Percorrida: " + distanciaMax + "\n\n");
	}

		
		
	
}

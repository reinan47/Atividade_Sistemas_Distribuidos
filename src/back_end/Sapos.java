package back_end;

import java.util.Random;

import javax.swing.JLabel;





public class Sapos extends Thread{
	private int salto;
	private JLabel frog; 
	private int distanciaMax;
	private String nome;
	static Object ordem = 0;

	public Sapos(int salto, JLabel frog, String nome) {
		super();
		this.frog = frog;
		this.salto = salto;
		this.nome = nome;
	}

	
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
				//TODO Auto-generated catch block
			e.printStackTrace();
		}
		MvFrog();
		System.out.println("---------------------   " + nome + " Chegou -----------------------");
	}


	public void MvFrog() {
		while(distanciaMax <= 1160) {
			
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
					//TODO Auto-generated catch block
				e.printStackTrace();
			}
			salto = new Random().nextInt(10);
			frog.setLocation(frog.getX()+salto, frog.getY());
			distanciaMax += salto;
			GerarInfo();
		}
		synchronized(ordem) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					//TODO Auto-generated catch block
				e.printStackTrace();
			}
			ordem = ordem.hashCode()+30;
			frog.setLocation(ordem.hashCode(), 170);
		}
		
	}
	public void GerarInfo() {
		System.out.println("Nome : " + nome + "\nSalto: " + salto + "\nDistancia Percorrida: " + distanciaMax + "\n\n");
	}

		
		
	
}

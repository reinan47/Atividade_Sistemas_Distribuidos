package back_end;

import java.util.Random;

import javax.swing.JLabel;





public class Sapos extends Thread{
	private int salto;
	private JLabel frog; 
	private int distanciaMax;
	private String nome;
	private static Object ordem = 780;
	private static int colocacao = 1;

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
	}


	public void MvFrog() {
		while(distanciaMax <= 1160) {
			
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			salto = new Random().nextInt(10);
			frog.setLocation(frog.getX()+salto, frog.getY());
			distanciaMax += salto;
			GerarInfo();
		}
		if(distanciaMax >= 1160) {
			frog.setLocation(1167, frog.getY());
		}
		synchronized(ordem) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("----- " + colocacao++ + "º" + " - " +  nome);
			ordem = ordem.hashCode()+53;
			frog.setLocation(ordem.hashCode(), 160);
		}
		
	}
	public void GerarInfo() {
		System.out.println("Nome : " + nome + "\nSalto: " + salto + "\nDistancia Percorrida: " + distanciaMax + "\n\n");
	}
		
	
}

package Corrida_sapos;

import java.util.Random;

public class Sapo2 extends Thread{
	private int salto;

	public Sapo2(int salto) {
		super();
		this.salto = salto;
	}

	public int getSalto() {
		return salto;
	}
	public void setSalto(int salto) {
		this.salto = salto;
	}
	
	public void run() {
		while(salto <= 1179) {
			System.out.println("TH -> 2 = " + salto);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			salto +=  new Random().nextInt(2);
		}
	}
}

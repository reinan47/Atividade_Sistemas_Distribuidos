package Corrida_sapos;

public class Sapo5 extends Thread{
	private int salto;

	public Sapo5(int salto) {
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
		if(salto == 0)
			salto++;
		System.out.println("TH -> 5 = " + salto);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

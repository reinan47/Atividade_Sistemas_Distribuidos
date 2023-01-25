package Corrida_sapos;

public class Corrida {
	public static void main(String args[]) throws InterruptedException {

			new Thread(new Sapo1(1)).start();
			new Thread(new Sapo2(1)).start();
			new Thread(new Sapo3(1)).start();
			new Thread(new Sapo4(1)).start();
			new Thread(new Sapo5(1)).start();
			Thread.sleep(1000);
	}
}

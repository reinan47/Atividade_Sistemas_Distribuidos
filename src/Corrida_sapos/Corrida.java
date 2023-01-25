package Corrida_sapos;

import java.util.Random;

public class Corrida {
	public static void main(String args[]) throws InterruptedException {
		while(true) {
			new Thread(new Sapo1(new Random().nextInt(6))).start();
			new Thread(new Sapo2(new Random().nextInt(6))).start();
			new Thread(new Sapo3(new Random().nextInt(6))).start();
			new Thread(new Sapo4(new Random().nextInt(6))).start();
			new Thread(new Sapo5(new Random().nextInt(6))).start();
			Thread.sleep(1000);
		}
	}
}

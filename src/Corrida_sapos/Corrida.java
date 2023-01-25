package Corrida_sapos;

public class Corrida{
	private Sapos s[];
	
	public Sapos[] getS() {
		return s;
	}
	public void setS(Sapos[] s) {
		this.s = s;
	}
	
	public Corrida() {
		for(int i = 0 ; i < 5 ; i++) {
			s[i] = new Sapos(1);
			s[i].start();
		}
	}
}

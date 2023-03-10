package front_end;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import back_end.Sapos;


public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JLabel plataforma = new JLabel();
	
	private JLabel colocacao = new JLabel(new ImageIcon(Panel.class.getResource("/resources/colocacao.png")));
	
	private JLabel chegada = new JLabel(new ImageIcon(Panel.class.getResource("/resources/chegada.png")));
	
	private JLabel s1 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo1.png")));
	
	private JLabel s2 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo2.png")));
	
	private JLabel s3 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo3.png")));
	
	private JLabel s4 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo4.png")));
	
	private JLabel s5 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo5.png")));
	
	
	
	/**
	 * Create the panel.
	 * @throws InterruptedException 
	 */
	public Panel(){
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		
		setBounds(new Rectangle(0,0,100,100));
		setLocale(null);
		this.setLayout(null);

		new Pista(plataforma);

		s1.setBounds(10, 60, 30, 21);
		
		s2.setBounds(10, 80, 30, 21);
		
		s3.setBounds(10, 100, 30, 21);
		
		s4.setBounds(10, 120, 30, 21);
		
		s5.setBounds(10, 140, 30, 21);
		
		colocacao.setBounds(800, 175, 300, 50);
		
		chegada.setBounds(1164, 10, 70, 200);

		add(s1);
		add(s2);
		add(s3);
		add(s4);
		add(s5);
		add(colocacao);
		add(chegada);

		
		plataforma.setBounds(0, 10, 1200, 265);
		add(plataforma);
		
		StarRun();

	}
	
	public void StarRun() {
		Sapos sapo1 = new Sapos(1,s1,"Zefa");
		Sapos sapo2 = new Sapos(1,s2,"Romildo");
		Sapos sapo3 = new Sapos(1,s3,"Karrie");
		Sapos sapo4 = new Sapos(1,s4,"Argus");
		Sapos sapo5 = new Sapos(1,s5,"Astrofonildo");
			
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}

}

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
	
	private JLabel s1 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo1.png")));
	
	private JLabel s2 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo2.png")));
	
	private JLabel s3 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo3.png")));
	
	private JLabel s4 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo4.png")));
	
	private JLabel s5 = new JLabel(new ImageIcon(Panel.class.getResource("/resources/Sapo5.png")));
	
	
	/**
	 * Create the panel.
	 * @throws InterruptedException 
	 */
	public Panel() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		
		setBounds(new Rectangle(0,0,100,100));
		setLocale(null);
		this.setLayout(null);

		new Pista(plataforma);

		s1.setBounds(10, 60, 20, 20);
		
		s2.setBounds(10, 80, 20, 20);
		
		s3.setBounds(10, 100, 20, 20);
		
		s4.setBounds(10, 120, 20, 20);
		
		s5.setBounds(10, 140, 25, 20);

		add(s1);
		add(s2);
		add(s3);
		add(s4);
		add(s5);	

		
		plataforma.setBounds(0, 10, 1200, 265);
		add(plataforma);
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

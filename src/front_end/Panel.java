package front_end;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		
		setBounds(new Rectangle(0,0,100,100));
		setLocale(null);
		JLabel plataforma = new JLabel();
		new Pista(plataforma);
		plataforma.setBounds(100, 100, 1200, 265);
		add(plataforma);	
	}

}

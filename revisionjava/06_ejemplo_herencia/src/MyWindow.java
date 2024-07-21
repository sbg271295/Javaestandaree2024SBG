import java.awt.Color;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	
	public MyWindow(String titulo) {
		super(titulo);
		setBounds(100,100,700,400);
		getContentPane().setBackground(Color.blue);
		setVisible(true);
	                               }
}

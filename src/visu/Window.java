package visu;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window() {
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		super.setSize(super.getToolkit().getScreenSize());
		
		super.setVisible(true);
		
		super.setJMenuBar(new Menu());
		
	}
}

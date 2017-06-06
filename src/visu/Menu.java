package visu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends JMenuBar {

	private JMenu options;
	private JMenuItem load;
	private JMenuItem exit;
	private JFileChooser chooser;
	
	public Menu() {
		
		this.options = new JMenu("Options");
		
		this.load = createLoadOption();
		this.exit = createExitOption();
		
		this.options.add(this.load);
		this.options.add(this.exit);
		
		super.add(this.options);
		
	}

	private JMenuItem createLoadOption() {
		
		final JMenuItem option = new JMenuItem("Load");
		
		option.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Only allow files to be selected
				chooser.showOpenDialog(load);
			}
		});
		
		
		return option;
	}

	private JMenuItem createExitOption() {
		
		JMenuItem option = new JMenuItem("Exit");
		
		option.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(exit, "Are you sure you want to exit?",
						"Exit", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(answer == 0)
					System.exit(0);
			}
		});
		
		return option;
	}
	
}

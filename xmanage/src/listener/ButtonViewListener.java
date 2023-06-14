package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.FoodViwer;
import gui.WindowFrame;
import xmanage.OrganizeManagement;

public class ButtonViewListener implements ActionListener {
	private OrganizeManagement omm;
	public ButtonViewListener(OrganizeManagement omm) {
//		this.frame = frame;
		this.omm = omm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		JButton b = (JButton) e.getSource();
		FoodViwer fv = new FoodViwer(omm);
		System.out.println("FoodViewer");
		
//		FoodViwer fv = frame.getFoodViwer();
		
//		JPanel p = new JPanel();
//		p.add(fv);
//		frame.setupPanel(p);
	}

	

}

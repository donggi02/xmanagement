package listener;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.FoodAdder;
import gui.WindowFrame;
	
public class ButtonAddListener implements ActionListener {
	
//	WindowFrame frame;
	public ButtonAddListener() {
//		this.frame = frame;
	} 
	@Override
	public void actionPerformed(ActionEvent e) {
//		JButton b =(JButton) e.getSource();
//		FoodAdder adder = frame.getFoodAdder();
		
//		JPanel p = new JPanel();
//		p.add(adder);
//		frame.setupPanel(p);
		
		FoodAdder fa = new FoodAdder();

	}

}

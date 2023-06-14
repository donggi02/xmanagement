package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAddListener;
import listener.ButtonViewListener;
import xmanage.OrganizeManagement;

public class MenuSelection extends JPanel {
//	WindowFrame frame;
	OrganizeManagement omm;
	public MenuSelection(WindowFrame frame) {
//		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel label1 = new JLabel();
		
		JButton button1 = new JButton("1. Add Food");
		JButton button2 = new JButton("2. Delete Food");
		JButton button3 = new JButton("3. Edit Food");
		JButton button4 = new JButton("4. View Food");
		JButton button5 = new JButton("5. Exit");
		
		button1.addActionListener(new ButtonAddListener());
		button4.addActionListener(new ButtonViewListener(omm));
		
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);

		
	}
}

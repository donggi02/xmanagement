package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.*;

public class FoodAdder extends JFrame{
	public FoodAdder() {
		JPanel panel1 = new JPanel();
		SpringLayout spl = new SpringLayout();
		panel1.setLayout(spl);
		
		JLabel labelFoodName = new JLabel("FoodName:", JLabel.TRAILING);
		JTextField fieldFoodName = new JTextField(10);
		labelFoodName.setLabelFor(fieldFoodName);
		panel1.add(labelFoodName);
		panel1.add(fieldFoodName);
		
		JLabel labelFoodKind = new JLabel("FoodKind:", JLabel.TRAILING);
		JTextField fieldFoodKind = new JTextField(10);
		labelFoodName.setLabelFor(fieldFoodKind);
		panel1.add(labelFoodKind);
		panel1.add(fieldFoodKind);
		
		JLabel labelFoodSpicness = new JLabel("FoodSpicness:", JLabel.TRAILING);
		JTextField fieldFoodSpicness = new JTextField(10);
		labelFoodName.setLabelFor(fieldFoodSpicness);
		panel1.add(labelFoodSpicness);
		panel1.add(fieldFoodSpicness);
		
		panel1.add(new JButton("save"));
		panel1.add(new JButton("cancel"));
	
		SpringUtilities.makeCompactGrid(panel1, 4,2,6,6,6,6);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel1);
		this.setVisible(true);
	}
}

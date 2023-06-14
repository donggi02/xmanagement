package gui;

import java.awt.BorderLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xmanage.FoodManager;
import xmanage.OrganizeManagement;

public class WindowFrame extends JFrame{
	OrganizeManagement omm;
	
	MenuSelection ms;
	FoodAdder fa;
	FoodViwer fv;
	
	public WindowFrame(OrganizeManagement omm) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Food");

		this.omm = omm;
		ms = new MenuSelection(this); // Panel
		
//		JPanel p = new JPanel();
		this.add(ms);
		
//		this.setupPanel(p);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuSelection() {
		return ms;
	}

	public void setMenuSelection(MenuSelection ms) {
		this.ms = ms;
	}

	public FoodAdder getFoodAdder() {
		return fa;
	}

	public void setFoodAdder(FoodAdder fa) {
		this.fa = fa;
	}

	public FoodViwer getFoodViwer() {
		return fv;
	}

	public void setFoodViwer(FoodViwer fv) {
		this.fv = fv;
	} 
}

package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FoodViwer extends JFrame {
	public FoodViwer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("음식 이름:");
		model.addColumn("음식 종류:");
		model.addColumn("음식 맵기:");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}

package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import xmanage.CalculusFood;
import xmanage.Food;
import xmanage.FoodManager;
import xmanage.OrganizeManagement;

public class FoodViwer extends JFrame {
//	WindowFrame frame;
	OrganizeManagement omm;
	public FoodViwer(OrganizeManagement omm ) {
//		this.frame = frame;
		this.omm = omm;
		
//		System.out.println("***"+ omm.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("음식 이름:");
		model.addColumn("음식 종류:");
		model.addColumn("음식 맵기:");
		if (omm != null) {
			for(int i = 0; i<omm.size();i++) {
				Vector row = new Vector();
				Food f = omm.get(i);
				row.add(f.getName());
				row.add(f.getType());
				row.add(f.getSpicness());
				model.addRow(row);
			
			}
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300,200);
//		this.add(panel1);
		this.setVisible(true);
	}
}

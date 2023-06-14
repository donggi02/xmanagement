package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.*;

public class FoodAdder extends JFrame {
	
	WindowFrame frame;
	
	public FoodAdder() {
//		this.frame = frame;
		
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
		
		JButton saveButton = new JButton("save");
        panel1.add(saveButton);

        JButton cancelButton = new JButton("cancel");
        panel1.add(cancelButton);
		saveButton.addActionListener(e -> {
	            String foodName = fieldFoodName.getText();
	            String foodKind = fieldFoodKind.getText();
	            String foodSpicness = fieldFoodSpicness.getText();

	            // 입력된 값들을 처리하는 로직을 작성합니다.
	            // 예를 들어, 값들을 파일에 저장하거나 다른 객체에 전달할 수 있습니다.
	            // 이 예시에서는 그냥 콘솔에 출력합니다.
	            System.out.println("Food Name: " + foodName);
	            System.out.println("Food Kind: " + foodKind);
	            System.out.println("Food Spicness: " + foodSpicness);
	        });
	
		SpringUtilities.makeCompactGrid(panel1, 4,2,6,6,6,6);
	
		this.setSize(300,200);
		this.add(panel1);
		this.setVisible(true);
	}
}

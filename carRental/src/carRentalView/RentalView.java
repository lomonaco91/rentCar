package carRentalView;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RentalView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel = new JPanel();
	private JTextField typeVehicle = new JTextField(10);
	private JTextField quantityOfPeople = new JTextField(10);
	private JTextField initialDate = new JTextField(10);
	private JTextField finalDate = new JTextField(10);
	private JLabel lbTypeVehicle = new JLabel("Type of car: ");
	private JLabel lbQuantityOfPeople = new JLabel("Quantity of peoples: ");
	private JLabel lbInitialDate = new JLabel("Initial Date: ");
	private JLabel lbFinalDate = new JLabel("Final Date: ");
	private GridLayout grd = new GridLayout(5, 2, 5, 5);
	private JButton btnCalculate = new JButton("Check Value");
	
	public RentalView(){
		
		//main panel
		this.buildView();
		setVisible(true);
		setSize(400,250);
		setTitle("Rent Car System");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnCalculate.setBackground(Color.RED);
		btnCalculate.setForeground(Color.WHITE);
		
		btnCalculate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	
	}
	
	public void buildView(){
		mainPanel.setLayout(grd);
		
		mainPanel.add(lbTypeVehicle);
		mainPanel.add(typeVehicle);
		
		mainPanel.add(lbQuantityOfPeople);
		mainPanel.add(quantityOfPeople);
		
		mainPanel.add(lbInitialDate);
		mainPanel.add(initialDate);
		
		mainPanel.add(lbFinalDate);
		mainPanel.add(finalDate);
		
		mainPanel.add(btnCalculate);
		
		this.getContentPane().add(mainPanel);
	}
}

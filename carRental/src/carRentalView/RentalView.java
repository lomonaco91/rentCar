package carRentalView;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;

import validationModel.Validation;

public class RentalView extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel mainPanel = new JPanel();
	private JComboBox<String> carTypes = new JComboBox<String>();
	private JComboBox<Integer> qtOfPeople = new JComboBox<Integer>();
	private JDateChooser initialDate = new JDateChooser();	
	private JDateChooser finalDate = new JDateChooser();
	private JLabel lbTypeVehicle = new JLabel("Model: ");
	private JLabel lbQuantityOfPeople = new JLabel("Quantity of peoples: ");
	private JLabel lbInitialDate = new JLabel("Initial Date: ");
	private JLabel lbFinalDate = new JLabel("Final Date: ");
	private GridLayout grd = new GridLayout(5, 2, 5, 5);
	private JButton btnCalculate = new JButton("Check Value");
	private Validation validation = new Validation();
	
	public RentalView(){
		
		//main panel
		this.buildView();
		setVisible(true);
		setSize(400,250);
		setTitle("Rent Car System");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//list of car types
		carTypes.addItem("Compact-Car");
		carTypes.addItem("Sports-Car");
		carTypes.addItem("SUV's");
		
		//list of quantity of peoples 1-7 according of the test
		qtOfPeople.addItem(1);
		qtOfPeople.addItem(2);
		qtOfPeople.addItem(3);
		qtOfPeople.addItem(4);
		qtOfPeople.addItem(5);
		qtOfPeople.addItem(6);
		qtOfPeople.addItem(7);
		
		//date mask ex: 21/02/2017 Terça-feira
		initialDate.setDateFormatString("dd/MM/yyyy" + " " + "(EEEEEE)");
		finalDate.setDateFormatString("dd/MM/yyyy" + " " + "(EEEEEE)");
			
		//buttonCalculate
		btnCalculate.setBackground(Color.RED);
		btnCalculate.setForeground(Color.WHITE);
		
		btnCalculate.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String quantity = qtOfPeople.getSelectedItem().toString();
				int quantityAux = Integer.parseInt(quantity);
				String model = carTypes.getSelectedItem().toString();
				
				if(validation.carModel_qtPeople(model, quantityAux)){
					System.exit(0);
				}
				else{

					JOptionPane.showMessageDialog(null, 
							"The car model does not match the number of passengers!!!", 
							"Error", 
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				
				//verificar
				System.out.println("MODELO: " + carTypes.getSelectedItem().toString() + " " + "QTD Pes.:" 
				+ qtOfPeople.getSelectedItem().toString() + " "+
				"DATA In:" + initialDate.getDate().getDay() + " " + "DATA Fi:" + finalDate.getDate().getDay());
				
			}
			
		});
		
	}
	
	public void buildView(){
		mainPanel.setLayout(grd);
		
		mainPanel.add(lbTypeVehicle);
		mainPanel.add(carTypes);

		mainPanel.add(lbQuantityOfPeople);
		mainPanel.add(qtOfPeople);
		
		mainPanel.add(lbInitialDate);
		mainPanel.add(initialDate);
		
		mainPanel.add(lbFinalDate);
		mainPanel.add(finalDate);
		
		mainPanel.add(btnCalculate);
		
		this.getContentPane().add(mainPanel);
	}
}

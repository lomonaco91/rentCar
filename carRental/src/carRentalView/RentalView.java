package carRentalView;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import com.toedter.calendar.JDateChooser;
import rentalCalculate.CalculateValue;
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
	private JTextArea jtaResult = new JTextArea();
	private CalculateValue calc = new CalculateValue();
	Border border = BorderFactory.createLineBorder(Color.BLACK);
	Date currentTime;
	Font font = new Font("Arial", Font.BOLD, 11);	
	
	public RentalView(){
		
		//main panel
		this.buildView();
		
		setVisible(true);
		setSize(500,350);
		setTitle("Rent Car System");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//list of car types
		carTypes.addItem("Compact-Car");
		carTypes.addItem("Sports-Car");
		carTypes.addItem("SUV's");
		
		//Area of results
		jtaResult.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		jtaResult.setEditable(false);
		jtaResult.setFont(font);
		
		//list of quantity of peoples 1-7 according of the test
		qtOfPeople.addItem(1);
		qtOfPeople.addItem(2);
		qtOfPeople.addItem(3);
		qtOfPeople.addItem(4);
		qtOfPeople.addItem(5);
		qtOfPeople.addItem(6);
		qtOfPeople.addItem(7);
		
		//date mask ex: 21/02/2017 Terça-feira
		//initialDate.getDate();
		currentTime = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.format(currentTime);
		initialDate.setDate(currentTime);
		finalDate.setDate(currentTime);

		//buttonCalculate
		btnCalculate.setBackground(Color.RED);
		btnCalculate.setForeground(Color.WHITE);
		btnCalculate.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		
		btnCalculate.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//main variables
				String quantity = qtOfPeople.getSelectedItem().toString();
				int quantityAux = Integer.parseInt(quantity);
				String model = carTypes.getSelectedItem().toString();
				Integer initDateAux = initialDate.getDate().getDay();
				Integer finalDateAux = finalDate.getDate().getDay();
				
				//date empty validation
				if(validation.isNullDate(initDateAux, finalDateAux)){
					JOptionPane.showMessageDialog(null, 
							"Date field can not be empty", 
							"Error", 
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				
				//validation model x qt of people and calculateValue
				if(validation.carModel_qtPeople(model, quantityAux)){
					
					//calculate
					jtaResult.setText(calc.calcValue(model, initDateAux, finalDateAux));
				}
				else{

					JOptionPane.showMessageDialog(null, 
							"The car model does not match the number of passengers!", 
							"Error", 
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				
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
		mainPanel.add(jtaResult);
		
		this.getContentPane().add(mainPanel);
	}
}

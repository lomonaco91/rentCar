package rentalCalculate;

public class CalculateValue {
	
	private String resultRegular;
	private String resultFidelity;
	private String finalResult;
	
	public String calcValue(String model, int initDate, int finalDate){
		
		switch(model){
		
		case "Compact-Car":
			
			//one day
			if(initDate == finalDate){
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					resultRegular = ("R$ 200,00 ");
					resultFidelity = ("R$ 90,00 ");
					finalResult = ("**SouthCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
					break;
				}
				
				else{
					
				}
				
			}
			
		case "Sports-Car":
			
			//one day
			if(initDate == finalDate){
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					resultRegular = ("R$ 200,00 ");
					resultFidelity = ("R$ 90,00 ");
					finalResult = ("**WestCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
					break;
				}
				
				else{
					
				}
				
			}
			
		case "SUV's":
			
			//one day
			if(initDate == finalDate){
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					resultRegular = ("R$ 600,00 ");
					resultFidelity = ("R$ 590,00 ");
					finalResult = ("**NorthCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
					break;
				}
				
				else{
					
				}
				
			}
			
		
		}
		
		return finalResult; 
				
	}

}

package rentalCalculate;

public class CalculateValue {
	
	private String resultRegular;
	private String resultFidelity;
	private String finalResult;
	private float auxVarCalcReg;
	private float auxVarCalcFid;
	
	public String calcValue(String model, int initDate, int finalDate){
		
		if (model == "Compact-Car"){
			
			//weekend
			if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
				resultRegular = ("R$ 200");
				resultFidelity = ("R$ 90");
				finalResult = ("**SouthCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
				
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 210;
				auxVarCalcFid = (finalDate - initDate) * 150;
				finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		if (model == "Sports-Car"){
			
			//weekend
			if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
				resultRegular = ("R$ 200");
				resultFidelity = ("R$ 90");
				finalResult = ("**WestCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
				
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 530;
				auxVarCalcFid = (finalDate - initDate) * 150;
				finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		if (model == "SUV's"){
			
			//weekend
			if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
				resultRegular = ("R$ 600");
				resultFidelity = ("R$ 590");
				finalResult = ("**SouthCar**" + "\n" + "REGULAR:"+ resultRegular + "\n" + "FIDELITY:" + resultFidelity);
				
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 630;
				auxVarCalcFid = (finalDate - initDate) * 580;
				finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		return finalResult; 
				
	}

}

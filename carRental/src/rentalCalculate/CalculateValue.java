package rentalCalculate;

public class CalculateValue {
	
	private String finalResult;
	private float auxVarCalcReg;
	private float auxVarCalcFid;
	
	public String calcValue(String model, int initDate, int finalDate){
		
		if (model == "Compact-Car"){
			
			//oneDay
			if(initDate == finalDate){
				
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$200"+ "\n" + "FIDELITY: R$90");
				}
				
				//week 
				else{
					
					//without saturday or sunday
					if(initDate != 0 || initDate != 6 && finalDate != 0 || finalDate != 6){
						finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$210"+ "\n" + "FIDELITY: R$150");
					}
					
					//with saturday or sunday
					if(finalDate == 0 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200*2) + ((finalDate - initDate)-2) * 210;
						auxVarCalcFid = (90*2) + ((finalDate - initDate)-2) * 150;
						finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(finalDate == 6 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200) + ((finalDate - initDate)-1) * 210;
						auxVarCalcReg = (90) + ((finalDate - initDate)-1) * 150;
						finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
						
					}
					if(initDate == 0 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200) + (finalDate * 210);
						auxVarCalcFid = (90) + (finalDate * 150);
						finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(initDate == 6 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200 * 2) + (finalDate * 210);
						auxVarCalcFid = (90 * 2) + (finalDate * 150);
						finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
				}
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 210;
				auxVarCalcFid = (finalDate - initDate) * 150;
				finalResult = ("**SouthCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		if (model == "Sports-Car"){
			
			//oneDay
			if(initDate == finalDate){
				
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					finalResult = ("**WestCar**" + "\n" + "REGULAR: R$200"+ "\n" + "FIDELITY: R$90");
				}
				
				//week 
				else{
					
					//without saturday or sunday
					if(initDate != 0 || initDate != 6 && finalDate != 0 || finalDate != 6){
						finalResult = ("**WestCar**" + "\n" + "REGULAR: R$530"+ "\n" + "FIDELITY: R$150");
					}
					
					//with saturday or sunday
					if(finalDate == 0 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200*2) + ((finalDate - initDate)-2) * 530;
						auxVarCalcFid = (90*2) + ((finalDate - initDate)-2) * 150;
						finalResult = ("**WestCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(finalDate == 6 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200) + ((finalDate - initDate)-1) * 530;
						auxVarCalcReg = (90) + ((finalDate - initDate)-1) * 150;
						finalResult = ("**WestCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
						
					}
					if(initDate == 0 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200) + (finalDate * 530);
						auxVarCalcFid = (90) + (finalDate * 150);
						finalResult = ("**WestCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(initDate == 6 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200 * 2) + (finalDate * 530);
						auxVarCalcFid = (90 * 2) + (finalDate * 150);
						finalResult = ("**WestCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
				}
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 530;
				auxVarCalcFid = (finalDate - initDate) * 150;
				finalResult = ("**WestCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		if (model == "SUV's"){
			
			//oneDay
			if(initDate == finalDate){
				
				//weekend
				if(initDate == 0 || initDate == 6 && finalDate == 0 || finalDate == 6){
					finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$200"+ "\n" + "FIDELITY: R$90");
				}
				
				//week 
				else{
					
					//without saturday or sunday
					if(initDate != 0 || initDate != 6 && finalDate != 0 || finalDate != 6){
						finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$600"+ "\n" + "FIDELITY: R$590");
					}
					
					//with saturday or sunday
					if(finalDate == 0 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200*2) + ((finalDate - initDate)-2) * 630;
						auxVarCalcFid = (90*2) + ((finalDate - initDate)-2) * 580;
						finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(finalDate == 6 && initDate !=0 || initDate!=6){
						auxVarCalcReg = (200) + ((finalDate - initDate)-1) * 630;
						auxVarCalcReg = (90) + ((finalDate - initDate)-1) * 580;
						finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
						
					}
					if(initDate == 0 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200) + (finalDate * 630);
						auxVarCalcFid = (90) + (finalDate * 580);
						finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
					if(initDate == 6 && finalDate!=0 || finalDate!=6){
						auxVarCalcReg = (200 * 2) + (finalDate * 630);
						auxVarCalcFid = (90 * 2) + (finalDate * 580);
						finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$" + auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
					}
				}
			}
			
			//not weekend
			else {
						
				auxVarCalcReg = (finalDate - initDate) * 630;
				auxVarCalcFid = (finalDate - initDate) * 580;
				finalResult = ("**NorthCar**" + "\n" + "REGULAR: R$"+ auxVarCalcReg + "\n" + "FIDELITY: R$" + auxVarCalcFid);
			
			}
		}
		
		return finalResult; 
				
	}

}

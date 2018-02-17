package validationModel;

public class Validation {
	
	private boolean res;
	
	public boolean carModel_qtPeople(String carModel, int qt){
	
		switch(carModel){
		
			case "Compact-Car":
				if(qt <=4){
					res = true;
					break;
				}
				else{
					res = false;
					break;
				}
				
			case "Sports-Car":
				if(qt <=2){
					res = true;
					break;
				}
				else{
					res = false;
					break;
				}
				
			case "SUV's":
				if(qt <=7){
					res = true;
					break;
				}
				else{
					res = false;
					break;
				}
			}
		
		return res;
	}
}
		



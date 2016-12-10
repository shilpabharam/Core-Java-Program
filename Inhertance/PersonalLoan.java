class PersonalLoan extends Loan{
 
	PersonalLoan(){	
	}
	
	PersonalLoan(String holderName,float amount,float interest,int dur){
			super(holderName,amount, interest, dur);
	}
	
	public void personalLoanProcess(float amt){
		float discount = amt - 5000;
	    System.out.println("Discount is" +discount);
	}
	
	public static void main(String args[]){
	Loan pLoan  = new Loan("shilpa",30000f,1.5f,12);
	pLoan.deposite(5000);
	pLoan.emiCalculater();
	//pLoan.personalLoanProcess(pLoan.loanAmount);
	// System.out.println("name is" +pLoan.loanHolder);		
	}
}

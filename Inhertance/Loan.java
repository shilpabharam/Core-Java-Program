class Loan{

	String loanHolder;
	float loanAmount;
	float interestRate;
	int duration;
	float emi;
	
	void emiCalculater(){
	   emi = (loanAmount/duration) +((loanAmount * (interestRate /100))/duration);
	   System.out.println("Emi is" +emi);
	}

	void deposite(int amt){
	   loanAmount = loanAmount - amt;
	   System.out.println("Remaining Loan amount is" +loanAmount);
	}
	
	Loan(){}

	Loan(String holderName,float amount,float interest,int dur){
		loanHolder = holderName;
		loanAmount = amount;
		interestRate = interest;
		duration = dur;	
	}

}





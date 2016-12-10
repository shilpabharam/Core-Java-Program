class Account{

	String accountHolder;
	int accountNumber;
	int amount;

	void deposite(int amt){
	   amount = amount+amt;
	}

	void withdrow(int amt){
	   amount = amount - amt;
	}
	
	Account(String name,int accNum,int amt){
		accountHolder = name;
		accountNumber = accNum;
		amount = amt;
	}
	
	
	public static void main(String args[]){
	
	Account myAcc = new Account("shilpa",101,1000);
	System.out.println("name is" +myAcc.accountHolder +"number is" + myAcc.accountNumber + "amount is " +myAcc.amount);
	
	String accountHolder="shilp";
	int accountNumber;
	int amount;
	
	//Account myAccount = new Account();
		
		//System.out.println("name is" +myAccount.accountHolder +"number is" + myAccount.accountNumber + "amount is " +myAccount.amount);
	//myAcc.deposite(1000);


	
	//System.out.println(myAccount.accountHolder);
	
	
	
}

}





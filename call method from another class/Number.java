class Number{

private int firstNumber;
private int secontNumber;

private void sum(){
   int result = firstNumber + secontNumber;
   	System.out.println("result is" +result);
}

	public static void main(String args[]){

	Number num  = new Number();

	num.firstNumber = 10;
	num.secontNumber = 20;

	num.sum();
	}
}
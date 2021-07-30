package week3_Day1Assignment3;

/*Assignment3:
============
    Class     :BankInfo
    Methods   :saving(),fixed(),deposit()

     Class    :AxisBank
     Methods  :deposit()

Description:
You have to override the method deposit in AxisBank.*/
public class AxisBank extends BankInfo {
	
	public void deposit() {

		System.out.println("Deposit 8 Lakh");
	}

	public static void main(String[] args) {
		
		AxisBank obj=new AxisBank();
		obj.savings();
		obj.fixed();
		obj.deposit();
	}

}

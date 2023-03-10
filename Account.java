package Bankingapp;

abstract public class Account extends Address
/*The Account class Inherite the Address class
 *Account class is Subclass of Address class
 * Address class is Super class of Accountclass
 * */
{
	protected long AccountNo;
	protected String HolderName;
	protected double AccountBalance;
	protected Address HolderAddress;//create a HolderAddress reference variable datatype is Address because it is object type
	public Account(long accountNo, String holderName, double accountBalance,String DoorNo,String StreetName,String District,String State,int Pincode) {
		super(DoorNo,StreetName,District,State,Pincode);
		AccountNo = accountNo;
		HolderName = holderName;
		AccountBalance = accountBalance;
		System.out.println("Accoount no : "+accountNo);
		System.out.println("Account Holder Name : "+holderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Holder Address : ");
		System.out.println("Door No : "+super.DoorNo);
		System.out.println("Street Name : "+super.StreetName);
		System.out.println("District : "+super.District);
		System.out.println("State : "+super.State);
		System.out.println("Pincode : "+super.Pincode);
	}
	abstract void DepositeAmount(double amount);/*abstract method because function it will change 
	                                            based on type of account so we create a abstract 
	                                            methods here(Abstraction)*/
	abstract void WithdrawAmount(double amount);
	/*Balance Enquiry is same for all type of banking application 
	 * it just show your account balance so, we declare the method declaretion and 
	 * method definition here it is a concrete method */
	protected void BalanceEnquiry() {
		System.out.println("Your Account Balance : "+AccountBalance);
	}
}

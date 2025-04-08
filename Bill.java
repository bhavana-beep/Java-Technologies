class Bill
{
 
  //class is a design/template/blueprint which contains states and behaviours

  
  Bill()
  {
  System.out.println("Bill constructor is invoked");
  }
  
  
  Bill(String billReferenceNo,String billIssueDate,String billDueDate,String billAmount,boolean isBillOverDue,boolean isBillPaid, String serviceProvider)
  {
	this();
		this.billReferenceNo = billReferenceNo;
		this.billIssueDate = billIssueDate;
		this.billDueDate = billDueDate;
		this.billAmount = billAmount;
		this.isBillOverDue= isBillOverDue;
		this.isBillPaid= isBillPaid;
		this.serviceProvider = serviceProvider;
  }
  
  //states - refered as variables
	String billReferenceNo;
	String billIssueDate;
	String billDueDate;
	String billAmount;
	boolean isBillOverDue;
	boolean isBillPaid;
	String serviceProvider;
	
	
	
	//Behaviours- refered as method(methods a block of code which is used to perform functionality)
	//We use method for code reusability
	public void showBillInfo()
	{
		System.out.println("Your Bill is Ready!!");
		System.out.println("Your Bill Ref No is "+ billReferenceNo);
		System.out.println("Your Bill issue date is "+ billIssueDate);
		System.out.println("Your Bill due date is "+ billDueDate);
		System.out.println("Your Bill amount is "+billAmount);
		System.out.println("Your Bill Over due"+isBillOverDue);
		System.out.println("Your Bill paid "+isBillPaid);
		System.out.println("Your Bill Provider is "+serviceProvider);
	}
}
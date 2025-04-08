class LinkedIn
{
	public static String linkedInLogin(String emailId, String pwd)
	{
	String msg = null;
        if(emailId=="bhavanaashrit@gmail.com" && emailId!= null && pwd=="Bhavana" && pwd!= null)
            msg = "Login is successful using email and password";
        else
            msg = "Login is unsuccessful. Please check your email and password.";
            return msg;
	}
	
	
	
	 public static String linkedInLogin(Long phoneNumber, String pwd)
    {
        String msg = null;
        if(phoneNumber == 7892997335L && pwd=="Bhavana" && pwd!= null)
            msg = "Login is successful using phone number and password  ";
        else
            msg = "Login is unsuccessful. Please check your phone number and password.";
     return msg;
	}
}
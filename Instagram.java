class Instagram
{
	public static String instaLogin(String email, String pwd)
	{
	String msg = null;
        if(email=="bhavanaashrit@gmail.com" && email!= null && pwd=="Bhavana" && pwd!= null)
            msg = "Login is successful using email and password";
        else
            msg = "Login is unsuccessful. Please check your email and password.";
            return msg;
	}
	
	
	
	 public static String instaLogin(Long phoneNumber, String pwd)
    {
        String msg = null;
        if(phoneNumber == 7892997335L && pwd=="Bhavana" && pwd!= null)
        {
            msg = "Login is successful using phone number and password  ";
        }
        else
        {
            msg = "Login is unsuccessful. Please check your phone number and password.";
        }
        return msg;
	}
}
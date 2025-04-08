class FacebookRunner
{
	public static void main(String log[])
	{
		String emailId = "bhavanaashrit@gmail.com";
        String pwd = "Bhavana";
        Long phoneNumber = 7892997335L; 

        String emailLog = Facebook.facebookLogin(emailId, pwd);
        System.out.println(emailLog);

        String phoneLog = Facebook.facebookLogin(phoneNumber, pwd);
        System.out.println(phoneLog);
	}
 }
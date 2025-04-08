class LinkedInRunner
{
	public static void main(String log[])
	{
		String emailId = "bhavanaashrit@gmail.com";
        String pwd = "Bhavana";
        Long phoneNumber = 7892997335L; 

        String emailLog = LinkedIn.linkedInLogin(emailId, pwd);
        System.out.println(emailLog);

        String phoneLog = LinkedIn.linkedInLogin(phoneNumber, pwd);
        System.out.println(phoneLog);

	}
 }
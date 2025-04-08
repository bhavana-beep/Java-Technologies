class SnapchatRunner
{
	public static void main(String log[])
	{
		String emailId = "bhavanaashrit@gmail.com";
        String pwd = "Bhavana";
        Long phoneNumber = 7892997335L; 

        String emailLog = Snapchat.snapchatLogin(emailId, pwd);
        System.out.println(emailLog);

        String phoneLog = Snapchat.snapchatLogin(phoneNumber, pwd);
        System.out.println(phoneLog);
	}
 }
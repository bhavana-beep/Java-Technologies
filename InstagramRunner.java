class InstagramRunner
{
	public static void main(String log[])
	{
		String email = "bhavanaashrit@gmail.com";
        String pwd = "Bhavana";
        Long phoneNumber = 7892997335L; 

        String emailLog = Instagram.instaLogin(email, pwd);
        System.out.println(emailLog);

        String phoneLog = Instagram.instaLogin(phoneNumber, pwd);
        System.out.println(phoneLog);

	
	}
 }
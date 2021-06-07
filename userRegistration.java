import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface validInterface
{
	public boolean validate(String pattern,String Input);
}
	public class userRegistration {

		static final String namePattern = "^[A-Z][a-z]{3,30}$";
		static final String emailPattern = "^[0-9a-zA-Z]+ *([.+-_]?[a-zA-Z0-9]+)"+"@([a-zA-Z0-9][-]?)+[.][a-zA-Z ]{2,4}([.][a-zA-Z]{2,3})?$";
		static final String phoneNumPattern = "^[0-9]{2}\\s[0-9]{10}";
		static validInterface validater = (pattern,input)-> Pattern.compile(pattern).matcher(input).matches(); 
		public boolean validateName(String name) throws UserRegistrationException
	{
		if(validater.validate(namePattern,name))
		{
			System.out.println(name);
			return true;
		}
		else
		{
			throw new UserRegistrationException(name+"is not valid. Enter valid Name");
		}
	}
	public boolean validatePhoneNum(String PhoneNum) throws UserRegistrationException 
	{
		if(validater.validate(phonePattern,PhoneNum))
		{
			System.out.println(PhoneNum);
			return true;
		}
		else
		{
			throw new UserRegistrationException(PhoneNum+" is not valid. Enter valid number");
		}
	}
	public static boolean validateEmailId(String emailId)throws UserRegistrationException 
	{
		if(validater.validate(emailPattern,emailId))
		{
			System.out.println(emailId);
			return true;
		}
		else
		{
			throw new UserRegistrationException(emailId+"is not valid. Enter Valid emailId");
		}

	}
}

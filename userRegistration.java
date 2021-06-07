import java.util.Arrays;
import java.util.Collection;

	public class emailVerification {

	private String emailCheck;
	private boolean expectedResult;

	public emailVerification(String emailCheck, boolean expectedResult)
	{
		this.emailCheck=emailCheck;
		this.expectedResult=expectedResult;
	}

	public static Collection getInput()
	{
		return Arrays.asList(new Object[][] {

			 { "abc@yahoo.com",true},
			 { "abc-100@yahoo.com",true},
			 {"abc.100@yahoo.com",true},
			 {"abc111@abc.com",true},
			 {"abc-100@abc.net",true},
			 {"abc.100@abc.com.au",true},
			 {"abc@1.com",true},
			 {"abc@gmail.com.com",true},
			 {"abc+100@gmail.com",true},
			 {"abc",false},
			 {"abc@.com.my",false},
			 {"abc123@gmail.a",false},
			 {"abc123@.com",false},
			 {"abc123@.com.com",false},
			 {"abc()*@gmail.com",false},
			 {".abc@abc.com",false},
			 {"abc()*@gmail.com",false},
			 {"abc@%*.com",false},
			 {"abc.@gmail.com",false},
			 {"abc@gmail.com.1a",false},
			 {"abc@gmail.com.aa.au",false},
			 {"abc....2002@gmail.com",false}

		});
	}
}


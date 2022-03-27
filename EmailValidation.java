import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args)
    {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_-]+@[a-zA-Z0-9.{1}]+$");

        // Input list
        List<String> emails = Arrays.asList("abc@yahoo.com", "abc@.com.my",
                "abc.100@yahoo.com", "abc+100@gmail.com","abc123@.com","abc123@.com.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com");

        for(String email : emails)
        {
            Matcher matcher = pattern.matcher(email);

            if(matcher.matches())
            {
                System.out.println(email);
            }
            else {
                System.out.println("Email not Valid");

            }
        }
    }
}



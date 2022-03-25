import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String FirstName = sc.nextLine();
        System.out.println(validFirstName(FirstName));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter last name");
        String LastName = sc1.next();
        System.out.println(validLastName(LastName));
        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter Email Address");
        String Email = sc3.nextLine();
        System.out.println(validEmail(Email));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        System.out.println(validPhoneNum(phoneNo));
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter password");
        String P = sc5.nextLine();
        System.out.println(validPassWord(P));



    }
    public static String validFirstName(String firstName) {
        String P = "^[A-Z][a-z]{3,30}$";
        Pattern p3 = Pattern.compile(P);
        Matcher m3 = p3.matcher(firstName);
        boolean r3 = m3.matches();
        if (r3) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        return firstName;
    }

    public static String validLastName(String lastname) {


        Pattern LastName = Pattern.compile(lastname, Pattern.CASE_INSENSITIVE);
        Matcher matcher = LastName.matcher(lastname);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("match found");
        } else {
            System.out.println("match not found");
        }
        return lastname;
    }
    public static String validEmail(String email){

        String Email ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean matchFind = email.matches(Email);
        if (matchFind){
            System.out.println("match found");
        }
        else {
            System.out.println("match not found");
        }
        return email;
    }

    public static String validPhoneNum(String phoneNo){

        String p = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(p);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3){
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not Found");
        }
        return phoneNo;
    }

    public static String validPassWord(String p) {

        String password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern p1 = Pattern.compile(password);
        Matcher m1 = p1.matcher(p);
        boolean matchFound = m1.matches();
        if (matchFound){
            System.out.println("match Found");
        }
        else {
            System.out.println("Match Not Found");
        }

        return p;
    }



}

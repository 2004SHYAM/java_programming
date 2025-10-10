
import java.util.Random;
import java.util.Scanner;

public class loginpage {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    private String userName;
    private String passWord;
    private long mobileNumber;
    static int attempt = 0;

    public loginpage(String userName, long mobileNumber) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return this.passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public void isLoginPage(String expUserName, String expPassWord) {
        while (attempt < 3) {
            if (this.userName.equals(expUserName) && this.passWord.equals(expPassWord)) {
                System.out.println("Login Successful");
                return;
            } else {
                attempt++;
                System.err.println("Invalid password or Username and you have only remaining attempts: " + (3 - attempt));
                System.out.println("Do you want to login again? Enter yes or no");
                String response = sc.next();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Enter the Username");
                    String userName = sc.next();
                    System.out.println("Enter the Password");
                    String password = sc.next();
                    isLoginPage(userName, password);
                    return;
                } else {
                    System.exit(0);
                }
            }
        }

        System.out.println("You have entered the password wrong three times");
        System.out.println("Do you want to reset password? Enter yes or no");
        String resetresponse = sc.next();
        if (resetresponse.equalsIgnoreCase("yes")) {
            System.out.println("Please enter the registered Number");
            long enteredNumber = sc.nextLong();
            if (enteredNumber == this.mobileNumber) {
                int generatedOtp = otp();
                System.out.println("Please check your registered mobile number and enter the OTP: " + generatedOtp);
                System.out.println("Enter OTP");
                int Otp = sc.nextInt();
                if (generatedOtp == Otp) {
                    System.out.println("Enter the new password");
                    String newPassword = sc.next();
                    setPassword(newPassword);
                    System.out.println("You have created a new Password Successfully");
                } else {
                    System.out.println("You have entered wrong OTP");
                }
            } else {
                System.out.println("Entered number does not match registered mobile number");
            }
        } else {
            System.out.println("Thank you");
        }
    }

    public void registerPage() {
        System.out.println("Register Successfully");
        System.out.println("Please login");
        System.out.println("Enter Username and Password");
        isLoginPage(sc.next(), sc.next());
    }

    public static int otp() {
        return 1000 + random.nextInt(9000);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the login page");
        System.out.println("Please enter the username");
        String userName = sc.next();
        System.out.println("Enter the phone number");
        long mobileNumber = sc.nextLong();
        loginpage login = new loginpage(userName, mobileNumber);
        System.out.println("Enter the password");
        String passWord = sc.next();
        login.setPassword(passWord);
        login.registerPage();
    }
}

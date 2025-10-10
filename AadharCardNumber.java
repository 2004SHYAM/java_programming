import java.util.Random;

public class AadharCardNumber {

    final long aadharnumber;
    
    AadharCardNumber(long aadharNumber)
    {
        this.aadharnumber = aadharNumber;
    }
    public void displayNumber()
    {
        System.out.print(aadharnumber);
    }
    public static void main(String[] args) {
        Random random=new Random();

        long generatedNumber=Long.parseLong(random.nextInt(90000000)+""+random.nextInt(9000));
        AadharCardNumber aadhar=new AadharCardNumber(generatedNumber);
        aadhar.displayNumber();


    }

}

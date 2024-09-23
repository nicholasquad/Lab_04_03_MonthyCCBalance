import javax.xml.stream.events.StartDocument;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        double CreditCardBalance = 5000.00;
        double interestRate = 0.17;
        double monthOne = 0;
        double monthTwo = 0;

        monthOne = CreditCardBalance * interestRate;
        monthTwo = monthOne * 2;
        System.out.println("Your first month interest is " + monthOne);
        System.out.println("Your second month interest is " + monthTwo);




    }
}
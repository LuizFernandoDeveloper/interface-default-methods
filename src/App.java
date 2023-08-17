import java.util.Locale;
import java.util.Scanner;
import entities.InterestService;
import entities.UsaInterestService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("months: ");
        int months = sc.nextInt();

        InterestService interestService = new UsaInterestService(1.0);
        double payment = interestService.payment(amount, months);
        System.out.println("Payment after: "+ months + " months: ");
        System.out.println(String.format("%.2f" , payment));

        sc.close();
    }
}

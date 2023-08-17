import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("months: ");
        int months = sc.nextInt();

        BrazilInterestService brazilInterestService = new BrazilInterestService(2.0);
        double payment = brazilInterestService.payment(amount, months);

        System.out.println("Payment after: "+ months + " months: ");
        System.out.println(String.format("%.2f" , payment));

        sc.close();
    }
}

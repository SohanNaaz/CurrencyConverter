import java.util.Scanner;

public class CurrencyConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. EUR to INR");
        System.out.println("4. INR to EUR");
        System.out.print("Enter your choice (1, 2, 3, or 4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: ");
                double usd = scanner.nextDouble();
                double rupeeFromUsd = usdToRupee(usd);
                System.out.println("Converted amount in INR: " + rupeeFromUsd);
                break;

            case 2:
                System.out.print("Enter the amount in INR: ");
                double inrToUsd = scanner.nextDouble();
                double usdFromRupee = rupeeToUsd(inrToUsd);
                System.out.println("Converted amount in USD: " + usdFromRupee);
                break;

            case 3:
                System.out.print("Enter the amount in EUR: ");
                double euro = scanner.nextDouble();
                double rupeeFromEuro = euroToRupee(euro);
                System.out.println("Converted amount in INR: " + rupeeFromEuro);
                break;

            case 4:
                System.out.print("Enter the amount in INR: ");
                double inrToEuro = scanner.nextDouble();
                double euroFromRupee = rupeeToEuro(inrToEuro);
                System.out.println("Converted amount in EUR: " + euroFromRupee);
                break;

            default:
                System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
                break;
        }

        scanner.close();
    }

    public static double usdToRupee(double usd) {
        return usd * 83.47; // Exchange rate USD to INR
    }

    public static double rupeeToUsd(double rupee) {
        return rupee * 0.0119804; // Exchange rate INR to USD
    }

    public static double euroToRupee(double euro) {
        return euro * 89.10; // Exchange rate EUR to INR
    }

    public static double rupeeToEuro(double rupee) {
        return rupee * 0.0113; // Exchange rate INR to EUR
    }
}

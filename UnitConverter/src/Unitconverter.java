import java.util.Scanner;

public class Unitconverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Simple Unit Converter! =====");
        System.out.println("1... Kilometers to Miles");
        System.out.println("2... Miles to Kilometers");
        System.out.println("3... Celsius to Fahrenheit");
        System.out.println("4... Fahrenheit to Celsius");

        System.out.print("Choose option 1-4: ");
        int option = sc.nextInt();

        System.out.print("Enter value to convert: ");
        double value = sc.nextDouble();
        double result = 0;

        switch(option) {
            case 1: // Km to miles...
                result = value * 0.621371;
                System.out.println(value + " km = " + result + " miles");
                break;
            case 2: // Miles to km...
                result = value / 0.621371;
                System.out.println(value + " miles = " + result + " km");
                break;
            case 3: // Celsius to fahrenheit...
                result = (value * 9/5) + 32;
                System.out.println(value + "°C = " + result + "°F");
                break;
            case 4: // Fahrenheit to celsius...
                result = (value - 32) * 5/9;
                System.out.println(value + "°F = " + result + "°C");
                break;
            default:
                System.out.println("Invalid option :( , Please choose 1-4.");
        }
    }
}

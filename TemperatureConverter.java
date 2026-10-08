import java.util.Scanner;

public class TemperatureConverter {
    void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        if (input.hasNextDouble()) {
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println(fahrenheit);
        } else {
            System.out.println("Error: Please enter a valid temperature.");
        }

        input.close();
    }
}
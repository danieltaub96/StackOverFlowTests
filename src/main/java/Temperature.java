import java.util.Scanner;

import static java.lang.System.lineSeparator;

public class Temperature {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the temperature kind you willing to convert: ");

        // Getting a character and numerals input inserted by user.
        char Temp = scanner.next().charAt(0);

        System.out.print("Please enter the temperature value: ");
        final double degree = scanner.nextDouble();


        final double Division = 9.0 / 5.0;        //a=1.8
        final double Division2 = 5.0 / 9.0;       //b=0.55                       *taking the mathematical opertions and numbers of the Temperature conversions formula
        final double Num = 32;                  //x=32                         *and converting them to variables.
        final double Num2 = 273.15;             //z=273.15


        switch (Temp) {
            case 'C': {
                double celsius_to_fahrenheit = Division * degree + Num;                                                 //using the formula
                double celsius_to_kelvin = degree + Num2;

                System.out.println("C " + degree + lineSeparator()
                        + "F " + celsius_to_fahrenheit + lineSeparator()
                        + "K " + celsius_to_kelvin);
                break;
            }
            case 'F': {
                double fahrenheit_to_celsius = (Division2) * (degree - Num);                                              //using the formula
                double fahrenheit_to_kelvin = ((Division2) * (degree - Num) + Num2);

                System.out.println("F " + degree + lineSeparator()
                        + "C " + fahrenheit_to_celsius
                        + lineSeparator() + "k " + fahrenheit_to_kelvin);
                break;
            }
            case 'K': {
                double kelvin_to_celsius = degree - Num2;
                double kelvin_to_fahrenheit = ((Division) * (degree - Num2) + Num);                                         //using the formula
                System.out.println("K " + degree + lineSeparator()
                        + "C " + kelvin_to_celsius
                        + lineSeparator() + "F " + kelvin_to_fahrenheit);
                break;
            }
            default: {
                System.out.println("please enter the correct values: C/F/K");
            }
        }
    }
}
    
            
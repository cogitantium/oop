package exercises0.problem7;

import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input temperature value: ");
        double tempValue = scanner.nextDouble();
        System.out.print("Input unit of temperature: (f/c) ");
        char tempUnit = scanner.next().charAt(0);

        char oppositeUnit = (tempUnit == 'f') ? 'c' : 'f';
        System.out.println("Converting given temperature: " + tempValue + tempUnit + " to " + convertTemp(tempUnit, tempValue) + oppositeUnit);
    }

    public static double convertTemp(char unit, double value) {
        // from Fahrenheit to Celsius: first subtract 32, then multiply by 100/180
        // from Celsius to Fahrenheit: first multiply by 180/100, then add 32
        if (unit == 'f') return (value - 32) * 100 / 180;
        else if(unit == 'c') return (value * 180 / 100) + 32;
        else return 0;
    }
}

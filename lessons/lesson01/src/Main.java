import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String particle = "";
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //long int randomInt = Math.random(next int) % 99 + 1;

        System.out.println("Input feet to convert to meters");
        double feet = scan.nextDouble();
        double meters = meterConversion(feet);
        System.out.println(feet + " feet is " + meters + " meters ");

        System.out.println("Input char for vowel-detection");


        char letter = scan.next().charAt(0);
        if (!isVowel(letter)) particle = " not";
        System.out.println(letter + " is"+ particle + " a vowel.");

        System.out.println("Input temperature value for tempconv:");
        double value = scan.nextDouble();
        System.out.println("Input unit of temperature");
        char unit = scan.next().charAt(0);
        value = convertTemp(unit, value);
        System.out.println("Converting " + Character.toUpperCase(unit) + " to opposite unit: " + value);
    }

    public static double meterConversion(double feet) {
        return feet * 0.3048;
    }

    public static boolean isVowel(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'æ':
            case 'ø':
            case 'å': return true;
            default: return false;
        }
    }


    public static double convertTemp(char unit, double value) {
        // from Fahrenheit to Celsius: first subtract 32, then multiply by 100/180
        // from Celsius to Fahrenheit: first multiply by 180/100, then add 32
        if (unit == 'f') return (value - 32) * 100 / 180;
        else if(unit == 'c') return (value * 180 / 100) + 32;
        else return 0;
    }
}
package calculator;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class cli {
    Scanner inputScanner = new Scanner(System.in);


    private double firstComp;
    private double secondComp;
    //add, sub, mul, div
    private String operator;


    public cli(double firstComp, double secondComp, String operator) {
        this.firstComp = firstComp;
        this.secondComp = secondComp;
        this.operator = operator;
    }

    public double getFirstComp() {
        return firstComp;
    }

    public void setFirstComp(double firstComp) {
        this.firstComp = firstComp;
    }

    public double getSecondComp() {
        return secondComp;
    }

    public void setSecondComp(double secondComp) {
        this.secondComp = secondComp;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double inputComp() {
        return parseDouble(inputScanner.nextLine());
    }

    public String inputOperator() {
        return inputScanner.nextLine();
    }

    public boolean isAdd() {
        boolean value = equals(getOperator(), "add");
        if (equals(operator "add") return true;
        return false;
    }

}



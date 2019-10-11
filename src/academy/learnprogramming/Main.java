package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2019";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String numberAsString_ = "2019.125";
        System.out.println("numberAsString = " + numberAsString_);

        double number_ = Double.parseDouble(numberAsString_);
        System.out.println("number = " + number_);

        numberAsString_ += 1;
        number_ += 1;

        System.out.println("numberAsString = " + numberAsString_);
        System.out.println("number = " + number_);
    }
}

import java.util.Scanner;

class NumberSign {

    private String checkNumber(int number) {
        if (number > 0) {
            return "The number is positive.";
        } else if (number < 0) {
            return "The number is negative.";
        } else {
            return "The number is zero.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        NumberSignMethod obj = new NumberSignMethod();

        System.out.println(obj.checkNumber(number));
    }
}


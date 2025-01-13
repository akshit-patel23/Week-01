import java.util.Scanner;

public class HandShake {

    private int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        HandshakeCalculator calculator = new HandshakeCalculator();
        int maxHandshakes = calculator.calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of handshakes among " + numberOfStudents 
            + " students is " + maxHandshakes);
    }
}

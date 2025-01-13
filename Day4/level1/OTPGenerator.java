import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a random number between 100000 and 999999
    }

    // Method to generate 10 OTPs and save them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otpArray = new int[count];
        for (int i = 0; i < count; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            if (!otpSet.add(otp)) { // If add() returns false, a duplicate exists
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Number of OTPs to generate
        int otpCount = 10;

        // Generate 10 OTPs
        int[] otpArray = generateMultipleOTPs(otpCount);

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Check if OTPs are unique
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}

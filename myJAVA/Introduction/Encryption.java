package Introduction;
import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner Enter = new Scanner(System.in);
        System.out.print("Input your number : ");
        int Number = Enter.nextInt();
        if (Number < 100000000) {
            System.out.print("Your Encryption Code = ");
            do {
                int iDigitNumber = Number % 10;
                if (iDigitNumber % 2 == 0) {
                    System.out.print(iDigitNumber + 1);
                } else {
                    System.out.print(iDigitNumber - 1);
                }
                Number /= 10;
            } while (Number > 0);
        } else {
            System.out.println("Your Number it's too much.");
        }
    }
}

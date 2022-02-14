import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MIN_LENGTH = 6;

        String password = input.nextLine();

        if(password.length() < MIN_LENGTH) {
            System.out.println(MIN_LENGTH - password.length());
        }

    }
}

package kasyanl.kasyanlfinalproject.util.service.proccesor;

import java.io.InputStream;
import java.util.Scanner;

public class InputNumber {
    private final Scanner scanner;

    public InputNumber(InputStream in) {
        scanner = new Scanner(in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readNumber() {
        return Integer.parseInt(scanner.nextLine());
    }

    public double readDouble() {
        return Double.parseDouble(scanner.nextLine());
    }
}

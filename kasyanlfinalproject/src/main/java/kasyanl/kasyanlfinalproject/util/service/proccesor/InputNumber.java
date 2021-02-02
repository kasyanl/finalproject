package kasyanl.kasyanlfinalproject.util.service.proccesor;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputNumber {
    private final Scanner scanner;
    private final PrintStream out;

    public InputNumber(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
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

package kasyanl.kasyanlfinalproject.util.service.proccesor;

import java.util.Scanner;

public class InputNumberService {

   static Scanner on = new Scanner(System.in);

    public static String readString() {
        return on.nextLine();
    }

    public static int readNumber() {
        return Integer.parseInt(on.nextLine());
    }

    public static double readDouble() {
        return Double.parseDouble(on.nextLine());
    }


}

package kasyanl.kasyanlfinalproject.util.service;

import java.util.Scanner;

public class ImputNumberService {

   static Scanner on = new Scanner(System.in);

    public static String readString(String text) {
        System.out.println(text);
        return on.nextLine();
    }

    public static int readNumber(String text) {
        System.out.println(text);
        return Integer.parseInt(on.nextLine());
    }

    public static double readDouble(String text) {
        System.out.println(text);
        return Double.parseDouble(on.nextLine());
    }

}

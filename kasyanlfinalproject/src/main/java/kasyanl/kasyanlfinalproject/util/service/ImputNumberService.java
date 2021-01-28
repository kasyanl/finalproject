package kasyanl.kasyanlfinalproject.util.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ImputNumberService {

    static final Logger log = LoggerFactory.getLogger(ImputNumberService.class);
    static Scanner on = new Scanner(System.in);

    public static String readString(String text) {
        log.info("{}",text);
        return on.nextLine();
    }

    public static int readNumber(String text) {
        log.info("{}",text);
        return Integer.parseInt(on.nextLine());
    }

    public static double readDouble(String text) {
        log.info("{}",text);
        return Double.parseDouble(on.nextLine());
    }


}

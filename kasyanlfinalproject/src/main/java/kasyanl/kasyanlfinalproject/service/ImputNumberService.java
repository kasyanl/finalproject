package kasyanl.kasyanlfinalproject.service;

import kasyanl.kasyanlfinalproject.menu.StartMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ImputNumberService {
    private static final Scanner imput = new Scanner(System.in);
    final Logger log = LoggerFactory.getLogger(ImputNumberService.class);


    public String readString(String text) {
        log.info("{}",text);
        return imput.nextLine();
    }

    public int readNumber(String text) {
        log.info("{}",text);
        return Integer.parseInt(imput.nextLine());
    }

    public double readDouble(String text) {
        log.info("{}",text);
        return Double.parseDouble(imput.nextLine());
    }

    public long readLong(String text) {
        log.info("{}",text);
        return Long.parseLong(imput.nextLine());
    }
}

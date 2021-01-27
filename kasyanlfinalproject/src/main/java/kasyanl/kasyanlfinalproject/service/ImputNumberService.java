package kasyanl.kasyanlfinalproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ImputNumberService {


     Scanner imput = new Scanner(System.in);
    final Logger log = LoggerFactory.getLogger(ImputNumberService.class);


    public String readString(String text) {
        System.out.println(text);
        return imput.nextLine();
    }

    public int readNumber(String text) {
        System.out.println(text);
        return Integer.parseInt(imput.nextLine());
    }

    public double readDouble(String text) {
        System.out.println(text);
        return Double.parseDouble(imput.nextLine());
    }

    public long readLong(String text) {
        System.out.println(text);
        return Long.parseLong(imput.nextLine());
    }
}

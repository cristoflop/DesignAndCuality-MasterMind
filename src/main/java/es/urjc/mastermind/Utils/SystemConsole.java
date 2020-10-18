package es.urjc.mastermind.Utils;

import java.util.Scanner;

public class SystemConsole {

    private static SystemConsole instance;
    private Scanner scanner;

    public static SystemConsole getInstance() {
        if (instance == null) {
            instance = new SystemConsole();
        }
        return instance;
    }

    private SystemConsole() {
        this.scanner = new Scanner(System.in);
    }

    public void print(String msg) {
        System.out.print(msg);
    }

    public void println(String msg) {
        System.out.println(msg);
    }

    public String readln(String msg) {
        System.out.print(msg);
        return this.scanner.nextLine();
    }

}

package app;

import app.controller.AppController;

import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {
        runDevice(getDevice());
    }

    private static int getDevice() {
        System.out.print("""
                Press:
                1 - if a Device A (returns the result by multiplying parameters).
                2 - if a Device B (returns the result by adding parameters and doubling the sum).
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runDevice(int device) {
        switch (device) {
            case 1 -> {
                AppController controller = new AppController();
                controller.getDeviceA();
            }
            case 2 -> {
                AppController controller = new AppController();
                controller.getDeviceB();
            }
            default -> System.out.println("No such device");
        }
    }
}

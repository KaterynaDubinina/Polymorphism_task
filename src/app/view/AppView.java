package app.view;

import app.entity.Income;

import java.util.Scanner;

public class AppView {

    public Income getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int a: ");
        int a = scanner.nextInt();
        System.out.print("Enter int b: ");
        int b = scanner.nextInt();
        return new Income(a, b);
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

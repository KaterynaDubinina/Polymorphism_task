package app.controller;

import app.entity.Income;
import app.model.DeviceModel;
import app.model.DeviceModelA;
import app.model.DeviceModelB;
import app.view.AppView;

public class AppController {

    public void getDeviceA() {
        AppView view = new AppView();
        DeviceModel modelA = new DeviceModelA();

        Income income = view.getData();
        int a = income.getA();
        int b = income.getB();
        String result = String.valueOf(modelA.calcMultiplication(a, b));

        String output = "\nYour result is: " + result;
        view.getOutput(output);
    }

    public void getDeviceB() {
        AppView view = new AppView();
        DeviceModel modelB = new DeviceModelB();

        Income income = view.getData();
        int a = income.getA();
        int b = income.getB();
        String result = String.valueOf(modelB.calcMultiplication(a, b));

        String output = "\nYour result is: " + result;
        view.getOutput(output);
    }
}

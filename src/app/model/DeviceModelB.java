package app.model;

public class DeviceModelB extends DeviceModel{
   private static final int CONSTANT = 2;

    @Override
    int calcSum(int a, int b) {
        return a + b;
    }
    @Override
    public int calcMultiplication(int a, int b) {
        return calcSum(a, b) * CONSTANT;
    }
}


package notsmalldecimal;

public class MyDouble {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public MyDouble(double value) {
        this.value = value;
    }


    public MyDouble plus(MyDouble otherThingToAdd) {
        double result = this.getValue() + otherThingToAdd.getValue();

        MyDouble finalResult = new MyDouble(result);

        return finalResult;
    }

    public MyDouble add(MyDouble lhs, MyDouble rhs) {
        double result = lhs.getValue() + rhs.getValue();

        MyDouble finalResult = new MyDouble(result);

        return finalResult;
    }
}

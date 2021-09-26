public interface UnaryFunction {
    double exec(double argument);
}

class Doubler implements UnaryFunction {
    public double exec(double argument) {
        return argument*2;
    }
}

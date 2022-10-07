public class MathOperations {
    double a;
    double b;


    public MathOperations(double a, double b) {
        this.a = a;
        this.b = b;
        System.out.println("a + b = " + Math.round(summarize(this.a, this.b )));
        System.out.println("a - b = " + Math.round(subtract(this.a, this.b )));
        System.out.println("a * b = " + Math.round(multiply(this.a, this.b )));
        System.out.println("a / b = " + Math.round(divide(this.a, this.b )));
    }

    public double summarize(double a, double b){
        double result = a + b;
        return result;
    }

    public double subtract(double a, double b){
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b){
        double result = a * b;
        return result;
    }

    public double divide(double a, double b){
        double result = a / b;
        return result;
    }

}

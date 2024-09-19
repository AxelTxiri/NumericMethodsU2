public class NewtonRaphsonModified {
    public double root(Function function, Function derivative, Function derivativeD, double xi, int n, double tolError) {
        double r = Double.NaN;
        double x = 0;
        int k = 0;
        double error = Double.MAX_VALUE;

        System.out.printf("%-10s %-10s %-15s %-10s %-10s %-10s %-10s\n", "Iter", "xi", "f(xi)", "f'(xi)", "f''(xi)", "xi+1", "Error");

        while (error > tolError && k < n) {
            x = xi - ( (function.evaluate(xi) * derivative.evaluate(xi) ) / ((Math.pow(derivative.evaluate(xi), 2) - (function.evaluate(xi) * derivativeD.evaluate(xi)))) );

            if (k >= 0) {
                error = Math.abs((x - xi) / x) * 100;
                System.out.printf("%-10d %-10.6f %-15.8f %-10.6f %-10.6f %-10.6f %-10.6f\n", k, xi, function.evaluate(xi), derivative.evaluate(xi), derivativeD.evaluate(xi), x, error);
            }

            xi = x;

            k++;
        }

        if (k < n)
            r = xi;

        System.out.println();

        return r;
    }
}
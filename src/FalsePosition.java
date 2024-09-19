public class FalsePosition {
    public double root(Function function, double x0, double x1, int n, double tolError) {
        double r = Double.NaN;
        double x = x0;
        double xPrev = 0;
        int k = 0;
        double error = Double.MAX_VALUE;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Iter", "x0", "x1", "f(x0)", "f(x1)", "x", "f(x)", "Error");

        while (error > tolError && k < n) {
            xPrev = x;

            x = (x0 * function.evaluate(x1) - x1 * function.evaluate(x0)) / (function.evaluate(x1) - function.evaluate(x0));

            if (k > 0) {
                error = Math.abs((x - xPrev) / x) * 100;
                System.out.printf("%-10d %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f\n", k, x0, x1, function.evaluate(x0), function.evaluate(x1), x, function.evaluate(x), error);
            }else{
                System.out.printf("%-10d %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f %-10.6f\n", k, x0, x1, function.evaluate(x0), function.evaluate(x1), x, function.evaluate(x),Double.NaN);
            }

            if (function.evaluate(x0) * function.evaluate(x) < 0)
                x1 = x;
            else
                x0 = x;

            k++;
        }

        if (k < n)
            r = x;

        System.out.println();

        return r;
    }
}


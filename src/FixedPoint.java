public class FixedPoint {
    public double root(Function function, Function g, double xi, int n, double tolError) {
        double r = Double.NaN;
        double x = 0;
        int k = 0;
        double error = Double.MAX_VALUE;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s \n", "Iter", "xi", "f(xi)", "xi+1", "Error");

        while (error > tolError && k < n) {
            x = xi;

            x = g.evaluate(x);

            if (k > 0) {
                error = Math.abs((x - xi) / x) * 100;
                System.out.printf("%-10d %-10.6f %-10.8f %-10.6f %-10.6f \n", k, xi, function.evaluate(xi), x, error);
            } else {
                System.out.printf("%-10d %-10.6f %-10.8f %-10.6f %-10.6f\n", k, xi, function.evaluate(xi), x, Double.NaN);
            }

            xi = x;

            k++;
        }

        if (k < n)
            r = x;

        System.out.println();

        return r;
    }
}

